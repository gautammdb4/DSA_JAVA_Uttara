package com.gautam.chaurasia.limkedlist.merge;

public class TestLLDCMerge {

	public static void main(String[] args) {
		
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add(3);
		l1.add(5);
		l1.add(14);
		l1.add(6);
		l1.add(16);
		l1.add(10);
		l1.traverse();
		l1.sort();
		l1.traverse();
		
		LinkedList l2= new LinkedList();
		l2.add(1);
		l2.add(2);
		l2.add(4);
		l2.add(7);
		l2.add(8);
		
		l1.merge(l1, l2);
		
		l1.traverse();
	}
}
