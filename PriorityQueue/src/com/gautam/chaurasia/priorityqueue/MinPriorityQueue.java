package com.gautam.chaurasia.priorityqueue;

import java.util.Arrays;

public class MinPriorityQueue {

	private int[] minPQ;
	private int N;

	public MinPriorityQueue(int size) {
		minPQ = new int[size];
		N = 0;
	}

	public int[] getMinPQ() {
		return minPQ;
	}

	public void insert(int k) {
		minPQ[++N] = k;
		swim(N);
	}

	private void swim(int k) {

		while (k > 1 && greater(k / 2, k)) {
			exch(k / 2, k);
			k = k / 2;
		}

	}

	private void exch(int i, int k) {

		int a = minPQ[i];
		minPQ[i] = minPQ[k];
		minPQ[k] = a;

	}

	private boolean greater(int i, int k) {
		return minPQ[i] > minPQ[k];
	}

	public int deleteMin() {
		int min = minPQ[1];

		exch(1, N--);
		sink(1);

		return min;

	}

	private void sink(int k) {

		while (2 * k <= N) {
			int j = 2 * k;

			if (j < N && greater(j, j + 1))
				j++;
			if (!greater(k, j))
				break;
			exch(k, j);
			k = j;
		}
	}

	public void print() {
		System.out.println();

		for (int i = 1; i <= N; i++) {
			System.out.print(minPQ[i] + " ");
		}
		System.out.println();
	}

	@Override
	public String toString() {
		return "MinPriorityQueue [minPQ=" + Arrays.toString(minPQ) + ", N=" + N + "]";
	}

}
