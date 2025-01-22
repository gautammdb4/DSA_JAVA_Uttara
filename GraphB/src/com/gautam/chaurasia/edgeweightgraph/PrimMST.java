package com.gautam.chaurasia.edgeweightgraph;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrimMST {

    private EWGraph G;
    private PriorityQueue<Edges> pq;
    private boolean[] visited;
    private Queue<Edges> mst;

    public PrimMST(EWGraph G) {
        this.G = G;
        this.visited = new boolean[G.V()];
        this.pq = new PriorityQueue<>(); // Priority queue for edges
        this.mst = new LinkedList<>();

        // Start from vertex 0
        visit(0);

        while (!pq.isEmpty()) {
            Edges e = pq.poll(); // Remove the smallest edge
            int v = e.either();
            int w = e.other(v);

            // Skip if both vertices are already visited
            if (visited[v] && visited[w]) {
                continue;
            }

            // Add edge to MST
            mst.add(e);

            // Visit new vertex
            if (!visited[v]) {
                visit(v);
            }
            if (!visited[w]) {
                visit(w);
            }
        }

        // Output the MST
        System.out.println("MST: " + mst);
    }

    private void visit(int v) {
        visited[v] = true;
        for (Edges e : G.adj(v)) {
            int w = e.other(v);
            if (!visited[w]) {
                pq.add(e);
            }
        }
    }
}
