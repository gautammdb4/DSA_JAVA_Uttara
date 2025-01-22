package com.gautam.chaurasia.edgeweightgraph;

public class TestMST {

	public static void main(String[] args) {
		
		
		EWGraph G= new  EWGraph(8,false);
		G.addEdges(new Edges(0,2,26));
		G.addEdges(new Edges(0,7,16));
		G.addEdges(new Edges(0,4,38));
		G.addEdges(new Edges(0,6,58));
		G.addEdges(new Edges(1,7,19));
		G.addEdges(new Edges(1,2,36));
		G.addEdges(new Edges(1,3,29));
		G.addEdges(new Edges(1,5,32));
		G.addEdges(new Edges(2,3,17));
		G.addEdges(new Edges(2,6,40));
		G.addEdges(new Edges(3,6,52));
		G.addEdges(new Edges(4,5,35));
		G.addEdges(new Edges(4,7,37));
		G.addEdges(new Edges(4,6,93));
		G.addEdges(new Edges(5,7,28));
		
		System.out.println(G);
		
		PrimMST mst = new PrimMST(G);
		//[[0,7,16], [0,2,26], [2,3,17], [0,4,38], [4,5,35], [2,6,40]]
	}
}
