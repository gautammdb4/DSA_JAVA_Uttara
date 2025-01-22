package com.gautam.chaurasia.generic.priorityqueue;

import java.util.Comparator;

@SuppressWarnings("hiding")
public class MinPriorityQueue<Key> implements Comparable<Key>{
	
	private Key[] heap;
	private int N;
	private Comparator<Key> comparator;

	@SuppressWarnings("unchecked")
	public MinPriorityQueue(int capacity) {
		heap = (Key[]) new Comparable[capacity + 1];
		N = 0;
	}

	@SuppressWarnings("unchecked")
	public MinPriorityQueue(int capacity, Comparator<Key> comparator) {
		this.comparator = comparator;
		heap = (Key[]) new Comparable[capacity + 1];
		N = 0;
	}

	public void insert(Key key) {
		heap[++N] = key;
		swim(N);
	}

	public Key deleteMin() {
		Key min = heap[1];
		exchange(1, N--);
		heap[N + 1] = null; // Avoid loitering
		sink(1);
		return min;
	}

	private void swim(int k) {
		while (k > 1 && greater(k / 2, k)) {
			exchange(k, k / 2);
			k = k / 2;
		}
	}

	private void sink(int k) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && greater(j, j + 1))
				j++;
			if (!greater(k, j))
				break;
			exchange(k, j);
			k = j;
		}
	}

	@SuppressWarnings("unchecked")
	private boolean greater(int i, int j) {
		if (comparator == null) {
			return ((Comparable<Key>) heap[i]).compareTo(heap[j]) > 0;
		} else {
			return comparator.compare(heap[i], heap[j]) > 0;
		}
	}

	private void exchange(int i, int j) {
		Key temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	@Override
	public int compareTo(Key o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void print() {
		
		for(Key k: heap)
		{
			if(k!=null)
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
