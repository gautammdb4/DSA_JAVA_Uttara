package com.gautam.chaurasia.edgeweightgraph;

import java.util.Objects;

public class Edges implements Comparable<Edges> {
	
	private int v;
	private int w;
	private int weight;
	
	public int getV() {
		return v;
	}

	public int getW() {
		return w;
	}

	public void setV(int v) {
		this.v = v;
	}

	public void setW(int w) {
		this.w = w;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	// Default constructor
	public Edges() {}

	// Parameterized constructor
	public Edges(int v, int w, int weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	// Returns one of the vertices of the edge
	public int either() {
		return v;
	}
	
	// Returns the vertex that is not equal to v
	public int other(int vertex) {
		if (vertex == v) return w;
		else if (vertex == w) return v;
		else throw new IllegalArgumentException("Invalid vertex");
	}
	
	// Returns the weight of the edge
	public int getWeight() {
		return weight;
	}

	// Compare edges based on their weight
	@Override
	public int compareTo(Edges other) {
		return Integer.compare(this.weight, other.weight);
	}
	
	// String representation of the edge
	@Override
	public String toString() {
		return "[" + v + "," + w + "," + weight + "]";
	}
	
	// Optional: Override equals and hashCode if needed
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Edges other = (Edges) obj;
		return (v == other.v && w == other.w && weight == other.weight) ||
		       (v == other.w && w == other.v && weight == other.weight);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Math.min(v, w), Math.max(v, w), weight);
	}
}
