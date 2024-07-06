package Bro_codes_java_reloaded;

class Greeting{
	public void welcome() {
		System.out.println("welcome");
	}
}

public class Sh_58_AnonymousInnerClass {
	public static void main(String[] args) {
		
		/*	anonymous class =  an inner class without a name 
						   only a single object is created from one 
						   The object may have "extras" or "changes"
						   and no need to create a separate innerclass
						   when it only need it once.
						   Helps us to avoid cluttering code with a class name
						   
						   Syntax is similar to constructor ,
						   except that there is also a class definition
						   within a block of code.
						   GREAT FOR LISTENERS
			*/			   
				
		Greeting greeting = new Greeting();
		
		Greeting greeting2 = new Greeting() {
			
			@Override
			public void welcome() {
				System.out.println("welcome shubham kumar");
			}
		};
		
		greeting.welcome();
		greeting2.welcome();
	}
}
