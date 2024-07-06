package company_package;
// there are too much methods in calendar class for more detail go to java documentation
import java.util.Calendar;


public class Java_Practice_Calendar_Class {
	public static void main(String[] args) {
		System.out.println("---CALENDAR CLASS---\n");
		
		 Calendar c1= Calendar.getInstance();				// calendar is a abstract class
		 System.out.println("calendar type : "+c1.getCalendarType());
		 System.out.println("Time Zone : "+c1.getTimeZone());
		 System.out.println("Time zone name : "+c1.getTimeZone().getDisplayName());
		 System.out.println("Time zone id : "+c1.getTimeZone().getID());
		
		 
		 // we can change the time zone
		
//		 Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
//		 System.out.println("calendar type : "+c2.getCalendarType());
//		 System.out.println("Time Zone : "+c2.getTimeZone());
//		 System.out.println("Time zone name : "+c2.getTimeZone().getDisplayName());
//		 System.out.println("Time zone id : "+c2.getTimeZone().getID());
		
		 // we can access the time by 
		 
//		 Calendar c = Calendar.getInstance();
//		 System.out.println(c.getTime());
//		 System.out.println(c.get(Calendar.SECOND));
//		 System.out.println(c.get(Calendar.MINUTE));
//		 System.out.println(c.get(Calendar.HOUR));
//		 System.out.println(c.get(Calendar.HOUR_OF_DAY));
//		 
//		 System.out.println("PRINTING TIME : ");
//		 System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE));
//		 System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		 
		 
	}
}