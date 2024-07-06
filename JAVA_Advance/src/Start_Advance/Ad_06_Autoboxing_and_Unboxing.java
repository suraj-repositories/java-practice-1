package Start_Advance;

// Autoboxing : int to Integer		 || premitive data type to coressponding wrapper class
// AutoUnboxing/unboxing : Integer to int 

public class Ad_06_Autoboxing_and_Unboxing {

	public static void main(String[] args) {
		
		int i = 10;
		
		// Autobox
		Integer iObj = Integer.valueOf(i);
		System.out.println("value of Integer obj : " + iObj);

		// auto-unbox 
		int i1 = iObj;
		System.out.println("value of i1 : " + i1);
		
		// Autobox 
//		char x = 'a';
//		Character charObj = Character.valueOf(x);
		
//						OR
		
		Character charObj = 'a';
		
		// Auto unbox
		char ch = charObj;
		System.out.println("Value of ch : " + ch);
		System.out.println("value of charObj : "+ charObj);
		
		
		
	}

}
