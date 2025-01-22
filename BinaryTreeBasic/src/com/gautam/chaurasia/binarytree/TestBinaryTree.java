package com.gautam.chaurasia.binarytree;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		tree.insert(7);
//		tree.insert(8);
//		tree.insert(9);
//		tree.insert(10);
//		tree.insert(11);
//		tree.insert(12);
//		tree.insert(13);
//		tree.insert(14);
//		tree.insert(15);
//		tree.insert(16);
//		tree.insert(20);
//		tree.insert(15);
//		tree.insert(16);
//		tree.insert(11);
//		tree.insert(12);
//		tree.insert(13);
//		tree.insert(14);
//		tree.insert(15);
//		tree.insert(16);
		
		System.out.println("hight of tree ");
		System.out.println(tree.diameterTreeSec());
		System.out.println("Level Oder Traverse ");
		tree.levelOrderTravs();
		System.out.println("Pre Oder Traverse ");
		tree.preOderTraverse();
		System.out.println("IN Oder Traverse ");
		tree.inOderTraverse();
		System.out.println("Post Oder Traverse ");
		tree.postTraverse();
		System.out.println("Print Leaf ");
		tree.printLeaves();
		System.out.println("Print Boundary ");
		tree.printBoundary();
		System.out.println("Max value In Tree ");
		tree.maxElement();
		System.out.println("size of In Tree ");
		System.out.println(tree.getSize());
		System.out.println("Height of In Tree ");
		System.out.println(tree.getHeight());
		System.out.println("pre Oder Traverse ");
		tree.preOderTraverse();
		System.out.println("copying Tree ");
		BinaryTree copyTree = tree.copyTree();
		copyTree.preOderTraverse();
		System.out.println("Mirror Tree ");
		BinaryTree mTree = tree.mirrorTree();
		tree.convertMirrorTree();
		mTree.preOderTraverse();
		System.out.println("Pre Oder Traverse ");
		tree.preOderTraverse();
	}
}
