package Bro_codes_java_reloaded;
/*	Threads = A thread of execution in a program (kind of like a virtual CPU)
				The JVM allows an application to have multiple threads running concurrently
				Each thread can execute parts of you code in parallel with the main thread 
				Each thread has a priority.
				Threads with higher priority are executed in preference compared to thread with a lower priority

				The Java Virtual Machine continues to execute threads until either of the following occures
					1. The exit Method of class runtime has been called 
					2. All user threads have died

				When a JVM starts up, there is a thread which calls the main method
				This thread is called "main"

				Daemon thread is a low priority thread that runs in background to perform thaks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution

*/

class MyThread extends Thread{
	
	@Override
	public void run() {
		
		if(this.isDaemon()) {
			System.out.println("this is daemon thread is running");
		}
		else {
			System.out.println("This user thread is running");
		}
		
	}
}

public class Sh_68_Threads {
	public static void main(String[] args) throws InterruptedException {
		
		/* THREAD METHODS  */
		
//		System.out.println(Thread.activeCount());
//		Thread.currentThread().setName("MAINNNNN");
//		System.out.println(Thread.currentThread().getName());
		
//		Thread.currentThread().setPriority(4);				// 1 to 10 || 1 is lowest priority 10 is highest
//		System.out.println(Thread.currentThread().getPriority());
		
//		System.out.println(Thread.currentThread().isAlive());
		
		
		/* USING TIME DELAY ---- THREAD SLEEP  */
		
		/*
		for (int i=5; i>0 ;i--) {
			System.out.println(i);
			
				Thread.sleep(1000);	// let's sleep the thread for 1 seconds
			
		}
		System.out.println("done....");
		*/
		
		
		MyThread thread2 = new MyThread();
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
		thread2.start();
//		System.out.println(Thread.activeCount());
		
//		System.out.println(thread2.isAlive());
		
//		thread2.setName("2nd thread");
//		System.out.println(thread2.getName());
		
//		thread2.setPriority(9);	
//		System.out.println(thread2.getPriority());			// it defaul set the priority of his parent -- in this case main == but we set the pririy according to us
		
		
	}

}

