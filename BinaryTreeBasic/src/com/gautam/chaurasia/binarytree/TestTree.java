package com.gautam.chaurasia.binarytree;

public class TestTree {
	
	public static void main(String[] args) {
		
//		Node n = new Node(1);
//		Node n1 = new Node(2);
//		Node n2 = new Node(3);
//		Node n3 = new Node(4);
//		Node n4 = new Node(5);
//		Node n5 = new Node(6);
//		Node n6 = new Node(7);
//		   n.setLeft(new Node(2));
//		   n5.setLeft(n6);
//		   n4.setLeft(n5);
//		   n3.setLeft(n4);
//		   n2.setRight(n3);
//		   n1.setLeft(n2);
//		   n.setLeft(n1);
//		BinaryTree tree = new BinaryTree();
//		tree.insert(13);
//		tree.insert(14);
//		tree.insert(16);
//		tree.insert(161);
//		tree.insert(0);
//		tree.insert(14);
//		tree.insert(16);
//		tree.insert(15);
//		tree.insert(17);
//		tree.insert(127);
//		tree.insert(128);
//		tree.insert(122);
//		tree.insert(123);
//		BinaryTree tree2 = new BinaryTree();
//		tree2.insert(13);
//		tree2.insert(16);
//		tree2.insert(14);
//		tree2.insert(0);
//		tree2.insert(161);
//		
//		
//		System.out.println(BinaryTreeUtility.equals(tree, tree2));
//		System.out.println(BinaryTreeUtility.mirror(tree, tree2));
//		
//		System.out.println(tree.printLevelOfData(123));
//		System.out.println(tree.diameterTreeSec());
		
//		Node n= new Node(3);
//		n.setLeft(new Node(9));
//		
//		Node n1 = new Node(20);
//		n1.setLeft(new Node(15));
//		n1.setRight(new Node(7));
//		n.setRight(n1);
		
		Node n= new Node(1);
		n.setLeft(new Node(2));
		BinaryTree tree = new BinaryTree(n);
		tree.preOderTraverse();
		
		System.out.println(tree.sumOfLeftLeaves());
	}
}
