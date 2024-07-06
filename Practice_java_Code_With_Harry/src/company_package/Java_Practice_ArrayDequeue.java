package company_package;
import java.util.ArrayDeque;
// go to java documentation for more detail


public class Java_Practice_ArrayDequeue {

	public static void main(String[] args){

		System.out.println("Array dequeue");
		
		
		ArrayDeque<Integer> ad1=new ArrayDeque<>();
		ad1.add(45);
		ad1.add(23);
		ad1.add(20);
		ad1.add(90);
		
		ad1.addLast(49);
		ad1.addFirst(89);
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
	}
}