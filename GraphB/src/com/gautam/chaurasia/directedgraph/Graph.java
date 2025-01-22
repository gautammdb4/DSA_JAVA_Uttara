package com.gautam.chaurasia.directedgraph;

import java.util.LinkedList;

public class Graph {

	private LinkedList<Integer> adj[];
	private int V;
	private int E;

	public Graph(int V) {
		this.V = V;
		this.E = 0;
		adj = new LinkedList[V];
		for (int i = 0; i < V; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		adj[v].add(w);
		E++;

	}

	public Iterable<Integer> adj(int v) {
		if (v < 0 || v >= V)
			throw new ArrayIndexOutOfBoundsException();
		return adj[v];
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		String NEWLINE = System.getProperty("line.separator");

		s.append(V + " Vertices, " + E + " Edges " + NEWLINE);

		for (int v = 0; v < V; v++) {

			s.append(v + ": ");

			for (int w : adj[v]) {
				s.append(w + " ");
			}
			s.append(NEWLINE);

		}
		return s.toString();
	}

	public int getV() {
		// TODO Auto-generated method stub
		return V;
	}
}
