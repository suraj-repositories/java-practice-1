package company_package;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class Practice_Set_Chapter_15 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("---PRACTICE SET CHAPTER 15---\n");
		
		// question 1
		System.out.println("QUESTION 1");
		ArrayList<String> a=new ArrayList<>();
		a.add("student 1");
		a.add("student 2");
		a.add("student 3");
		a.add("student 4");
		a.add("student 5");
		a.add("student 6");
		a.add("student 7");
		a.add("student 8");
		a.add("student 9");
		a.add("student 10");
		for(Object o:a) {
			System.out.println(o);
		}
		
		// question 2
		System.out.println("\nQUESTION 2");
		Date d=new Date();
		System.out.println(d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds());
		
		// question 3
		System.out.println("\nQUESTION 2");
		// Calendar c=Calendar.getInstance();
		System.out.println(Calendar.HOUR_OF_DAY+":"+Calendar.MINUTE+":"+Calendar.SECOND);
		
		// question 4
		System.out.println("\nQUESTION 4");
		LocalDateTime t = LocalDateTime.now();
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("HH:mm:ss");
		String time=t.format(dt);
		System.out.println(time);
		
		// question 5
		System.out.println("\nQUESTION 5");
		HashSet<Integer> hs=new HashSet<>();
		hs.add(5);
		hs.add(5);
		hs.add(6);
		hs.add(5);
		hs.add(89);
		System.out.println(hs);
	}
}
