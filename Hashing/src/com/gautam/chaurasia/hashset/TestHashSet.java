package com.gautam.chaurasia.hashset;

public class TestHashSet {
	
	
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(5);
		h.add(48);
		h.add(21);
		h.add(37);
		for(int i=0;i<=16;i++)
		{
			h.add(i);
		}
		
		h.add(21);
		h.remove(6);
		
		h.print();
		
		
		java.util.HashSet<Integer> h1 =new java.util.HashSet<>();
		h1.add(5);
		h1.add(48);
		h1.add(21);
		h1.add(37);
		for(int i=0;i<=16;i++)
		{
			h1.add(i);
		}
		
		h1.add(21);
		
		System.out.println(h1);
	}
	
}
