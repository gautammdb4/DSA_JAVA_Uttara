package com.gautam.chaurasia.matrix.graph;

import java.util.*;

public class DiGraph {

    private int vertC;
    private int E;
    private List<List<Integer>> adjList;

    public DiGraph(int c) {
        this.vertC = c;
        this.E = 0;
        this.adjList = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            adjList.add(new LinkedList<>());
        }
    }

    public void addEd(int v, int u) {
        if (v >= 0 && v < vertC && u >= 0 && u < vertC) {
            adjList.get(v).add(u);
            E++;
        } else {
            System.out.println("Invalid vertex index.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DiGraph:\n");

        for (int i = 0; i < vertC; i++) {
            sb.append("Vertex ").append(i).append(" -> ");
            List<Integer> edges = adjList.get(i);
            if (edges.isEmpty()) {
                sb.append("No edges");
            } else {
                for (Integer edge : edges) {
                    sb.append(edge).append(" ");
                }
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void shortestPath(int s) {
        // Check if the starting vertex is valid
        if (s < 0 || s >= vertC) {
            System.out.println("Invalid start vertex.");
            return;
        }
        
        Queue<Integer> q = new LinkedList<>();
        int[] distance = new int[vertC];
        
        // Initialize distances with -1 (indicating unreachable)
        Arrays.fill(distance, -1);
        distance[s] = 0;
        
        q.add(s);
        
        while (!q.isEmpty()) {
            int v = q.poll();
            
            for (int u : adjList.get(v)) {
                if (distance[u] == -1) { // If 'u' is unvisited
                    distance[u] = distance[v] + 1;
                    q.add(u);
                }
            }
        }
        
        // Print distances from the source vertex
        System.out.println("Shortest paths from vertex " + s + ": " + Arrays.toString(distance));
    }
}
