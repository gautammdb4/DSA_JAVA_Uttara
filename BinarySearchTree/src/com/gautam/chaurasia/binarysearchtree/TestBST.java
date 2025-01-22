package com.gautam.chaurasia.binarysearchtree;

public class TestBST {
	
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(6);
		tree.insert(20);
		tree.insert(15);
		tree.insert(30);
		tree.insert(40);
		tree.insert(50);
		tree.insert(-5000);
		
		tree.inOderTraverse();
		
		System.out.println(tree.findMax().getData());
		System.out.println(tree.findMin());
		
		int a[]= {10,20,30,40,50,60,70,80};
		
		BinarySearchTree tree2 = new BinarySearchTree();
		tree2=tree2.constructBST(a);
		tree2.inOderTraverse();
	}
}
