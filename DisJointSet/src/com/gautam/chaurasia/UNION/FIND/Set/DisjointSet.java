package com.gautam.chaurasia.UNION.FIND.Set;

public class DisjointSet {

    private int[] parent;
    private int[] rank;
    private int size;

    public DisjointSet(int size) {
        this.size = size;
        parent = new int[size];
        rank = new int[size];

        // Initialize each element as its own parent and with rank 0
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            // Union by rank
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    
}
