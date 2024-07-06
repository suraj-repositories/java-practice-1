package Bro_codes_java_reloaded;

import java.lang.Math;

public class Sh_04_Math_Class {
	public static void main(String[] args) {
		
		double x = 3.17;
		double y = -5.25;
		
		// bigger value
		double z = Math.max(x, y);
		System.out.println(z);
		
		// smaller value
		double z1 = Math.min(x, y);
		System.out.println(z1);
		
		// absolute value no negative
		double z2 = Math.abs(y);
		System.out.println(z2);
		
		// squre root of any value
		double z3 = Math.sqrt(x);
		System.out.println(z3);
		
		// round value -> without decimal
		double z4 = Math.round(x);
		System.out.println(z4);
		
		// celing -> example - 3.12=4 | 5.26=6 | 5.99=6
		double z5 = Math.ceil(x);
		System.out.println(z5);
		
		// flour -> example = 3.12=3 | 5.26=5 | 5.99=5
		double z6 = Math.floor(x);
		System.out.println(z6);
		
	}
}
