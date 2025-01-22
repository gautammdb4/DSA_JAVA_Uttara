package com.gautam.chaurasia.generic.priorityqueue;

import java.util.PriorityQueue;

public class MinPriorityQueueTest {
	
	public static void main(String[] args) {
		
		MinPriorityQueue<Integer> q= new MinPriorityQueue<Integer>(5);
		
		PriorityQueue< String> s = new PriorityQueue<>();
		q.insert(2);
		q.insert(90);
		q.insert(6);
		q.insert(7);
		q.insert(9);
		
		q.print();
		
		System.out.println(q.deleteMin());
		
		q.print();
	}
}
