package com.gautam.chaurasia.undirectedgraph;

public class GraphCycle {
	
	private Graph G;
	private boolean marked[] ;
	private boolean cycle;
	
	public GraphCycle(Graph G )
	{
		this.G=G;
		marked = new boolean[G.getV()];
		cycle=false;
		
		for (int i = 0; i < G.getV(); i++) {
			
//			dfs1(G,i);
			if(!marked[i])
			dfs(G, i, i);
		}
	}
	
	
	private void dfs1(Graph G, int v) {
		
		marked[v]=true;
		
		for (int w  : G.adj(v)) {
			if(cycle)
				return;
			else if(!marked[w])
			{
				dfs1(G, w);
			}
			else {
				
				cycle=true;
			}
		}
	}
	
	
	private void dfs(Graph G, int v,int u) {
			
			marked[v]=true;
			
			for (int w  : G.adj(v)) {
				if(cycle)
					return;
				else if(!marked[w])
				{
					dfs(G, w,v);
				}
				else if (u!=w){
					
					cycle=true;
				}	
			}
		}
	public boolean isCycle()
	{
		return cycle;
	}
}
