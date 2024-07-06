package company_package;

class PracticeA extends Thread{
	public void run(){
		for(int i=1;i<10000;i++) {
			System.out.println("this is thread 1 of practice A");
		}
	}
}

class PracticeB extends Thread{
	public void run(){
		for(int i=1;i<10000;i++) {
			System.out.println("this is thread 1 of practice B");
		}
	}
}

class PracticeB2 extends Thread{
	public void run(){
		for(int i=1;i<10000;i++) {
			try {
				Thread.sleep(200);          // sleeping the program for 200 mili seconds
				System.out.println("this is thread 1 of practice B2");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class PracticeC extends Thread{
	public void run(){
		for(int i=0;i<5;i++) {
			System.out.println("this is thread C ");
		}
	}
}

public class Practice_Set_13_ThreadsAndMethods {

	public static void main(String[] args) {
		
		// problem 1 
		
//		PracticeA th1=new PracticeA();
//		PracticeB th2 =new PracticeB();
//		th1.start();
//		th2.start();
		
		// problem 2
		
//		PracticeA th1 = new PracticeA();
//		PracticeB2 th2 = new PracticeB2();
//		th1.start();
//		th2.start();
		
		// problem 3
		
//		PracticeA th1 = new PracticeA();
//		PracticeB th2 = new PracticeB();
//		PracticeB2 th3 = new PracticeB2();
//		th1.setPriority(6);
//		th2.setPriority(9);
//		System.out.println(th1.getPriority());
//		System.out.println(th2.getPriority());
//		System.out.println(th3.getPriority());  // without setting priority --- mid-priority-5 is shown it is default priority
		
		// problem 4
		
//		PracticeC th4 = new PracticeC();
//		System.out.println(th4.getState());
//		th4.start();
//		System.out.println(th4.getState());
		
		 // problem 5 ?

//		System.out.println(Thread.currentThread().getState());     	// returns a reference to the currently executing thread object 
		
	}
}
