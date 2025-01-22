package com.gautam.chaurasia.generic.linkedlist;

import java.util.Iterator;

public class TestLinkedList {

	
	public static void main(String[] args)  {
		LinkedList<Integer> ll= new LinkedList<>();
		ll.append(5);
		ll.append(5);
		ll.append(5);
		ll.append(4);
		ll.append(7);
		ll.append(8);
		ll.append(6);
		
		Iterator<Integer> itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" "); 
			}
		
		System.out.println();
		
		try {
			ll.delete(8);
		} catch (LinkedListIsEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("After delete ");
		
		Iterator<Integer> itr1=ll.iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" "); 
			}
	}
}
