package company_package;
// this is very big topic for more detail go to documentation of java

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Java_Practice_Gregorian_Calendar {
	public static void main(String[] args) {
		System.out.println("--Gregorian Calendar--");
		
		GregorianCalendar gc = new GregorianCalendar();  // this is a concrete class 
		System.out.println(gc.isLeapYear(2023));
		
		
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[3]);
		System.out.println(TimeZone.getAvailableIDs()[4]);
		
		System.out.println(TimeZone.getDefault());
		System.out.println(gc.getTimeZone().getID());
		
		
	}
}