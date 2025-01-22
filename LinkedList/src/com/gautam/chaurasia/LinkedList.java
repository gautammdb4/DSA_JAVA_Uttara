package com.gautam.chaurasia;

public class LinkedList {
	
	private int size;
	private Node head;
	
	public LinkedList(Node dataNode) {
		this.head=dataNode;
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
		
		//checking is this a first node 
		if (head == null) {
			head = n;
			size++;
			return;
		}
		
		else {
			Node temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(n);
			size++;
		}
		
	}
	
	void addAsc(int data)
	{
		// create a new node
		Node n = new Node(data); 
		
		//checking is this a first node 
		if (head == null) {
			head = n;
			size++;
			return;
		}
		//if only head is there
		else if(head.getData()>data){
			Node temp=head;
			head=n;
			head.setNext(temp);
			size++;
		}
		else if(head.getNext() == null)
		{
			head.setNext(n);
			size++;
			
		}
		else
		{
			Node prev=head;
			Node temp=head.getNext();
			while(temp!=null)
			{
				if(temp.getData()>data)
				{
					prev.setNext(n);
					prev=prev.getNext();
					prev.setNext(temp);
			
					size++;
					return ;
				}
				else
				{
					
					prev=prev.getNext();
					temp=temp.getNext();
				}
			}
			
		}
	
	}
	void traverse()
	{
		Node temp =head;
		System.out.print("[");
		while(temp!=null)
		{
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println("]");
	}

	@Override
	public String toString() {
		return "LinkedList ["+ head +"]";
	}

	public void printReverse(Node temp) {
		if(temp==null)
		{	
			return;
		}
		else
		{
			printReverse(temp.getNext());
			System.out.print(temp.getData()+" ");
		}
		
	}

	public void printRev() {
		printReverse(head);
		
	}
	
	Node getMiddle() 
	{
		Node s;
		Node f=s=head;
		while(f!=null && f.getNext()!=null)
		{
			f=f.getNext().getNext();
			s=s.getNext();
		}
		return s;
	}

	public int size() {
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return head== null? true : false ;
	}

	 void delete(int data) {
		if(head==null) {
			return; 
			}
		
		else if(data==head.getData())
		{
			head=head.getNext();
			size--;
		}
		else
		{
			Node temp=head.getNext();
			Node prev=head;
			while(temp!=null) {
				if(temp.getData()==data) {
					prev.setNext(temp.getNext());
					temp.setNext(null);
					size--;
					return;
				}
				else
				{
					prev=temp;
					temp=temp.getNext();
				}
			}
		}
	}
	 
	 void deleteAll(int data) {
			if(head==null) {
				return; 
				}
			
			else
			{
				Node temp = head;
				Node prev = null;
				while (temp != null) 
				{
					if (temp.getData() == data) {
						prev=temp.getNext();
						temp=temp.getNext();
						size--;
					} else {
						prev = temp;
						temp = temp.getNext();
					}
						
					} 
				 }
		}

	public void reverseList() {
		if(head==null)
			return;
		else
		{
			Node prev=null;
			Node curr=head ;
			Node temp=head;
			while(temp!=null)
			{
				temp=temp.getNext();
				curr.setNext(prev);
				prev=curr;
				
				curr=temp;
			}
			head=prev;
		}
		
	}

	public void reverseListRecu() {

		reverseRecu(null,head);
		
	}

	private void reverseRecu(Node prev, Node curr) {
		
		if(curr==null) {
			head=prev;
			return;
		}
		else
		{
			Node temp=curr.getNext();
			curr.setNext(prev);
			reverseRecu(curr, temp);
			curr.setNext(prev);
		}
	}
	
	public Node rev(Node prev, Node curr, int c) 
	{if(curr ==null)
        return prev;
    else
    {
      Node  temp =curr.getNext();
        curr.setNext(prev);
        System.out.println(c++);
        return rev(curr, temp ,c);
    }
		
	}
}
