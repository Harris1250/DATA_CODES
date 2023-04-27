import java.util.Iterator;
import java.util.LinkedList;

/* Class representing a directed graph using adjacency lists */
	public class Graph{
		int V; //Number of Vertices
		LinkedList<Integer>[] adj; // adjacency lists

//Constructor
		Graph(int V){
			this.V = V;
			adj = new LinkedList[V];
			for (int i = 0; i < adj.length; i++)
				adj[i] = new LinkedList<Integer>();
		}

// To add an edge to graph
		void addEdge(int v, int w){
// Add w to the list of v.
			adj[v].add(w);
		}
	
// A function used by DFS
		void DFS(int ver, boolean visitedNode[]){
// Mark the current node as visited and print it
			visitedNode[ver] = true;
			System.out.print(ver + " ");

// Recur for all the vertices adjacent to this vertex
			Iterator<Integer> counter = adj[ver].listIterator();

// Loops till all the nodes of the graph not visited
			while (counter.hasNext()){
// Gets the current node
				int num = counter.next();

// Checks if it is not visited
				if (!visitedNode[num])
// Recursively calls the method to traverse all the connected nodes
					DFS(num, visitedNode);
			}
		}

// Defines main method
		public static void main(String []s) {
			
// Creates an object of class Graph
			Graph dfs = new Graph(6);
// Creates an array to keep track of visited nodes
			boolean visitedNode[] = new boolean[6];

// Calls the method to add edges
			dfs.addEdge(0, 1);
			dfs.addEdge(0, 2);
			dfs.addEdge(2, 3);
			dfs.addEdge(2, 4);
			dfs.addEdge(4, 5);
			dfs.addEdge(1, 3);
			dfs.addEdge(3, 5);
			
			System.out.println("Following is Depth First Traversal " +"(starting from vertex 0)");

// Calls the method to perform depth first traversal
			dfs.DFS(0, visitedNode);
	}
}