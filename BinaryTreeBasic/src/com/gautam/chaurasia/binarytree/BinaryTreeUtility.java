package com.gautam.chaurasia.binarytree;

public class BinaryTreeUtility extends BinaryTree {
	
	public static boolean equals(BinaryTree first , BinaryTree second)
	{
		return equalsV2(first.getRoot() ,second.getRoot());
	}
	public static boolean mirror(BinaryTree first , BinaryTree second)
	{
		return mirrorV2(first.getRoot() ,second.getRoot());
	}

	private static boolean equals(Node root, Node root2) {
		if(root== null && root2==null)
		return true;
		else if(root== null || root2==null)
			return false;
		else if(root.getData()!=root2.getData())
			return false ;
		
		else
		{
			boolean left =equals(root.getLeft(), root2.getLeft());
			if(!left)
				return false ;
			
			boolean right = equals(root.getRight(), root2.getRight());
			return right;
		}
					
	}
	
	
	private static boolean equalsV2(Node root, Node root2) {
		if(root== null && root2==null)
		return true;
		else if(root== null || root2==null)
			return false;
		else
		{
			
			return ( (root.getData()==root2.getData()) && 
					(equalsV2(root.getLeft(), root2.getLeft()) &&
					(equalsV2(root.getRight(), root2.getRight()))));
		}
					
	}
	
	private static boolean mirrorV2(Node root, Node root2) {
		if(root== null && root2==null)
		return true;
		else if(root== null || root2==null)
			return false;
		else
		{
			
			return ( (root.getData()==root2.getData()) && 
					(mirrorV2(root.getLeft(), root2.getRight()) &&
					(mirrorV2(root.getRight(), root2.getLeft()))));
		}
					
	}
}
