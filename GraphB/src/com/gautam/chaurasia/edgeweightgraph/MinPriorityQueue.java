package com.gautam.chaurasia.edgeweightgraph;

	import java.util.Comparator;
import java.util.NoSuchElementException;

	@SuppressWarnings("hiding")
	public class MinPriorityQueue<Key> implements Comparable<Key> , IMinPriorityQueue{
		
		private Key[] minPQ;
		private int N;
		private Comparator<Key> comparator;

		@SuppressWarnings("unchecked")
		public MinPriorityQueue(int capacity) {
			minPQ = (Key[]) new Comparable[capacity + 1];
			N = 0;
		}

		@SuppressWarnings("unchecked")
		public MinPriorityQueue(int capacity, Comparator<Key> comparator) {
			this.comparator = comparator;
			minPQ = (Key[]) new Comparable[capacity + 1];
			N = 0;
		}

		public MinPriorityQueue() {
			this(16);
		}

		public void insert(Key key) {
			 if (N + 1 >= minPQ.length) {
		            resize(2 * minPQ.length);
		        }
		        minPQ[++N] = key;
		        swim(N);
		}
		
		private void resize(int capacity) {
	        @SuppressWarnings("unchecked")
	        Key[] newMinPQ = (Key[]) new Comparable[capacity];
	        System.arraycopy(minPQ, 1, newMinPQ, 1, N);
	        minPQ = newMinPQ;
	    }
		

		public Key deleteMin() {
	        if (isEmpty()) throw new NoSuchElementException("Priority queue underflow");
	        Key min = minPQ[1];
	        exchange(1, N--);
	        minPQ[N + 1] = null; // Avoid loitering
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
				return ((Comparable<Key>) minPQ[i]).compareTo(minPQ[j]) > 0;
			} else {
				return comparator.compare(minPQ[i], minPQ[j]) > 0;
			}
		}

		private void exchange(int i, int j) {
			Key temp = minPQ[i];
			minPQ[i] = minPQ[j];
			minPQ[j] = temp;
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
			
			for(Key k: minPQ)
			{
				if(k!=null)
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
