package com.gautam.chaurasia.augmentedtree;

public class Node {

	Node left;
	Node right;
	int size;
	int data;
	
	

	public Node(int data) {
		super();
		this.size = 1;
		this.left = null;
		this.right = null;
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	public int getSize() {
		return size;
	}

	public int getData() {
		return data;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setData(int data) {
		this.data = data;
	}

}
