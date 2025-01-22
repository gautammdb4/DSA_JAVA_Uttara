package com.gautam.chaurasia.queue;

import com.gautam.chaurasia.stack.Node;

public class Queue {

	Node front, rear;
	int size;

	int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	void enQueue(int data) {
		Node n = new Node(data);
		if (isEmpty()) {
			front = rear = n;
			size++;
		} else {
			rear.setNext(n);
			rear = n;
			size++;
		}
	}

	Integer deQueue() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		else
		{	
			if(front==rear) {
				Node t= front;
				front=rear=null;
				size--;
				return Integer.valueOf(t.getData()); 
			}
			else {
				Node t=front;
			front=front.getNext();
			size--;
			return Integer.valueOf(t.getData()); 
			}
		}
	}
	
	Integer peek () {
		  return front==null ? null: Integer.valueOf(front.getData()) ;
		  }
		
	
	void travese() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			Node temp=front;
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
				
			}
		}
	}
	@Override
	public String toString() {
		return "Queue [" + front + "]";
	}
}
