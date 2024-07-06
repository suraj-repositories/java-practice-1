package Data_Structures_BroCodes;

public class DS_14_recursion {

		// recursion : When a thing is defined in terms of itself. -wikipedia
		//				apply the result of a procedure, to a procedure.
		//				A recursive method calls itself. Can be substitute for iteration.
		//				Divide a problem into sub-problems of the same type as the original.
		//				Commonly used with advanced sorting algorithms and navigating trees
					
		//			Advantages : 
		//				* easier to read and write
		//				* easier to debug
					
		//			Disadvantages : 
		//				* sometimes slower
		//				* uses more memory
	
	
	public static void main(String[] args) {
	
		// simple method
		walk(5);

		// for factorial
		System.out.println(factorial(5));
		
		// for finding x^y
		System.out.println(power(2,8));		// 2^8
		
		
	}

	

		private static int power(int base, int power) {
			
			if(power < 1) return 1;			// base case
			return base * power(base , power-1);	// recursive case
			
		}



		private static void walk(int steps) {
			
			if(steps < 1) return;		// base case ; to stop the recrusive function
			System.out.println("you take a step.");
			walk(steps-1);	// recursive case 
			
		}
		
		
		
		
		private static int factorial(int value) {

			if(value < 1)  return 1;		// base case
			
			return value * factorial(value-1);		// recursive case
			
		}

}
