package com.gautam.chaurasia.undirectedgraph;

public class DFSConnectedComponents {
	
	private Graph G;
	private int countc;
	private boolean [] marked;
	
	private int [] cid;
	
	public DFSConnectedComponents(Graph G)
	{
		this.G=G;
		marked = new boolean[G.getV()];
		cid= new int [G.getV()];
		for (int i = 0; i < G.getV(); i++) {
			if(!marked[i])
			{
				dfs(G,i);
				countc++;
			}
			
		}
	}

	private void dfs(Graph G, int v) {
		
		marked[v]=true;
		
		cid[v]=countc;
		for (int w : G.adj(v)) {
			
			if(!marked[w])
			{
				dfs(G, w);
			}
		}
	}
	
	public boolean areConnected(int v, int w) {
		
		return cid[v]==cid[w];
	}
	public int getConnectComponent()
	{
		
		return countc;
	}
}
