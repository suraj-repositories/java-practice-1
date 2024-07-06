package Bro_codes_java_reloaded;

public class Sh_52_MethodChaining {
	public static void main(String[] args) {
		
		// method chaining = a common syntax for invoking multiple methods calls in OOP
		//						condense code into less lines
		
		String name = "   Shubham";
		
		name = name.concat(" kumar");
		name = name.toUpperCase();
		name = name.trim();						// my advise trim before concat
		
//		name = name.concat(" kumar").toUpperCase().trim();
		
		System.out.println(name);
	}
}
