package company_package;
//both are execute for same priority


class Bullet1 implements Runnable{
	public void run() {
		while(true) {
		System.out.println("....I am working....");
		System.out.println("....................");
		}
	}
}
class Bullet2 implements Runnable{
	public void run(){
		while(true) {
		System.out.println("----I am watching tv----");
		System.out.println("------------------------");
		}
	}
}

public class Java_practice_thread_RunableInterface {
	public static void main(String[] args) {
		
		System.out.println("_____ output ______");
		
		Bullet1 b1 = new Bullet1();
		Thread gun1 = new Thread(b1);
		
		Bullet2 b2 = new Bullet2();
		Thread gun2 = new Thread(b2);
		
//		b1.start();			// they throws error
//		b1.start();
		
		gun1.start();
		gun2.start();
		
		
	}
}
