package Data_Structures_BroCodes;


// Breadth FS =	 Traverse a graph level by level
//				 Utilizes a Queue
//				 Better if destination is on average close to start
//				 Siblings are visited before childern
			 


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node4{
	char data ;
	Node4(char data){
		this.data = data;
	}
}
class Graph4 {
	ArrayList<Node4> nodes;
	int [][] matrix ;
	
	Graph4(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}	
	public void addNode4(Node4 node) {
		nodes.add(node);
	}
	public void addEdge(int src , int dst) {
		matrix[src][dst] = 1;
	}
	public boolean checkEdge(int src , int dst) {
		if(matrix[src][dst] == 1) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	public void print() {
		
		System.out.print("  ");
		for(Node4 node : nodes) {
			System.out.print(node.data +" ");
		}
		System.out.println();
		
		
		for(int i = 0; i < matrix.length; i++) {
			
			System.out.print(nodes.get(i).data +" ");
			
			for(int j = 0; j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

//-----------------------------------------------------------------------------
	public void breadthFirstSearch(int src) {
		
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[matrix.length];
		
		queue.offer(src);
		visited[src] = true;
		
		while(queue.size() != 0) {
			src = queue.poll();
			System.out.println(nodes.get(src).data + " = visited");
			
			for(int i = 0; i < matrix[src].length; i++) {
				if(matrix[src][i] ==1 && !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
	//-----------------------------------------------------------------------------
}

public class DS_21_BreadthFirstSearch {

	public static void main(String[] args) {
		Graph4 graph = new Graph4(5);
		
		graph.addNode4(new Node4('A'));
		graph.addNode4(new Node4('B'));
		graph.addNode4(new Node4('C'));
		graph.addNode4(new Node4('D'));
		graph.addNode4(new Node4('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();

		graph.breadthFirstSearch(0);
	}

}

					 
