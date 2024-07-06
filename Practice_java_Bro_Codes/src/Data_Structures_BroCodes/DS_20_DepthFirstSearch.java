package Data_Structures_BroCodes;

		// Depth FS  = 	Traverse a graph branch by branch
		//				Utilizes a Stack
		//				Better if destination is on average far from the start
		//				Children are visited before siblings
		//				More popular for games/puzzles


import java.util.ArrayList;

// USING FOR GRAPH(adjacency matrix)


class Node33{
	char data ;
	Node33(char data){
		this.data = data;
	}
}
class Graph3 {
	ArrayList<Node33> nodes;
	int [][] matrix ;
	
	Graph3(int size){
		nodes = new ArrayList<>();
		matrix = new int[size][size];
	}	
	public void addNode33(Node33 node) {
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
		for(Node33 node : nodes) {
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
//--------------------------------------------------------------------------------
	public void depthFistSearch(int src) {
		boolean[] visited = new boolean[matrix.length];
		dFSHelper(src,visited);
	}
	// HELPER METHOD
	private void dFSHelper(int src, boolean[] visited) {

		if(visited[src]) {			// base case : for recusive function
			return;
		}
		else {
			visited[src] = true;
			System.out.println(nodes.get(src).data + " = visited");
		}
		
		for(int i = 0; i < matrix[src].length; i++) {
			if(matrix[src][i] == 1) {
				dFSHelper(i,visited);
			}
		}
		return;
	}
//----------------------------------------------------------------------------------
}

public class DS_20_DepthFirstSearch {

	public static void main(String[] args) {
		
		Graph3 graph = new Graph3(5);
		
		graph.addNode33(new Node33('A'));
		graph.addNode33(new Node33('B'));
		graph.addNode33(new Node33('C'));
		graph.addNode33(new Node33('D'));
		graph.addNode33(new Node33('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();

//		graph.depthFistSearch(0);
//		graph.depthFistSearch(1);
		graph.depthFistSearch(2);
//		graph.depthFistSearch(3);
	}

}
