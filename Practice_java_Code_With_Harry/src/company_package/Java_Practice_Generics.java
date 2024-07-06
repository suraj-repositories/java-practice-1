package company_package;
import java.util.ArrayList;
import java.util.Scanner;

public class Java_Practice_Generics {
	public static void main(String[] args) {
		ArrayList<Scanner> arr= new ArrayList<Scanner>();
		arr.add(new Scanner(System.in));
		arr.add(new Scanner(System.in));
		arr.add(new Scanner(System.in));
		
		System.out.println(arr.get(0));
	}
}
