package com.gautam.chaurasia.hashset;

public class Node {

	private int data;
	private Node next;

	public Node()
	{
		
	}
	
	public Node(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getNext() {
		return next;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
