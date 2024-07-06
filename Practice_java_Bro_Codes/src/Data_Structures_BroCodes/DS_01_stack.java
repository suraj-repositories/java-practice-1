package Data_Structures_BroCodes;

import java.util.Stack;

public class DS_01_stack {

	public static void main(String[] args) {
		
		// stack = LIFO data structure. last in first out 
		// 			stores objects into a sort of "vertical tower"
		// 			push() to add to the top
		//			pop() to remove from the top

		
		Stack<String> stack = new Stack<String>();
		
//		System.out.println(stack.empty());
		
		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("DOOM");
		stack.push("Borderlands");
		stack.push("FFVII");

//		System.out.println(stack.empty());		// to check the stack is empty or not
//		System.out.println(stack); 				// to print the stack
		
		
//		stack.pop();			// to delete the top most element from the stack
//		stack.pop();
//		System.out.println(stack);
		
//		String myFavGame = stack.pop();			// it will return an string object 
//		System.out.println(stack); 				// above will return the deleted object so we do not use this to show the top most element we need to use the peek() 
//		System.out.println(myFavGame);
		
//		System.out.println(stack.peek());		// to see the topmost element of the stack
//		System.out.println(stack);
		
//		System.out.println(stack.search("FFVII")); 	// to search the element within the stack (index start with 1) 
//		System.out.println(stack.search("Skyrim"));
//		System.out.println(stack.search("pizza"));	// if search not found it return -1
		
		// USES OF STACK ?
		// 1. undo/redo features in text editors
		// 2. moving back/forward through browser history
		// 3. backtracking algorithms (maze ,file directories)
		// 4. calling function (call stack)
		
		
		
	}

}
