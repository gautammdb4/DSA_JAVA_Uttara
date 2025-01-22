package com.gautam.chaurasia.directedgraph;

public class TestDirFGraph {

	
	public static void main(String[] args) {
		
		Graph G= new Graph(7);
		
		G.addEdge(2, 1);
		G.addEdge(0, 1);
		G.addEdge(0, 2);
		G.addEdge(1, 3);
//		G.addEdge(5, 3);
////		G.addEdge(5, 4);
//		G.addEdge(3, 4);
////		G.addEdge(6, 4);
		
		System.out.println(G.toString());
		
		DFSDirGraph dfs = new DFSDirGraph(G, 0);
		
	}
}
