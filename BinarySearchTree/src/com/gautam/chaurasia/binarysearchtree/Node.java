package com.gautam.chaurasia.binarysearchtree;

public class Node {


	private int data;
	private Node left;
	private Node right;

	public Node(int data) {
		super();
		this.data = data;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}



}
