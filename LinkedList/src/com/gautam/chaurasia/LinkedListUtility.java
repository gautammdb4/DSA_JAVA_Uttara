package com.gautam.chaurasia;

import java.util.Stack;

public class LinkedListUtility extends LinkedList{
	
	
	public static LinkedList addLists(LinkedList l1 , LinkedList l2)
	{
		
		NodeSum sum = addListHelper(l1.getHead(), l2.getHead());
		if(sum.getCarry()!=0)
		{
			Node newN = new Node(sum.getCarry());
			newN.setNext(sum.getDataNode());
			return new LinkedList(newN);
		}
		else
			return new LinkedList(sum.getDataNode());
	}
	
	private static NodeSum addListHelper(Node l1, Node l2) {
		if(l1==null && l2==null)
		{
			return new NodeSum(null, 0);
		}
		else
		{
			NodeSum fsum =addListHelper(l1.getNext(), l2.getNext());
			int val=l1.getData()+l2.getData()+fsum.getCarry();
			Node nodeN = new Node(val%10);
			fsum.setCarry(val/10);
			nodeN.setNext(fsum.getDataNode());
			fsum.setDataNode(nodeN);
			
			return fsum;
		}
		
		
	}
	
	public static boolean  isCyclicList(Node head)
	{
		if(head == null || head.getNext() == null)
			return false ;
		
		Node fast = head ;
		Node slow = head ;
		
		while(fast.getNext() !=null )
		{
			slow=slow.getNext();
			fast= fast.getNext().getNext();
			
			if(fast==slow)
				return true;
		}
		
		return false;
		
	}
	public static Node  getCyclicValueInList(Node head)
	{
		if(head == null || head.getNext() == null)
			return null ;
		
		Node fast = head ;
		Node slow = head ;
		
		while(fast.getNext() !=null )
		{
			slow=slow.getNext();
			fast= fast.getNext().getNext();
			
			if(fast==slow)
			{
				Node first =head ;
				Node last=fast;
				while(first!=last)
				{
					first=first.getNext();
					last=last.getNext();
					if(first==last)
						return first;
				}
				return first==last ?first : null;
			}
		}
		
		return null;
		
	}
	 
	
	 public static boolean isPalindrome(LinkedList ll) {
		 Node temp=ll.getHead();

	        Stack<Integer> stack = new Stack<>();

	        createStack(temp ,stack);
	        temp=ll.getHead();
	        while(temp!=null)
	        {
	            if(temp.getData()!=stack.pop())
	                return false;
	        }

	        return true;
	    }

	     public static void createStack(Node temp,Stack<Integer> stack) {
	            
	            if(temp==null)
	                return;
	            else
	            {
	                stack.push(temp.getData());
	                createStack(temp.getNext() ,stack);
	            }

	     }
}
