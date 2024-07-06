// looks a problem try to find it out

package company_package;

class Mythr extends Thread{
	public Mythr(String name) {
		super(name);
	}
	public void run() {
//		while (true) {
		System.out.println("I am a thread 1");
//		}
	}
}

class Mythr2 implements Runnable {
	public Mythr2(String name){
	
		System.out.println("constructor of the thread 2 class  :"+ name);
	}
	public void run() {
		System.out.println("this is thread 2");
	}
}

public class Java_practice_thread_constructor {
	public static void main(String[] args) {
		
//		System.out.println("______output_______");
//		// thread(string name)
//		
//		Mythr t1 = new Mythr("shubham");
//		t1.start();
//		
//		Mythr t2 = new Mythr("suraj...");
//		t2.start();
//		    
//		System.out.println("the id of the thread is  : "+ t1.getId());
//		System.out.println("the name of the thread is : "+ t1.getName());
//		
//		System.out.println("the id of the thread is  : "+t2.getId());
//		System.out.println("the name of the thread is : "+t2.getName());
//		
//		System.out.format("\n*\n*\n*\n*\n*\n");
//		
//		
//		// thread(Runnable,string name)
		
		
		Mythr2 t3 = new Mythr2("hub_of_the_servers");
		Thread sub = new Thread(t3);
		sub.start();
		
//		System.out.println("the id of the thread is  : "+sub.getId());
//		System.out.println("the name of the thread is : "+sub.getName());
		
		
	}
}
