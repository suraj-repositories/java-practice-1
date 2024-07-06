package company_package;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;


public class Java_Practice_Java_Time_Package {
	public static void main(String[] args) {
		
		System.out.println("Instant :");
		Instant i=Instant.now();
		System.out.println(i+"\n");
		
		System.out.println("Local Date Class :");
		LocalDate d=LocalDate.now();
		System.out.println(d+"\n");
		
		System.out.println("Local Time Class :");
		LocalTime t = LocalTime.now();
		System.out.println(t+"\n");
		
		System.out.println("Local Date Time Class :");
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt+"\n");
		
		System.out.println("Zoned Date Time class :");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt+"\n");
		
		
	}
}
