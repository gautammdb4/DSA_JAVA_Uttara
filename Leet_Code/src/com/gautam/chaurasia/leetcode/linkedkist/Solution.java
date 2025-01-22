package com.gautam.chaurasia.leetcode.linkedkist;

public class Solution {
	
	
	public static void main(String[] args) {
			
		ListNode n=new ListNode(9);
		ListNode n2=new ListNode(9);
		ListNode n3=new ListNode(9);
		ListNode n41=new ListNode(9);
		ListNode n51=new ListNode(9);
		ListNode n61=new ListNode(9);
		ListNode n71=new ListNode(9);
		
		ListNode n4=new ListNode(9);
		n4.next=new ListNode(9);
		 n4.next.next=new ListNode(9);
		 n4.next.next.next=new ListNode(9);
		
		
		ListNode list1=n;
		ListNode list2=n4;
		
		
		n.next=n2;
		n2.next=n3;
		n3.next=n41;
		n41.next=n51;
		n51.next=n61;
		n61.next=n71;
		
		System.out.println(list1.addTwoNumbers(list1, list2));
		System.out.println();
//		n3.next=n4;
		
//		ListNode merge =ListNode.mergeTwoLists(list1, list2);
		
//		System.out.println(ListNode.pairSum(list1));
	}
	
	
}
