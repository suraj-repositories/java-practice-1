		// Topic : Intrinsic Locks/moditor lock and Synchronization
package Start_Advance;

class MyThread1 extends Thread {
	MathUtils mu;
	
	public MyThread1(MathUtils mu) {
		this.mu = mu;
	}
	
	@Override
	public void run() {
		try {
			mu.getMultiples(2);
		}
		catch(Exception e) {
			System.out.println("Exception rised : " + e);
		}
	}
}

class MyThread2 implements Runnable{
	MathUtils mu;
	
	public MyThread2(MathUtils mu) {
		this.mu = mu;
	}
	
	@Override
	public void run() {
		
		try {
			mu.getMultiples(3);
		}
		catch(Exception e) {
			System.out.println("Exception rised : " + e);
		}
		
	}
	
}

class MathUtils {
	// synchronized keyword is used lock the method as it is oquepi to a thread
	synchronized void getMultiples(int n) {			// when you remove the "synchronized" keyword threads are start running simulatually
													// when using this it is oquepi to a thread and currently unavailable for another thread
		// synchronized (this) {
		for(int i = 1 ; i <= 5 ; i++ ) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
		
//		ANOTHER WAY TO SYNCRONIZE : Use this for a specific block of code which make problem in your openion
	/*	
		 synchronized (this) {
				for(int i = 1 ; i <= 5 ; i++ ) {
					System.out.println(n * i);
					try {
						Thread.sleep(400);
					}
					catch(Exception e) {
						System.out.println(e);
					}
				}
		 }
	*/ 
		 
	}
}

public class Ad_05_ThreadSynchronization {

	
	
	public static void main(String[] args) {
		
		MathUtils obj = new MathUtils();
		
		MyThread1 t1 = new MyThread1(obj);
		Thread t2 =  new Thread(new MyThread2(obj));
		
		t1.start();
		t2.start();
		
		
	}

}
