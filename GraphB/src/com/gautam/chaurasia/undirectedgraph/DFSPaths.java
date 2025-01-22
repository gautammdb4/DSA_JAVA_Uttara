package com.gautam.chaurasia.undirectedgraph;

import java.util.Stack;

public class DFSPaths {
	
	private Graph G;
	private int S;
	private boolean [] marked;
	
	private int [] edgeTo;
	
	public DFSPaths(Graph G, int s)
	{
		edgeTo= new int [G.getV()];
		marked= new boolean[G.getV()];
		this.G=G;
		this.S=s;
		
	  dfs(G,S);
	}

	private void dfs(Graph G, int v) {
		
		marked[v]=true;
		
		for (int w : G.adj(v)) {
			
			if(!marked[w])
			{
				edgeTo[w]=v;
				dfs(G, w);
			}
			
		}
	}
	
	
	public boolean hasPathTo(int v)
	{
		return marked[v];
	}
	
	public Iterable<Integer> pathTo(int from,int to ){
		
		Stack<Integer> st = new Stack<>();
		
		for (int i = to; i !=from; i=edgeTo[i]) {
			
			st.push(i);
		}
		st.push(from);
		
		return st;
	}
	public Iterable<Integer> pathTo(int v ){
		
		Stack<Integer> st = new Stack<>();
		
		for (int i = v; i !=S; i=edgeTo[i]) {
			
			st.push(i);
		}
		st.push(S);
		
		return st;
	}
}
