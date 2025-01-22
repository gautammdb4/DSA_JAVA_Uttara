package com.gautam.chaurasia.undirectedgraph;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {
	
	private Graph G ;
	private int S;
	
	private boolean marked [] ;
	
	public BFS(Graph G ,int S) {
		this.G=G;
		this.S=S;
		
		marked = new boolean[G.getV()];
		
		bsf(G,S); 
	}

	private void bsf(Graph G, int s) {
		
			marked[s]=true;
			LinkedList<Integer> q= new LinkedList<>();
			q.addLast(s);
			
			while(!q.isEmpty())
			{
				int v=q.removeFirst();
				System.out.print(v+" ");
				
				for (int w : G.adj(v)) {
					
					if(!marked[w])
					{
						marked[w]=true;
						q.addLast(w);
					}
				}
			}
		
	}
}
