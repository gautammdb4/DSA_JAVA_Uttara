package com.gautam.chaurasia.binarytree;

import java.util.LinkedList;

public class BinaryTree {

	private int size;
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree(Node root) {
		this.root=root;
	}

	public BinaryTree() {
		// TODO Auto-generated constructor stub
	}

	private boolean isLeaf(Node leaf) {
		// TODO Auto-generated method stub
		return leaf.getLeft() == null ? leaf.getRight() == null ? true : false : false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return root == null ? true : false;
	}

	public void insert(int data) {
		Node n = new Node(data);
		n.setLeft(null);
		n.setRight(null);

		Node temp;
		if (isEmpty()) {
			root = n;
			size++;
			return;
		}

		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			temp = queue.removeFirst();
			if (null != temp.getLeft()) {
				queue.addLast(temp.getLeft());
			} else {
				temp.setLeft(n);
				size++;
				return;

			}
			if (null != temp.getRight()) {
				queue.addLast(temp.getRight());
			} else {
				temp.setRight(n);
				size++;
				return;

			}
		}
	}

	public void levelOrderTravs() {

		if (isEmpty()) {
			System.out.println("Tree is Empty");
			return;
		}
		LinkedList<Node> queue = new LinkedList<Node>();
		queue.addLast(root);
//		System.out.print(root.getData()+" ");
		while (!queue.isEmpty()) {
			Node temp = queue.removeFirst();
			System.out.print(temp.getData() + " ");
			if (temp.getLeft() != null) {
//				System.out.print(temp.getLeft().getData()+" ");
				queue.addLast(temp.getLeft());
			}
			if (temp.getRight() != null) {
//				System.out.print(temp.getRight().getData()+" ");
				queue.addLast(temp.getRight());
				;
			}
		}
		System.out.println();
	}

	public void preOderTraverse() {
		preOrder(this.root);
		System.out.println();
	}

	private void preOrder(Node root) {

		if (root == null)
			return;
		else {
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}

	}

	public void inOderTraverse() {
		inOrder(this.root);
		System.out.println();
	}

	private void inOrder(Node root) {

		if (root == null)
			return;
		else {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}

	}

	public void postTraverse() {
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node root) {

		if (root == null)
			return;
		else {
			postOrder(root.getLeft());

			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}

	}

	public void printLeaves() {
		pritLeaves(root);
		System.out.println();
	}

	private void pritLeaves(Node root) {
		if (root == null)
			return;
		else {
			if (isLeaf(root)) {
				System.out.print(root.getData() + " ");
				return;
			}

			pritLeaves(root.getLeft());
			pritLeaves(root.getRight());
		}

	}

	private void pritLeftBoundary(Node root) {
		if (root == null)
			return;
		else {
			if (isLeaf(root)) {
				return;
			}
			System.out.print(root.getData() + " ");
			pritLeftBoundary(root.getLeft());
		}

	}

	private void pritRightBoundary(Node root) {
		if (root == null)
			return;
		else {
			if (isLeaf(root)) {
				return;
			}

			pritRightBoundary(root.getRight());
			System.out.print(root.getData() + " ");
		}

	}

	public void printBoundary() {
		pritLeftBoundary(root);
		pritLeaves(root);
		pritRightBoundary(root.getRight());
		System.out.println();
	}

	public void maxElement() {
		System.out.println(maxElement(root));
	}

	private int maxElement(Node root) {
		
		if (root== null) return 0;
		
		else
		{
//			int left =maxElement(root.getLeft());
//			int right =maxElement(root.getRight());
//			
//			int max= Math.max(left, right);
//			max=Math.max(root.getData(), max);
//			return max;
			
		return Math.max(root.getData(), Math.max(maxElement(root.getLeft()), maxElement(root.getRight())));
			
		}
		
	}

	public int getSize() {
		return getSize(root);
	}

	private int getSize(Node root) {
		if(root==null) return 0;
		
		else
		{
//			int left=getSize(root.getLeft());
//			int right=getSize(root.getRight());
			
			return 1+getSize(root.getLeft())+getSize(root.getRight());
		}
	}
	

	public int getHeight() {
		return getHeight(root);
	}

	private int getHeight(Node root) {
		if (root == null)
			return 0;

		else {
//			int left = getHeight(root.getLeft());
//			int right = getHeight(root.getRight());
//			int max = Math.max(left, right);
//			return 1+max;
			return 1+Math.max(getHeight(root.getLeft()), getHeight(root.getRight()));
		}
	}
	public BinaryTree copyTree()
	{
		BinaryTree tree = new BinaryTree(copyTree(root));
		return tree;
		
	}
	private Node copyTree(Node root) {
		if (root == null)
			return null;
		else {
			Node newN = new Node(root.getData());

			Node Left = copyTree(root.getLeft());
			Node right = copyTree(root.getRight());

			newN.setLeft(Left);
			newN.setRight(right);

			return newN;
		}
	}
	
	public BinaryTree mirrorTree()
	{
		BinaryTree tree = new BinaryTree(mirrorTree(root));
		return tree;
		
	}
	
	private Node mirrorTree(Node root) {
		if (root == null)
			return null;
		else {
			Node newN = new Node(root.getData());

			Node Left = mirrorTree(root.getLeft());
			Node right = mirrorTree(root.getRight());

			newN.setLeft(right);
			newN.setRight(Left);

			return newN;
		}
	}
	
	public boolean contains(int data)
	{
		return contains(root, data);
	}
	private boolean contains(Node root ,int data)
	{
		if(root==null)
			return false ;
		
		else if(root.getData()==data)
			return true ;
		
//		else
//		{
//			boolean left = contains(root.getLeft(), data);
//			if(left)
//				return left ;
//			
//			boolean right = contains(root.getRight(), data);
//
//			return right ;
//			
//		}
		else
			return contains(root.getLeft(), data)?true :contains(root.getRight(), data);
		
	}
	
	public boolean printAncestor(int data)
	{
		return printAncestor(root, data);
		
	}

	private boolean printAncestor(Node root, int data) {
		if(root==null)
			return false ;
		
//		else if(root.getData()==data)
//			return true ;
//		
//		else
//		{
//			boolean left = printAncestor(root.getLeft(), data);
//			if(left) {
//				System.out.print(root.getData()+" ");
//				return left ;
//				}
//			
//			boolean right = printAncestor(root.getRight(), data);
//			if(right) {
//				System.out.print(root.getData()+" ");
//				return right ;
//				}
//
//			
//			return right ;
//		}
//		
//	}
		else if( (root.getData()==data) || (printAncestor(root.getLeft(), data)) ||
				 (printAncestor(root.getRight(), data)))
		{
			if(root.getData()!=data)
				System.out.print(root.getData()+" ");
			
			
			return true ;
			}
		
		return false;
		}
	
	public int printLevelOfData(int data)
	{
		return printLevelOfData(root, data);
		
	}

	private int printLevelOfData(Node root, int data) {
		if(root==null)
			return -1 ;
		
		else if(root.getData()==data)
			return 0 ;
		
		else
		{
			int left = printLevelOfData(root.getLeft(), data);
			if(left !=-1) 
				return ++left ;
			
			int right = printLevelOfData(root.getRight(), data);
			if(right !=-1)
				return ++right ;

			
			return -1 ;
		}
		
	}
