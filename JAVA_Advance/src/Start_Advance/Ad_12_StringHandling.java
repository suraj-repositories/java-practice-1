package Start_Advance;

// some IMPORTANT method between those common methods

import java.util.Arrays;

public class Ad_12_StringHandling {
	public static void main(String[] args) {
		
		String str1 = "John is studing ";
		String str2 = "In college";
		
		System.out.println(str1.length());

		String result = str1.concat(str2);
		System.out.println(result);
//		
//		String r = String.format("The name of student is "+"%s , and the age is %d. ", "Shubham", 21);
//		System.out.println(r);
//		
//		System.out.println(str1.charAt(5));		// remember index starts with zero
//		
//		if(str1.equals(str2)) {
//			System.out.println("both strings are same");
//		}
//		else {
//			System.out.println("both strings are not same");
//		}
//		
//		System.out.println(str1.indexOf('g'));
//		
//		System.out.println(str1.replace('s', 'r'));
//		
//		String[] arr = str1.split(" ");	// split mehthod retruns a string array
//		Arrays.asList(arr).forEach(s -> System.out.println(s)); // ALSO see the stream api
//		
//		String newStr1 = str1.substring(0, 4);
//		System.out.println(newStr1);
		
		
	}

}
