package com.gautam.chaurasia.undirectedgraph;

import java.util.Stack;

public class TestGraph {

	public static void main(String[] args) {
		
		Graph G= new  Graph(7);
		G.addEdge(0, 5);
		G.addEdge(0, 1);
		G.addEdge(0, 2);
		G.addEdge(0, 6);
		G.addEdge(5, 3);
		G.addEdge(5, 4);
		G.addEdge(3, 4);
		G.addEdge(6, 4);
		
//		G.addEdge(9, 12);
//		
//	
//		G.addEdge(9, 10);
//		G.addEdge(11, 12);
//		
//		G.addEdge(9, 8);
//		G.addEdge(9, 11);
//		
		
		Iterable<Integer> itr = G.adj(0);
		
		System.out.println(G.toString());
		
		DFS d = new DFS(G, 0);
		
		DFS d1 = new DFS();
		d1.visitDisconnectedGraph(G);
		
		System.out.println("\nPath of graph ");
		
		DFSPaths dp = new DFSPaths(G, 0);
		Stack<Integer> st=(Stack<Integer>) dp.pathTo(6);
		Stack<Integer> st1=(Stack<Integer>) dp.pathTo(5,6);
		
		while(!st.empty())
		{
			System.out.print(st.pop()+" ");
		}
		
		System.out.println();
		while(!st1.empty())
		{
			System.out.print(st1.pop()+" ");
		}
		
		System.out.println("\n"+"-------------------*************---------------------");
		DFSConnectedComponents cc= new DFSConnectedComponents(G);
		System.out.println(cc.getConnectComponent());
		
//		GraphCycle gc = new GraphCycle(G);
//		
//		System.out.println(gc.isCycle());
//		
//		BFS b= new BFS(G, 0);
	}
}
