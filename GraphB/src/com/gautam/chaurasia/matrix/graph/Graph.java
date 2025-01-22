package com.gautam.chaurasia.matrix.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	
	class Pair{
		
		int n ;
		int w;
		
		public Pair(int n, int w)
		{
			this.n=n;
			this.w=w;
		}

		@Override
		public String toString() {
			return "(" + n + "," + w + ")";
		}
		
		
	}
	
	private final int V;
	private int E;
	
	private boolean [][] adjMatrix;
	private int [][] adjMatrixI;
	
	ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
	ArrayList<ArrayList<Pair>> adjListWeight = new ArrayList<>();
	
	public Graph(int V)
	{
		if(V<0) throw new IllegalArgumentException(" Vertices Few Only ");
		this.V=V;
		this.E=0;
		adjMatrix = new boolean[V][V];
		adjMatrixI= new int [V][V];
		
		for (int i = 0; i < V; i++) {
			
			adjList.add(new ArrayList<>());
			adjListWeight.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int u , int v)
	{
		
		if(!adjMatrix[u][v])
			E++;
		adjMatrix[u][v]=true;
		adjMatrix[v][u]=true;
	}
	
	
	
	
	@Override
	public String toString() {
	    StringBuilder s = new StringBuilder();

	    String NEWLINE = System.getProperty("line.separator");

	    s.append(V + " Vertices, " + E + " Edges " + NEWLINE);

	    // Append column headers
	    s.append("   ");
	    for (int v = 0; v < V; v++) {
	        s.append(v + " ");
	    }
	    s.append(NEWLINE);

	    // Append matrix rows
	    for (int v = 0; v < V; v++) {
	        s.append(v + ": ");
	        for (int w = 0; w < V; w++) {
	            if (adjMatrix[v][w]) {
	                s.append("1 ");
	            } else {
	                s.append("0 ");
	            }
	        }
	        s.append(NEWLINE);
	    }

	    return s.toString();
	}

	
	public void addEdgesWithMatrix(int edges[][] , boolean isDirected )
	{
		
		for(int edge [] :edges)
		{
			int u=edge[0];
			int v=edge[1];
			
			if(isDirected)
				adjMatrixI[u][v]=1;
			else
			{
				adjMatrixI[u][v]=1;
				adjMatrixI[v][u]=1;
				E++;
				}
				
		}
	}

	
	public void addEdgesWeighMatrix(int edges[][] , boolean isDirected )
	{
		
		for(int edge [] :edges)
		{
			int u=edge[0];
			int v=edge[1];
			int w=edge[2];
			
			if(isDirected)
				adjMatrixI[u][v]=w;
			else
			{
				adjMatrixI[u][v]=w;
				adjMatrixI[v][u]=w;
				E++;
				}
				
		}
	}
	
	
	public void printMatrix()
	{
		
		System.out.println();
		for (int i = 0; i < adjMatrixI.length; i++) {
			
			System.out.print("row "+i+" -> ");
			
			for (int j = 0; j < adjMatrixI[i].length; j++) {
				
				System.out.print(adjMatrixI[i][j]);
				
				if(j!=adjMatrixI[i].length-1)
					System.out.print(", ");
				
			}
			
			System.out.println();
		}
	}

	
	public void addEdgeAdjList(int edges [] [] , boolean isDirected)
	{
		
		for(int [] edge : edges)
		{
			int u=edge[0];
			int v=edge[1];
			
			if(isDirected)
			{
				adjList.get(u).add(v);
				E++;
			}
			else
			{
				adjList.get(u).add(v);
				adjList.get(v).add(u);
				E++;
			}
		}
	}

	
	public void printAdjList()
	{
		
		for(int i =0;i<adjList.size();i++)
		{
			System.out.print(i+" -> [");
			for (int j = 0; j < adjList.get(i).size(); j++) {
				
				System.out.print(adjList.get(i).get(j));
				
				if(j!=adjList.get(i).size()-1)
					System.out.print(",");
			}
			System.out.print("]");
			System.out.println();
		
		}
	}

	
	public void addEdgeAdjListWeight(int edges [] [] , boolean isDirected)
	{
		
		for(int [] edge : edges)
		{
			int u=edge[0];
			int v=edge[1];
			int w=edge[2];
			if(isDirected)
			{
				Pair p = new Pair(v, w);
				adjListWeight.get(u).add(p);
				E++;
			}
			else
			{

				Pair p = new Pair(v, w);
				Pair p2 = new Pair(u, w);
				adjListWeight.get(u).add(p);
				adjListWeight.get(v).add(p2);
				E++;
			}
		}
	}
	
	public void printAdjListWeight()
	{
		
		for(int i =0;i<adjListWeight.size();i++)
		{
			System.out.print(i+" -> [");
			for (int j = 0; j < adjListWeight.get(i).size(); j++) {
				
				System.out.print(adjListWeight.get(i).get(j));
				
				if(j!=adjListWeight.get(i).size()-1)
					System.out.print(",");
			}
			System.out.print("]");
			System.out.println();
		
		}
	}

	public int getEdges() {
		// TODO Auto-generated method stub
		return this.E;
	}

	public void getBFSList(int s) {
		
		Queue<Integer> q = new LinkedList<>();
		
		boolean visited [] = new boolean [adjList.size()];
		
		q.add(s);
		
		visited[s]= true;
		while(!q.isEmpty())
		{
			int v=q.poll();
			
			System.out.print(" "+v);
			
			for(int i : adjList.get(v))
			{
				
				if(!visited[i])
				{
					visited[i]=true;
					q.add(i);
				}
			}
		}
		System.out.println();
	}
	
	
}
