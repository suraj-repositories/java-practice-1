
		// Binary Search Tree = A tree data structure, where each node is greater than it's left child,
		//					    but less than it's right.
		//					 
		//			Benifits : easy to locate a node when they are in this order
		//		
		//			Time Complexity : best case O(log n)
		//						 	  Worst case O(n)
		//						  
		//			Space Complexity : O(n)

package Data_Structures_BroCodes;

class MyNode{
	int data;
	MyNode left;
	MyNode right;
	
	public MyNode(int data) {
		this.data = data;
	}
}
class BinarySearchTree{
	MyNode root;
	public void insert(MyNode node) {
		
		root = insertHelper(root, node);
	}
	private MyNode insertHelper(MyNode root, MyNode node) {
		int data = node.data;
		
		if(root == null) {
			root = node;
			return root;
		}
		else if(data < root.data) {
			root.left = insertHelper(root.left, node);
		}
		else {
			root.right = insertHelper(root.right, node);
		}
		return root;
	}
	public void display() {
		displayHelper(root);
	}
	private void displayHelper(MyNode root) {
		if(root != null) {
			displayHelper(root.left);
			System.out.println(root.data);
			displayHelper(root.right);
		}
	}
	public boolean search(int data) {
		return searchHelper(root, data);
	}
	public boolean searchHelper(MyNode root, int data) {
		if(root == null) {
			return false;
		}
		else if(root.data == data) {
			return true;
		}
		else if(root.data > data) {
			return searchHelper(root.left, data);
		}
		else {
			return searchHelper(root.right, data);
		}

	}
	public void remove(int data) {
		
		if(search(data)) {
			removeHelper(root, data);
		}
		else {
			System.out.println(data + " could not be found");
		}
	}
	public MyNode removeHelper(MyNode root , int data) {
		if(root == null) {
			return root;
		}
		else if(data < root.data) {
			root.left = removeHelper(root.left, data);
		}
		else if(data > root.data) {
			root.right = removeHelper(root.right,data);
		}
		else {		// node found
			if(root.left == null && root.right == null) {
				root = null;
			}
			else if(root.right != null) {
				root.data = successor(root);
				root.right = removeHelper(root.right, root.data);
			}
			else {  // find a predecessor ot replace this node
				root.data = predecessor(root);
				root.left = removeHelper(root.left, root.data);
			}
		}
		return root;
	}
	private int successor(MyNode root) { // find the least value below the right child of this root data
		root = root.right;
		while(root.left != null) {
			root = root.left;
		}
		return root.data;
	}
	private int predecessor(MyNode root) {
		root = root.left;
		while(root.right != null) {
			root = root.right;
		}
		return root.data;
	}
}

public class DS_22_BinarySearchTree {
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		
		tree.insert(new MyNode(5));
		tree.insert(new MyNode(1));
		tree.insert(new MyNode(3));
		tree.insert(new MyNode(4));
		tree.insert(new MyNode(6));
		tree.insert(new MyNode(7));
		tree.insert(new MyNode(8));
		tree.insert(new MyNode(7));
	
		// System.out.println(tree.search(0));
		// System.out.println(tree.search(4));
		
//		tree.remove(0);
		tree.remove(4);
		
		
		
		tree.display();
	}
} 


