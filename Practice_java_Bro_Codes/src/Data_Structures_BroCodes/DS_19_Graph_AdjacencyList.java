	/*	
		Adjacency List = An array/arraylist of linkedlists.
						 Each LinkedList has a unique node at the head
						 All adjacent height to that node are added to that node's linkedList
						 	
						 runtime complexity to check an Edge : O(v)
						 space Complexity : O(v + e)
						 
	*/
package Data_Structures_BroCodes;

import java.util.*;

class Node2{
	 
	char data;
	
	Node2(char data){
		this.data = data;
	
	}
}
class Graph2{
	
	ArrayList<LinkedList<Node2>> alist; 
	
	Graph2(){
		alist = new ArrayList<>();
	}
	// To add a new node in adjacency list 
	public void addNode(Node2 node) {	
		LinkedList<Node2> currentList = new LinkedList<>();
		currentList.add(node);
		alist.add(currentList);
	}
	
	// To add a new edge in adjacency list 
	public void addEdge(int src , int dst) {
		LinkedList<Node2> currentList = alist.get(src);
		Node2 dstNode = alist.get(dst).get(0);
		currentList.add(dstNode);
	}
	
	// To check edge in adjacency list 
	public boolean checkEdge(int src , int dst) {
		LinkedList<Node2> currentList = alist.get(src);
		Node2 dstNode = alist.get(dst).get(0);
		
		for(Node2 node : currentList) {
			if(node == dstNode) {
				return true;
			}
		}
		return false;
	}
	
	// To print adjacency list 
	public void print() {
		
		for(LinkedList<Node2> currentList : alist) {
			for(Node2 node : currentList) {
				System.out.print(node.data + " -> ");
			}
			System.out.println();
		}
	}
	
}

public class DS_19_Graph_AdjacencyList {

	
	public static void main(String[] args) {
		
		Graph2 graph = new Graph2();
		
		graph.addNode(new Node2('A'));
		graph.addNode(new Node2('B'));
		graph.addNode(new Node2('C'));
		graph.addNode(new Node2('D'));
		graph.addNode(new Node2('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);

		graph.print();
		graph.checkEdge(1, 1);
		
	}

}
