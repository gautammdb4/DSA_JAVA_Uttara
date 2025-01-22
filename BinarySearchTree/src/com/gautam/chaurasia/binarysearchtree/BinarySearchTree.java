package com.gautam.chaurasia.binarysearchtree;


public class BinarySearchTree {
	
	private Node root ;
	private int diameter=0;
	private int prev;
	
	public BinarySearchTree(Node r) {
		this.root=r;
	}

	public BinarySearchTree() {
		// TODO Auto-generated constructor stub
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
	
	public void insert(int data)
	{
		root = insert(root,data);
	}


	private Node insert(Node root, int data) {
		if(root== null)
		 {
			Node newN = new Node(data);
			return newN ;
		 }
		
		else
		{
			if(data<root.getData())
			{
			 root.setLeft(insert(root.getLeft(), data));
			}
			else
				root.setRight(insert(root.getRight(), data));
		}
		return root;
		
		
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
	
	public boolean search(int data)
	{
		return search(root ,data);
	}


	private boolean search(Node root, int data) {
		
		if(root==null)
			return false;
		
		else if(root.getData()==data)
			return true;
		
		else
		{    if(root.getData()>data)
			   return	search(root.getLeft(), data);
			else
			 return  search(root.getRight(), data);
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
	
	public int diameterTree()
	{
		diameter=0;
		diameterTree(root);
		return diameter;
	}

	private int diameterTree(Node root) {
		// TODO Auto-generated method stub
		int left ,right ;
		if(root==null)
			return 0;
		
		else
		{
			left=diameterTree(root.getLeft());
			right=diameterTree(root.getRight());
			if(left+right+1>diameter)
				diameter=left+right+1;
			return Math.max(left, right) +1;
		}
		
	}
	
	public int getDiameter()
	{
		DiaHeight dh = new DiaHeight(0, 0);
		DiaHeight dh_r=getDiameter(root ,dh);
		return dh_r.getDiameter();
	}

	private DiaHeight getDiameter(Node root, DiaHeight dh) {
		if(root ==null)
			return dh;
		
		else
		{
			DiaHeight left = getDiameter(root.getLeft(), dh);
			DiaHeight right =getDiameter(root.getRight(), dh);
		}
		return dh;
	}


	public Node findMax()
	{
		Node temp=findMax(root);
		System.out.println(temp.getData());
		return temp;
		
		
	}

	private Node findMax(Node root) {
			
			if(root.getRight()!=null)
				return findMax(root.getRight());
			else
				return  root;
	}
	
	public int findMin()
	{
		return findMin(root);
		
	}

	private int findMin(Node root) {
		
		if(root == null)
			return Integer.MAX_VALUE;
		else
		{
			int max=findMin(root.getLeft());
			return Math.min(max, root.getData());
		}
	}
	
	public Node delete(int data)
	{
		return delete(root , data);
		
	}

	private Node delete(Node root, int data) {
		if(root==null)
		{
			System.out.println("Element not found");
			return null;
		}
		else if(data<root.getData())
			root.setLeft( delete(root.getLeft() ,data));
		else if(data> root.getData())
			root.setRight(delete(root.getRight() ,data));
		else
		{
			if(root.getLeft()!=null && root.getRight()!=null)
			{
				Node temp =findMax(root.getLeft());
				root.setData(temp.getData());
				root.setLeft(delete(root.getLeft(), temp.getData()));
			}
			
			else if(root.getLeft()!=null)
				return root.getLeft();
			else if(root.getRight()!=null)
				return root.getRight();
			else
				return null;
			
		}
		
		return root;
	}
	
	public boolean isBST()
	{
		prev=Integer.MIN_VALUE;
		
		return isBST(root);
		
	}

	private boolean isBST(Node root) {
		if(root== null)
			return true;
		
		else
		{
			boolean left =isBST(root.getLeft());
			
			if (!left) {
				return left;
			}
			
			if(prev >root.getData())
				return false ;
			
			prev=root.getData();
			
			boolean right=isBST(root.getRight());
			
			return right;
		}
	}
	
	
	public BinarySearchTree constructBST(int [] a)
	{
		Node r = constructBST(a,0,a.length-1);
		
		return new BinarySearchTree(r);
	}

	private Node constructBST(int[] a, int start, int end) {
		if(end<start)
			return null;
		
		else
		{
			int mid =(start+end)>>1;
			Node newN = new Node(a[mid]);
			newN.setLeft(constructBST(a, start, mid-1));
			newN.setRight(constructBST(a, mid+1, end));
			
			return newN;
		}
	}
}
