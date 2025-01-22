package com.gautam.chaurasia.undirectedgraph;

public class DFS {
	
	
	private Graph G;
	private boolean [] marked ;
	public DFS(Graph G , int s)
	{
		marked=new boolean[G.getV()];
		dfs(G,s);
		System.out.println();
	}
	
	public DFS()
	{
		
	}
	public void visitDisconnectedGraph(Graph G)
	{
		marked=new boolean[G.getV()];
		for (int i = 0; i < G.getV(); i++) {
			
			if(!marked[i])
				dfs(G, i);
		}
		
	}
	private void dfs(Graph G, int v) {

		marked[v]=true;
		System.out.print(v+" ");
		
		for (int w  : G.adj(v)) {
			
			if(!marked[w])
				dfs(G, w);
		}
	}
}
