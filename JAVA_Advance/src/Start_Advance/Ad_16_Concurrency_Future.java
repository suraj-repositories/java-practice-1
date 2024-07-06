package Start_Advance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Ad_16_Concurrency_Future {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<String> future = executorService.submit(() -> {
			Thread.sleep(10000);
			return "COMPLETE";
		});
		
		try { 
			while(!future.isDone()) {
				System.out.println("Task still in progress.....");
				Thread.sleep(500);
				
			}
			
			System.out.println("Task Complete !");
			String result = future.get(3000,TimeUnit.MILLISECONDS);
			System.out.println(result);
			
			executorService.shutdown();
			
		}catch(InterruptedException | ExecutionException | TimeoutException e){
			future.cancel(true);
			future.isDone();
			future.isCancelled();
		}
	}

}
