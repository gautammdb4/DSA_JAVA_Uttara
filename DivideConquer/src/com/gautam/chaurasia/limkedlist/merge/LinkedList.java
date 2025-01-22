package com.gautam.chaurasia.limkedlist.merge;

public class LinkedList {

	private int size;
	private Node head;

	public LinkedList(Node dataNode) {
		this.head = dataNode;
	}

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	void add(int data) {

		// create a new node
		Node n = new Node(data);

		// checking is this a first node
		if (head == null) {
			head = n;
			size++;
			return;
		}

		else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(n);
			size++;
		}

	}

	void traverse() {
		Node temp = head;
		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
		System.out.println("]");
	}

	public Node getMiddle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast=fast.getNext().getNext();
		}
		return slow;
	}

	
	public void sort()
	{
		head=sort(head);
	}
	
	private Node sort(Node head) {
		
		if(head==null || head.getNext()==null)
			return head;
		
		else
		{
			Node mid=getMiddle(head);
			
			if(mid.getNext()==null)
			{ 
				head.setNext(null);
				return merge(head, mid);
			}
			Node splitH =mid.getNext();
			mid.setNext(null);
			
			Node first =sort(head);
			Node second =sort(splitH);
			
			return merge(first, second);
			
		}
	
		
	}

	public void merge(LinkedList l1, LinkedList l2) {
		this.head = merge(l1.getHead(), l2.getHead());
	}

	private Node merge(Node nodeA, Node nodeB) {
		
		Node mergeNode;
		Node headNode;
		
		if(nodeA==null && nodeB==null)
			return null;
		else if (nodeA == null)
			return nodeB;
		
		else if (nodeB == null)
			return nodeA;
		
		
		if(nodeA.getData()<nodeB.getData())
		{
			mergeNode=nodeA;
			nodeA=nodeA.getNext();
			headNode=mergeNode;
		}
		else
		{
			mergeNode=nodeB;
			nodeB=nodeB.getNext();
			headNode=mergeNode;
		}
		
		while(nodeA!=null && nodeB!=null)
		{
			if(nodeA.getData()<nodeB.getData())
			{
				mergeNode.setNext(nodeA);
				nodeA=nodeA.getNext();
			}
			else
			{
				mergeNode.setNext(nodeB);
				nodeB=nodeB.getNext();
			}
			mergeNode=mergeNode.getNext();
		}
		
		if(nodeA!=null)
			 mergeNode.setNext(nodeA);
		else if(nodeB!=null)
			mergeNode.setNext(nodeB);
		
		
		return headNode;
	}
}
