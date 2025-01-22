package com.gautam.chaurasia.edgeweightgraph;

import java.util.*;

public class EWGraph  {

	int V;
	int E;
	
	boolean isDirected ;
	
	LinkedList<Edges> [] adj;

	@SuppressWarnings("unchecked")
	public EWGraph(int v , boolean isDi ) {
		
		this.isDirected=isDi;
		V = v;
		E = 0;
		this.adj = new LinkedList[V];
		
		for(int i=0;i<V ; i++)
			adj[i]= new LinkedList<Edges>();
		
	}
	
	public void addEdges(Edges e)
	{
	
		
	int v=e.getV();
	int u=e.getW();
	
	E++ ;
	
	if(isDirected)
		adj[v].add(e);
	else {
		 adj[u].add(e);
			adj[v].add(e);
	}
	
	}
	public Iterable<Edges> adj(int v)
	{
		return  adj[v];
	}

	public int V() {
		// TODO Auto-generated method stub
		return V;
	}

	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("EWGraph with ").append(V).append(" vertices and ").append(E).append(" edges:\n");

	    for (int v = 0; v < V; v++) {
	        sb.append("Vertex ").append(v).append(": ");
	        for (Edges e : adj[v]) {
	            sb.append(e).append(" ");
	        }
	        sb.append("\n");
	    }

	    return sb.toString();
	}


	
}
