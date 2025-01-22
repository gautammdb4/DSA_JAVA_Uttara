package com.gautam.chaurasia;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList l= new LinkedList();
	
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(6);
		l.add(4);
		l.addAsc(5);
		l.addAsc(1225);
		l.addAsc(688);
		l.addAsc(64);
		l.addAsc(69);
		l.addAsc(63);
		l.addAsc(778);
		
		l.addAsc(5);
		l.addAsc(2);
		l.addAsc(3);
		l.addAsc(1);
		l.addAsc(-1);
		l.addAsc(-1);
		l.addAsc(-1);
		l.addAsc(-1);
		l.addAsc(-1789);
		l.traverse();
		l.printRev();
		System.out.println();
		Node m=l.getMiddle();
		System.out.println(m.getData());
		System.out.println("Size = "+l.size());
		l.delete(5);
		System.out.println("Size = "+l.size());
		l.traverse();
		 
		l.reverseList();
		l.reverseListRecu();
		l.deleteAll(-1);
		l.traverse();
		System.out.println("Size = "+l.size());
		
		
		
		LinkedList l1 = new LinkedList();
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		LinkedList l2 = new LinkedList();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		
		l1.traverse();
		l2.traverse();
		
		LinkedList l3 =LinkedListUtility.addLists(l1, l2);
		l3.traverse();
		Node n = new Node(5);
		Node n1 = new Node(8);
		Node n2 = new Node(10);
		
				n1.setNext(n2);
				n1.getNext().setNext(n);
		
		   n.setNext(new Node(9));
		   n.getNext().setNext(new Node(7));
		   
		   n.getNext().getNext().setNext(n2);
		LinkedList l4 = new LinkedList(n1);
		Node d = LinkedListUtility.getCyclicValueInList(l4.getHead());
		
		System.out.println(LinkedListUtility.isCyclicList(l4.getHead()));
		System.out.println(d.getData());
		
		
		LinkedList l5 = new LinkedList();
		l5.add(1);
		l5.add(2);
		l5.add(4);
		l5.add(5);
		
		Node nn=l5.rev(null,l5.getHead(),1);
//		System.out.println(LinkedListUtility.isPalindrome(l5));
		
		double d1=Math.random();
		
		System.out.println(1239/365);
	}
}
