package Bro_codes_java_reloaded;
/* FIRST WAY TO CREATE THREAD */
class Mythread1 extends Thread{
	@Override
	public void run() {
		
		for(int i=10;i>0;i--) {
			System.out.println("Thread #1 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			System.out.println(1/0);		// if any thread throws exception other continue running indipendently
		}
		System.out.println("Thread #1 is finished");
		
	}
}

/* SECOND WAY TO CREATE THREAD --$$$ preffered */

class MyRunnable implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			System.out.println("Thread #2 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("Thread #2 is finished");
		
		
	}
	
}

public class Sh_69_Multithreading {
	public static void main(String[] args) throws InterruptedException {
		
		// multithreading = 	Process of executing multiple threads simultanesouly
		//						Helps maximum utilization of CPU
		//						threads are independent , they don't affect the execution of other threads.
		//						An exception in one thread will not interuupt other threads 
		//						useful for serving multiple clients, multiplayer games, or other mutually independent tasks

		// Create a subclass of thread
		Mythread1 thread1 =new Mythread1();
		
		//or
		
		// implement Runnable interface and pass instance as an argument to Thread()
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.setDaemon(true);		// in this case the program terminate when the main user threads complete their work | in this case it exit when main complete his work
		thread2.setDaemon(true);		// daemon thread are running in the background but they are no exist in compilar prospective
		
		thread1.start();
		thread1.join();			// main thread starts second thread after first thread has been finished
		thread1.join(3000);		// main thread starts second thread after the given delay
		thread2.start();
		
		System.out.println(1/0);			// if any thread throws exception other continue running indipendently
	}
	

}
