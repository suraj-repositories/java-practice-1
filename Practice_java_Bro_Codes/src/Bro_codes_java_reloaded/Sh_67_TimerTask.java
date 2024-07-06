package Bro_codes_java_reloaded;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Sh_67_TimerTask {
	public static void main(String[] args) {
		
		// Timer = A facility for threads to schedule tasks
		// 			for future execution in a background thread
				
		// TimerTask = A task that can be scheduled for one- time
		//				or repeated execution by a Timer
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			int counter = 10;
			@Override
			public void run() {
//				System.out.println("Task is complete :)");				
				
				if(counter>0) {
					System.out.println(counter +" seconds");
					counter = counter-1;
				}
				else {
					System.out.println("----------BOOM----------");
					timer.cancel();
				}
			}	
			
		};
		
		Calendar date = Calendar.getInstance();		// using calendar class to do event on specific time 
		date.set(Calendar.YEAR, 2023);
		date.set(Calendar.MONTH,Calendar.JULY);
		date.set(Calendar.DAY_OF_MONTH, 6);
		date.set(Calendar.HOUR_OF_DAY, 5);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
//		timer.schedule(task, 3000);  // first is task which we want and second is delay(after time pass) 
//		timer.schedule(task, date.getTime());			// task what we want to do | delay
		timer.scheduleAtFixedRate(task, 0, 1000);		// task what we want to do | delay to start | iteration (repeat time)
		
	}
}
