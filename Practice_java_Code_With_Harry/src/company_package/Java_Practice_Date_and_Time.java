package company_package;
import java.util.Date;
public class Java_Practice_Date_and_Time {

	public static void main(String[] args) {
		System.out.println("DATE & TIME");
		
		System.out.println("Milliseconds passed : "+System.currentTimeMillis()); 	// it calculate the milliseconds passed after 1970
		// by milliseconds you can calculate 
		System.out.println("Seconds passed : "+System.currentTimeMillis()/1000);		// it calculate the seconds passed after 1970
		System.out.println("Minute passed : "+System.currentTimeMillis()/1000/60);		// it calculate the minute passed after 1970
		System.out.println("Hours passed : "+System.currentTimeMillis()/1000/60/60);		// it calculate the hours passed after 1970
		System.out.println("Days passed : "+System.currentTimeMillis()/1000/60/60/24);		// it calculate the days passed after 1970
		System.out.println("Years passed : "+System.currentTimeMillis()/1000/60/60/24/365);		// it calculate the years passed after 1970
		
		
		
		// Is long safe for store milliseconds
//			 System.out.println(Long.MAX_VALUE);
//			 System.out.println(System.currentTimeMillis());
		// you can calculate difference max year possible	
		
		
	
		System.out.println("\n\n\n");
		// the date class 
		Date d= new Date();
		System.out.println(d);					// time passed in milliseconds
		// System.out.println(d.getSeconds());			
		// System.out.println(d.getMinutes());
		// System.out.println(d.getHours());
		// System.out.println(d.getDay());
		// System.out.println(d.getYear());		// it calculate year from 1900
		
	}
}
