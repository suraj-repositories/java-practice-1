package Data_Structures_BroCodes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DS_03_PriorityQueue {

	public static void main(String[] args) {

		// Priority Queue = A FIFO data structure that serve elements
		//					with the highest priorities first 
		//					before elements with lower priority
		
		
		/// STANDARD QUEUE
		/*
		Queue<Double> queue = new LinkedList<Double>();

		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.5);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		*/
		
		/// PRIORITY QUEUE
		Queue<Double> queue = new PriorityQueue<Double>();
//		Queue<Double> queue = new PriorityQueue<Double>(Collections.reverseOrder());		// to reverse the order 

		queue.offer(3.0);		// when working with numbers priority queue arrange the collection in increasing order
		queue.offer(2.5);		// in the case of string it arrange in alphabetical order
		queue.offer(4.5);
		queue.offer(1.5);
		queue.offer(2.0);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
