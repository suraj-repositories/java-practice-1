package Bro_codes_java_reloaded;

class Friends{
	String name;
	// static int numberOfFriends = 45;
	static int numberOfFriends;
	
	Friends(String name){
		this.name= name;
		numberOfFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberOfFriends+" friends");
	}
	
}

public class Sh_14_Static_Modifier {
	public static void main(String[] args)  {
		
		// System.out.println(Friends.numberOfFriends);
		
		Friends friend1 = new Friends("shubham");
		Friends friend2 = new Friends("suraj");
		Friends friend3 = new Friends("tushar");
		Friends friend4 = new Friends("sonu");

		
		System.out.println(Friends.numberOfFriends);
		
		Friends.displayFriends();
	}
}
