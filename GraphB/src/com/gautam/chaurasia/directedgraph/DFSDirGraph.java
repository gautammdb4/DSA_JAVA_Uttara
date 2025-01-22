package com.gautam.chaurasia.directedgraph;

public class DFSDirGraph {
	
	private Graph G;
	private boolean marked[];
	private int S;
	
	public DFSDirGraph(Graph G, int S)
	{
		this.G=G;
		this.S=S;
		
		marked = new boolean[G.getV()];
		System.out.println();
		for (int i = S; i < G.getV(); i++) {
			
			if(!marked[i])
			dfs(G,i);
		}
		System.out.println();
	}

	private void dfs(Graph G, int v) {
		
		marked[v]=true;
			System.out.print(v+" ");
		for (int w : G.adj(v)) {
			
			if(!marked[w])
				dfs(G, w);
		}
	}
}