//		else if( (root.getData()==data) || (printAncestor(root.getLeft(), data)) ||
//				 (printAncestor(root.getRight(), data)))
//		{
//			if(root.getData()!=data)
//				System.out.print(root.getData()+" ");
//			
//			
//			return true ;
//			}
//		
//		return false;
//		}
	
	
	public void convertMirrorTree()
	{
		convertMirrorTree(root);
	
		
	}
	
	private void convertMirrorTree(Node root) {
		if (root == null)
			return ;
		else if(isLeaf(root))
			return ;
		else {
			
			convertMirrorTree(root.getLeft());
			convertMirrorTree(root.getRight());
			
			Node newN = root.getLeft();
			 root.setLeft(root.getRight());
			 root.setRight(newN);
			 return;
		}
	}
	
	public int diameterTreeSec()
	{
		return diameterTreeSec(root);
		
	}

	private int diameterTreeSec(Node root) {
		int leftDiameter ,rightDiameter ;
		if(null==root)
			return 0;
		
		else
		{
			leftDiameter=diameterTreeSec(root.getLeft());
			rightDiameter=diameterTreeSec(root.getRight());
			
			
			int numNodeLeft = getHeight(root.getLeft());
			int numNodeRight=getHeight(root.getRight());
			
			return Math.max(numNodeRight+ numNodeLeft+1 ,
					Math.max(rightDiameter, leftDiameter));
			
		}
	}

	public int  sumOfLeftLeaves() {
		return sumOfLeftLeaves(root);
		
		
	}

	private int sumOfLeftLeaves(Node root) {
		
		if(root==null)
			return 0;
		
		else if(isLeaf(root))
				return 0;
		
		else
		{
			int leftSum= sumOfLeftLeaves(root.getLeft()) ;
				if(root.getLeft()!=null)
					leftSum += root.getLeft().getData();
				
			if(!isLeaf(root.getRight())) {
				int rightLeftSum=sumOfLeftLeaves(root.getRight()); 
				return leftSum+rightLeftSum ;
			}
			
			return leftSum;
		}
		
				
		
	}
}

