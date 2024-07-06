package Start_Advance;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// CONCURRNCY IS A VERY LARGE TOPIC

class Caller implements Executor{
	@Override
	public void execute(Runnable runnable) {
		runnable.run();
	}
	
}

public class Ad_15_ConcurrencyUtilities {

	public static void main(String[] args) {
		
		executorInvoke();
		executorServiceInvoke();

	}
	
	private static void executorInvoke() {
		Executor executor = new Caller();
		executor.execute(() -> {
			System.out.println("executor example");
		});
	}
	
	private static void executorServiceInvoke() {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.submit(() -> {
			System.out.println("execute service example");
		});
	}
	
}
