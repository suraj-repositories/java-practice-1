package company_package;

class Mythread1 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("This is thread 1");
		}
	}
}

class Mythread2 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("This is thread 2");
		}
	}
}

public class Java_practice_thread_methods_try_catch {

	public static void main(String[] args) {
		
		
		
		Mythread1 th1=new Mythread1();
		Mythread2 th2=new Mythread2();

		// here both thread start at the same time - cpu allocated to both 
	/*  th1.start();
		th2.start();
	*/	
		
		// th1 execute first
		th1.start();
		try{							// trying to run the code
			th1.join();
		}
		catch(Exception e) {			// if it throws any exception the inner code will execute - it catches the exception
			System.out.println("this is an exception massage or code");
		}
		
		// th2 start when the th1 finished 
		th2.start();
		
		
		
	}
}
