package com.gautam.chaurasia.undirectedgraph;

import java.util.LinkedList;

public class Graph {

	private final int V;
	private int E;
	private LinkedList<Integer> adj[];

	public Graph(int V) {
		if (V < 0)
			throw new IllegalArgumentException("Number of Vertices must not be negative ");
		this.V = V;
		this.E = 0;
		adj = (LinkedList<Integer>[]) new LinkedList[V];

		for (int v = 0; v < V; v++) {
			adj[v] = new LinkedList<Integer>();
		}
	}

	/**
	 * @param v
	 * @param w
	 */
	public void addEdge(int v, int w) {
		if (v < 0 || v >= V)
			throw new ArrayIndexOutOfBoundsException();
		if (w < 0 || w >= V)
			throw new ArrayIndexOutOfBoundsException();

		E++;
		adj[v].add(w);
		adj[w].add(v);
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
