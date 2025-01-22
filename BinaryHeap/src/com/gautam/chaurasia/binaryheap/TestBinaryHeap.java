package com.gautam.chaurasia.binaryheap;

public class TestBinaryHeap {

	public static void main(String[] args) {
		
		BinaryHeap h = new BinaryHeap(8);
		h.insert(90);
		h.insert(60);
		h.insert(80);
		h.insert(30);
		h.insert(75);
		h.insert(70);
		h.insert(100);
		
		h.print();
		h.heapifying();
		
		h.print();
	}
}
