package com.gautam.revision.graph.sept;


public class Graph {

	
	private int V;
	private int E ;
	
	int [][] G;
	
	public Graph(int v)
	{
		
		if(v< 0) throw  new IllegalArgumentException (" not less than 0 ");
		this.setV(v);
		
		G=new int [v][v];
	}
	
	
	public void add(int v, int u)
	{
		
		if(v<0 || v>getV()) throw new IndexOutOfBoundsException(" Value of Vertice is greater than Graph Size");
		
		if(u<0 || u>getV()) throw new IndexOutOfBoundsException(" Value of Vertice is greater than Graph Size");
		
		E++;
		G[v][u]=1;
		G[u][v]=1;
	}
	
	public void print()
	
	{
		 System.out.println("Adjacency Matrix:");
	        for (int i = 0; i < getV(); i++) {
	            for (int j = 0; j < getV(); j++) {
	                System.out.print(G[i][j] + " ");
	            }
	            System.out.println();
	        }
	}


	public int getV() {
		return V;
	}


	public void setV(int v) {
		V = v;
	}
}
