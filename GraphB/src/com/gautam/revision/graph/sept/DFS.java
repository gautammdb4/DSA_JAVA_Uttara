package com.gautam.revision.graph.sept;

import java.util.Iterator;

public class DFS {
	
	Graph G;
	
	boolean visited [];
	public DFS(Graph G)
	{
		this.G=G;
		
		this.visited= new boolean[G.getV()];
		
		dfs(0);
	}
	private void dfs(int v) {
        // Mark the current vertex as visited
        visited[v] = true;
        // Print the current vertex
        System.out.print(v + " ");
        
        // Traverse all adjacent vertices of the current vertex
        for (int i = 0; i < G.getV(); i++) {
            // Check if there is an edge from v to i and if i is not visited
            if (G.G[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
	
	}
	
}

