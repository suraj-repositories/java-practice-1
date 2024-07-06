package Bro_codes_java_reloaded;

class Food{
	String name ;
	Food(String name){
		this.name= name;
	}
}

public class Sh_12_ObjectArray {
	public static void main(String[] args) {
		
		
		// normal array definition
//		int[] number = new int[3];
//		char [] characters = new char[4];
//		String[] string = new String[5];
		
//		object array definition
		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburgar");
		Food food3 = new Food("hotdog");
		
		refrigerator[0] = food1;
		refrigerator[1]= food2;
		refrigerator[2] = food3;
		
		// Food[] refrigerator = {"food1","food2","food3"};				// this is same as above
		
		System.out.println(refrigerator[0]);			// it will show the address of the memory
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}
}
