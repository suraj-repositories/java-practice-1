package Bro_codes_java_reloaded;

import java.util.ArrayList;

public class Sh_08_For_each_loop {
	public static void main(String[] args) {
		
		// for-each = traversing technique to iterate through the elements in an array/collection
		//				less steps , more readable
		// 				less flexible
		
		
//		String [] animals = {"cat","dog","rat","bird"};
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("birds");
		
	//for-each string index in animals
		for(String i : animals) {
			System.out.println(i);
		}
		
	}
}
