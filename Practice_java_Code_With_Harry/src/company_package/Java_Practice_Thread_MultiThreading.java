 package company_package;
// it does not looks on eclipse  it work on cmd
 
//extending pre-defined thread class 
class Thread_1 extends Thread {
	@Override						
	public void run() {				// overriding pre-defined method of thread class 
		int i=1;
		while(true) {
		System.out.println("...Reading book...");
		System.out.println("------------------");
		i++;
		}
	}
}

// extending pre-defined thread class 
class Thread_2 extends Thread {
	 @Override                     
	public void run(){				// overriding pre-defined method of thread class 
		int i=1;
		while(true) {
		System.out.println("*** Watching tv ***");
		System.out.println("-------------------");
		i++;
		}
	}
}
 
public class Java_Practice_Thread_MultiThreading {
	public static void main(String[] args) {
	
		System.out.println("______starting thread______");
		
		Thread_1 th1=new Thread_1();
		Thread_2 th2=new Thread_2();
		
		th1.start();
		th2.start();
   	}
}