package company_package;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_Practice_Java_TimeDate_Formatter {
	public static void main(String[] args) {
		System.out.println("Formatter Class to create your favourate date time format : ");
		
		LocalDateTime dt = LocalDateTime.now();// this is a date
		System.out.println(dt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");// this is the format
		String myDate = dt.format(dtf);// creating Date string using date and format
		System.out.println("DATE : "+myDate);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm a");// this is the format
		String myDate2 = dt.format(dtf2);// creating Date string using date and format
		System.out.println("DATE : "+myDate2);
	 
		// java documentation make a best page for date & time
	}
}