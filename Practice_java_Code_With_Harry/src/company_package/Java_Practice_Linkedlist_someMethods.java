package company_package;
import java.util.LinkedList;
// nearly all methods of array-list are useful in linked list


public class Java_Practice_Linkedlist_someMethods {
	public static void main(String[] args) {
		System.out.println("----Linked List and methods----");
		
		
		LinkedList<Integer>  l1 = new LinkedList<>();
		
		l1.add(45);
		l1.add(12);			// add is used to add element in the last of the linked list
		l1.add(45);
		l1.add(56);
		l1.add(69);
		
		l1.addLast(450);		// add element in the last of the linked list
		l1.addFirst(210);		// add element in the beginning
		
		
		// l1.remove(45);           // to remove any specific element 
		// l1.removeLast();			// remove element in the last of the list
		// l1.removeFirst();		// remove element in the first of the list
		// l1.set(0, 455);			// set element in any specific position
		// System.out.println(l1.size());		// check the size of linked list
		
		// l1.removeFirstOccurrence(69);   // i don't know it just remove the element 
		// l1.removeLastOccurrence(69);		// same as above
		// l1.clear();					// remove all element of linked-list
		
		
		// System.out.println(l1.get(2));		// return the n'th element
		// System.out.println(l1.getFirst());	// return the first element
		// System.out.println(l1.getLast()); 	// return the last element
		
		// System.out.println(l1.indexOf(56));	// return the index of given number
		// System.out.println(l1.lastIndexOf(45));	// return last index of the given element - if element is more than one available
		
		// System.out.println(l1.peek());		// first element of the list
		// System.out.println(l1.peekFirst());	// first element of the list
		// System.out.println(l1.peekLast());	// last element of the list
		
		// System.out.println(l1.poll());			// it return and delete the element
		// System.out.println(l1.pollFirst());		// it return and delete the first element
		// System.out.println(l1.pollLast());		// it return and delete the last element
		
		
		for(int i=0;i<l1.size();i++) {
			System.out.print(l1.get(i));
			System.out.print(", ");
		}
		
		
		
		
		
	}
}
