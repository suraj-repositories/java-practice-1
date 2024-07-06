package Data_Structures_BroCodes;

import java.util.LinkedList;

public class DS_04_LinkedList {

	public static void main(String[] args) {

		/* LinkedList = stores Nodes in 2 parts (data + address)
					 	Nodes are in non-consecutive memory location
					 	Elements are linked using pointers
					 
					-> * singly linked list 
					-> * doubly linked list
		
			advantages ------------
			1. Dynamic data stucture (allocates needed memory while running)
			2. Insertion and Deletion of Nodes is easy. O(1)
			3. No/Low memory waste
			
			disadvantages-------------
			1.Greater memory usage (additional pointer)
			2. No random access of elements (no index[i])
			3. Accessing/searching elements in more time consuming . O(n)
		
			uses???
			1. implement Stacks/ Queues
			2. GPS navigation
			3. music playlist
		*/
			
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
		linkedList.push("A");		// we can treat linked list as a stack and queue as well we ues array
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("E");
		linkedList.pop();
		*/
		
		linkedList.offer("A");		// useing as a queue
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("F");
//		linkedList.poll();
		
		linkedList.add(4,"E");		// add element at certain index
		linkedList.remove("F");		// remove any element
		
		System.out.println(linkedList.indexOf("D"));
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		linkedList.addFirst("0");
		linkedList.addLast("G");
		String first = linkedList.removeFirst();
		String last  = linkedList.removeLast();
		
		System.out.println(first +" "+ last);
		
		System.out.println(linkedList);
	}

}
