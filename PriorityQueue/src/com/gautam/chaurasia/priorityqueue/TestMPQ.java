package com.gautam.chaurasia.priorityqueue;

public class TestMPQ {
	
	public static void main(String[] args) {
		
		MinPriorityQueue pq= new MinPriorityQueue(10);
		
			pq.insert(5);
			pq.insert(10);
			pq.insert(20);
			pq.insert(15);
			pq.insert(3);
//			pq.insert(2);
//			pq.insert(1);
//			pq.insert(0);
		
		
		pq.print();
		System.out.println(pq.deleteMin());
		pq.print();
	}
}
