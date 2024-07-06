package company_package;

// run multiple time to see the default priority

/*
 *  there are total three types of priority level
 * 1. default/min  - 1
 * 2. mid priority - 5
 * 3. max priority - 10
*/


class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		while(true){
			System.out.println("Thank you "+this.getName());
		}
	}
}

public class Java_practice_thread_priority_level {

	public static void main(String[] args) {
		
		
		// without using loop
//		MyThread t1=new MyThread("shubham");
//		MyThread t2=new MyThread("saurabh");
//		MyThread t3=new MyThread("anshu");
//		MyThread t4=new MyThread("vaibhav");
//		MyThread t5=new MyThread("praveen");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
		
		// after using loop
		
		MyThread t1=new MyThread("shubham");
		MyThread t2=new MyThread("saurabh");
		MyThread t3=new MyThread("anshu");
		MyThread t4=new MyThread("vaibhav (most Important)");
		MyThread t5=new MyThread("praveen");
		
		t4.setPriority(Thread.MAX_PRIORITY);       // set the priority of most important work to max 
		t1.setPriority(Thread.MIN_PRIORITY);			// setting all other priority to minimum
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
