package com.gautam.revision.graph.sept;



public class Test {
	
	public static void main(String[] args) {
		
		
		Graph g = new Graph(6);
		
		g.add(0, 1);
		g.add(1, 2);
		g.add(3, 3);
		g.add(0, 4);
		g.add(1, 5);
		g.add(4, 5);
		g.add(3, 1);
		g.add(5, 1);
		
		g.print();
		
		
		System.out.println();
		DFS dfs = new DFS(g);
	}
	

}
