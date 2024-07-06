package Bro_codes_java_reloaded;

import java.util.Random;

public class Sh_02_Random_Class {
	public static void main(String[] args) {
		
		Random random = new Random();
		
//		for Integer Random
		// int x = random.nextInt();		// it generate random number between integer max or min limit
		int x = random.nextInt(10);			// first 10 random number -> started with 0 >>> in this case it is between 0-9 \\\\\\
		
		
		
//		for Double Random
		double y = random.nextDouble();			
				
//		for Boolean Random
		boolean z= random.nextBoolean();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	
	}
}
