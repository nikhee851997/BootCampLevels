package b1_bootcampprogramming;

import java.util.Arrays;
import java.util.PriorityQueue;

public class J_ShortestPathinWgtGraphUDijkstras 
{
// comparable is an interface that has a method called compareTo is used for comparing nodes weights.
class Node implements Comparable<Node>
{
	int vertex;  
	int weight;
	
	
	Node(int vertex, int weight)
	{
		this.vertex= vertex;
		this.weight= weight;
		
	}
//compareTo method is part of Comparable interface: mostly it is used to compare objects of class.
// Node is a class with this reference(vertex1, weight) other reference(vertex 2, weight) are object references
	public int compareTo(Node other)  
	{
		return Integer.compare(this.weight, other.weight);
		// Internally it is like this.compareTo(other) with numerical comparision
		// returns positive value if the 1st argument is > 2nd argument, viceversa,0 if both arguments are same.
	}

	
}

public void dijkstras(int[][] graph, int source)   // Method 
{
	
	int numNodes= graph.length;

 // we created a array to store shortest distance
 // syntax of array: datatype arrayname = new datatype[size]
	
    int[] distances= new int[numNodes];
	
// In distances array set sourcenode to 0 and distance it travels to reach node 0 is 0 and initializes all other nodes with distance as infinity.

    	Arrays.fill(distances,Integer.MAX_VALUE);
    	distances[source]=0;
    	
 // Now the priority queue(fifo) is used to store nodes based on their distances and smaller pair values will be first prefered(high priority)to find shortest path.
 // Also  nodes with connections will be stored with (nodename,distance).
 // Here comparator with lambda expression is used to provide custom logic to compare nodes in priority queue.
   PriorityQueue<Node> pq= new PriorityQueue<>((node1, node2) -> Integer.compare(node1.weight, node2.weight));
	
   // Add(offer) souce node with distance 0 as (source,0)..(node, distance)to priority queue
   
	pq.offer(new Node (source, 0));
	
	while(!pq.isEmpty())
	{
		// Extracting(poll) node(vertex) with minimum distance from priority queue
		int current= pq.poll().vertex;
		
     	// To explore its neighboring nodes in graph after extracting current node from priority queue
	   for(int next=0; next<numNodes; next++)
	   {
		   // It checks whether there is connection from current node to next node to find shortest path
		   // Intially when source node distance is intialized as 0 and rest nodes distance will be infinity. 
	
		if(graph[current][next]!=0 && distances [next]>distances[current]+graph[current][next])
		   {
			//update distance of next node in array by replacing infinity 
			 distances[next]= distances[current]+graph[current][next];  
			//Add(offer) the updated node with distance to priority queue 
			 pq.offer(new Node(next, distances[next]));
		   }
		  
	   }// this loop runs until all the nodes in graph are extracted. 
	}
	
	// print the shortest distances from source node to all nodes
	System.out.println("shortest distances from source node to other nodes are :");
	
	for(int i=0; i<numNodes; i++)
	{

		System.out.println("node " + i + " :" + distances[i]);
		
	}

}

public static void main(String[]arr)
 {
	int[][] graph = {  {0, 5, 0, 0}, 
			           {0, 0, 2, 0}, 
			           {0, 0, 0, 4},
			           {0, 0, 0, 0}
			        };
	
	int source =0;
	
	J_ShortestPathinWgtGraphUDijkstras object = new J_ShortestPathinWgtGraphUDijkstras();
	
	object.dijkstras(graph, source);
	
 }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	