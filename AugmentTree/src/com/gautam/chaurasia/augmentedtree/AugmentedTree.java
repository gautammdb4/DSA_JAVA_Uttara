package com.gautam.chaurasia.augmentedtree;


public class AugmentedTree {
	
	Node root;
	
	private int numNode() {
		return root != null ?root.getSize() :0;
	}
	
	private int size(Node root) {
		return root!=null ? root.getSize() :0;
	}

	
	public void insert(int data)
	{
		root= insert(root ,data);
		return ;
	}

	private Node insert(Node root, int data) {
		
		if (root==null)
		{ 
			Node n = new Node(data);
			root=n;
			return root;
		}
		else
		{
			if(root.getData()>data)
			  root.setLeft(insert(root.getLeft(),data));
			else if(root.getData()<data)
				root.setRight(insert(root.getRight(), data));
			
//			root.setSize( ( (root.getRight()!= null ? root.getRight().getSize() :0 ) + (root.getLeft()!= null ?root.getLeft().getSize():0) )+1 );
			root.setSize(size(root.getLeft()) + size(root.getRight()) +1 );
		}
		return root;
	}
	
	
	public  int search(int k)
	{
		if(k>numNode()) {
			System.out.println("Not So Many Element");
			return 0;
		}
		return search (root ,k);
		
		
	}
	
	private int search(Node root, int k) {
		if(root ==null)
			return 0;
		else
		{ 
			int r =size(root.getLeft())+1;
			
			if(k <r)
				return	search(root.getLeft(), k);
			else if(k>r)
				return	search(root.getRight() , k-r);
			
			else
				return root.getData();
			
		}
	}

	
	public void traverse()
	{
		traverse(root);
		System.out.println();
	}

	private void traverse(Node root) {
		// TODO Auto-generated method stub
		if(root== null)
			return ;
		
		else
		{
			traverse(root.getLeft());
			System.out.print(root.getData()+" ");
			traverse(root.getRight());
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
		root.setSize(size(root.getLeft())+ size(root.getRight()) +1);
		return root;
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
}
