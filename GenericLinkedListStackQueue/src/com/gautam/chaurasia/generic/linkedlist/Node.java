package com.gautam.chaurasia.generic.linkedlist;

public class Node<T> {

	private T data;
	private Node<T> next;

	public Node(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
