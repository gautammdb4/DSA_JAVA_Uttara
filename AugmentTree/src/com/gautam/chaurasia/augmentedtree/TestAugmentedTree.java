package com.gautam.chaurasia.augmentedtree;

public class TestAugmentedTree {

	
	public static void main(String[] args) {
		
		AugmentedTree tree = new AugmentedTree();
		tree.insert(50);
		tree.insert(25);
		tree.insert(15);
		tree.insert(35);
		tree.insert(75);
		tree.insert(60);
		tree.insert(90);
		
		tree.traverse();
		System.out.println(tree.search(5));
		tree.delete(15);
		tree.traverse();
		System.out.println(tree.search(5));

	}
}
