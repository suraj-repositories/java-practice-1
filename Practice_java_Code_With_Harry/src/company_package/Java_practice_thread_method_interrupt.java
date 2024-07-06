package company_package;

class NewThread1 extends Thread{
	public void run() {
		for(int i=0;i<5000;i++) {
			
			try {
				Thread.sleep(200);    // sleep the code for 200 mili-seconds than start the code   
				System.out.println("This is thread 1");
			}
			catch(InterruptedException e) {		// if it throws any exception the inner code will execute - it catches the exception
				e.printStackTrace();
			}
			
//			// you can also use this 
//			catch(Exception e) {		// if it throws any exception the inner code will execute - it catches the exception
//				System.out.println(e);
//			}
			
		}
	}
}

class NewThread2 extends Thread{
	public void run() {
		for(int i=0;i<50000;i++) {
			System.out.println("This is thread 2");
		}
	}
}


public class Java_practice_thread_method_interrupt {

	public static void main(String[] args) {
	
		NewThread1 th1=new NewThread1();
		NewThread2 th2 = new NewThread2();
		
		th1.start();
		// in this case th2 starts first and after 200 mili-second th1 starts
		th2.start();
		
		
	}
}
