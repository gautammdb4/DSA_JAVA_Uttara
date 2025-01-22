package com.gautam.chaurasia.limkedlist.merge;


public class Node {



	private int data;
	private Node next;

	public Node(int data) {
		this.data = data;

	}

	public int getData() {

		return data;
	}

	@Override
	public String toString() {
		if(next ==null)
			return  data+"" ;
		else
			return  data+","+next ;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}


}
