package com.gautam.chaurasia.matrix.graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test {

	
	public static void main(String[] args) {
		
//		DiGraph G= new DiGraph(7);
//		G.addEd(0, 1);
//		G.addEd(0, 3);
//		G.addEd(1, 3);
//		G.addEd(1, 4);
//		G.addEd(2, 0);
//		G.addEd(2, 5);
//		G.addEd(3, 5);
//		G.addEd(3, 6);
//		G.addEd(4, 6);
//		G.addEd(5, 6);
//		
//		System.out.println(G);
//		
//		G.shortestPath(0);
//		
//		
//		
		
		System.out.println(minCostConnectPoints (new int [] [] {{0,0},{2,2},{3,10},{5,2},{7,0}}));
	   
		
		
	}
	
	public static int manhattan(int[] p1, int[] p2) {
        return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
    }

    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        if (n == 0) return 0;

        
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        
        
        int[] minEdge = new int[n];

        Arrays.fill(minEdge, Integer.MAX_VALUE);
        
       
        boolean[] inMST = new boolean[n];
        
        
        minEdge[0] = 0;
        
        pq.add(new Edge(0, 0));
        
        int totalCost = 0;

        while (!pq.isEmpty()) {
            Edge edge = pq.poll();
            int u = edge.to;
            int weight = edge.weight;

            if (inMST[u]) continue; 
            
            totalCost += weight;
            inMST[u] = true;

           
            for (int v = 0; v < n; v++) {
                if (!inMST[v]) {
                    int dist = manhattan(points[u], points[v]);
                    if (dist < minEdge[v]) {
                        minEdge[v] = dist;
                        pq.add(new Edge(v, dist));
                    }
                }
            }
        }

        return totalCost;
    }
    
   
}

class Edge implements Comparable<Edge> {
    int to;
    int weight;
    
    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.weight, other.weight);
    }

	@Override
	public String toString() {
		return "Edge [" + to + ", " + weight + "]";
	}
    
    
}
