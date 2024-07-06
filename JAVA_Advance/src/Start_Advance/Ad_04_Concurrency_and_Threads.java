package Start_Advance;

class Thread1 extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("Thread 1 is runing");
		}
		catch(Exception e) {
			System.out.println("Exception rised : " + e);
		}
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		
		try {
			System.out.println("Thread 2 is running");
		}
		catch(Exception e) {
			System.out.println("Exception rised : " + e);
		}
		
	}
	
}

public class Ad_04_Concurrency_and_Threads {

	public static void main(String[] args) {
		
		int n = 10; // number of threads
		
		for(int i = 0;i < n; i++) {
			
			Thread1 t1 = new Thread1();
			t1.start();
			
			Thread t2 = new Thread(new Thread2());
			t2.start();
		}
	}

}
