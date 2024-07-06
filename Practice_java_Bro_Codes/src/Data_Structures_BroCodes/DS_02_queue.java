package Data_Structures_BroCodes;

import java.util.LinkedList;
import java.util.Queue;

public class DS_02_queue {

	public static void main(String[] args) {

		//*******************************************************************************************
		// Queue = FIFO data structure. first in first out (ex. A line of people)
		//		   A collection designed for holding elements prior to processing
		// 		   Linear data structure
		
		// 		add	= enqueue, offer()
		// 		remove = dequeue, poll()

		//*******************************************************************************************
		
//		Queue<String> queue = new Queue<String>();		// we can not create the instance of queue bacause it is an interface 
		Queue<String> queue = new LinkedList<String>();	
		
		queue.offer("shubham");		// according to documentation it is more useful than classic enqueue()
		queue.offer("suraj");		// because they do not throws any type of exceptions
		queue.offer("tushar");		// if we cross overflow it will not throw exceptions
		queue.offer("Adarsh");
		
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.contains("suraj"));  		// is queue contains the value
		
		queue.poll();// better than dequeue because they do not throws any type of exceptions
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();		// if we cross underflow it will not throw exceptions
		
		System.out.println(queue);
		
		
		// WHERE ARE QUEUES USEFUL ?
		//1. keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues , Breadth-first-search
		
		
	}

}
