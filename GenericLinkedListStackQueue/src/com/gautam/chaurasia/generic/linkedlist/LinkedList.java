package com.gautam.chaurasia.generic.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements Iterable<T> {

	private int size;
	private Node<T> head;
	private Node<T> tail;

	public boolean isEmpty() {
		return head == null;

	}
	
	public void append(T data) {
		Node<T> n = new Node<T>(data);
		if(isEmpty())
		{
			head=tail=n;
			size++;
			return;
		}
		else
		{
			tail.setNext(n);
			tail=n;
			size++;
		}
	}
	
	
	public void traverse()
	{
		if(isEmpty())
			System.out.println("List is Empty");
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListItertor();
	}
	
	public void delete(T data) throws LinkedListIsEmptyException   {
		
		//if no Element in linked list 
		if(isEmpty())
			throw new LinkedListIsEmptyException("LinkedList is Empty");
		
		// if head is a element
		if(head.getData().equals(data))
		{
			Node<T> temp= head;
			head=head.getNext();
			temp.setNext(null);
			size--;
			return;
		}
		else
		{
			Node<T> previous =head;
			Node<T> current = head.getNext();
			while(current !=null)
			{
				if(current.getData().equals(data)) {
					previous.setNext(current.getNext());
					current.setNext(null);
					size--;
					return;
				}
				else
				{
					current=current.getNext();
					previous=previous.getNext();
				}
			}
			
			if (current==null) {
				throw new NoSuchElementException();
			}
		}
		

	}
	
	public class ListItertor implements Iterator<T> {
		
		Node<T> current= head;
		@Override
		public boolean hasNext() {
			
			return current!=null;
		}

		@Override
		public T next() {
			if(!hasNext())
				 throw new NoSuchElementException();
			T data= current.getData();
			current=current.getNext();
			return data;
		}

	}
}
