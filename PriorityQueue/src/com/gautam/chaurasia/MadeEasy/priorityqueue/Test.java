package com.gautam.chaurasia.MadeEasy.priorityqueue;

import java.util.PriorityQueue;

public class Test {

	
	public static void main(String[] args) {
		
		Heap  h = new Heap(5 ,0);
		h.insert(10);
		h.insert(20);
		h.insert(200);
		h.insert(0);
		h.insert(20);
		h.insert(202);
		h.insert(203);
		h.print();
		
		
		int [] nums =
				{3,2,1,5,6,4};
		
		
		System.out.println(findKthLargest(nums, 5));
	}
	
	public static  int findKthLargest(int[] nums, int k) {
        
	       PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	        for (int num : nums) {
	            minHeap.offer(num);

	            if (minHeap.size() > k) 
	                minHeap.poll(); // Remove the smallest element (root of min-heap)
	            }
	            return minHeap.peek();
	  
	}
}
