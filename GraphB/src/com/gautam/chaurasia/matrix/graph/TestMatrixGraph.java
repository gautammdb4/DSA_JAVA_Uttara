package com.gautam.chaurasia.matrix.graph;

public class TestMatrixGraph {

	
	public static void main(String[] args) {
		
//		int edges [][] = {{0,1},{0, 4},{1, 2},{1,3},{2,1}};
//		Graph g = new Graph(5);
//		g.addEdgesWithMatrix(edges, true);
//		
//		
//		int edges1 [][] = {{0,1,10},{0, 4,13},{1, 2,23},{1,3,98},{2,1,32}};
//		
//		Graph g1 = new Graph(5);
//		g1.addEdgesWeighMatrix(edges1, true);
//		g1.printMatrix();
		
		int edges2 [][] = {{0,1},{0, 4},{1, 2},{1,3},{4,1}};
		Graph g2 = new Graph(5);
		g2.addEdgeAdjList(edges2, false);
		g2.printAdjList();
		
		g2.getBFSList(0);
		
//		System.out.println("Weight un directed Graph");
//		int edges3 [][] = {{0,1,10},{0, 4,13},{1, 2,23},{1,3,98},{2,1,32}};
//		
//		Graph g3 = new Graph(5);
//		g3.addEdgeAdjListWeight(edges3, false);
//		g3.printAdjListWeight();
//		System.out.println();
//		
//		System.out.println("Weight  directed Graph");
//		Graph g4 = new Graph(5);
//		g4.addEdgeAdjListWeight(edges3, true);
//		g4.printAdjListWeight();
//		System.out.println("Edges "+g4.getEdges());
		
		
		
	}
}
