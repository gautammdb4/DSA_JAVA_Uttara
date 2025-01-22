package com.gautam.chaurasia.stack;

public class Stack {
	
	Node top;
	 int size;
	
	public boolean isEmpty() {
		return size==0  ;
	}
	
	
	void push(int data)
	{
		Node n = new Node(data);
		if(top==null) {
			top=n;
			size++; 
		}
		else 
		{
			Node temp=top;
			top=n;
			top.setNext(temp);
			temp= null;
			size++;
		}
	}
	
	void traverse() {
		if(isEmpty())
		  System.out.println("Stack Is Empty");
		
		else
		{
			Node t=top;
			System.out.print("Stack [");
			while(t!=null)
			{
				if(t.getNext()==null)
				System.out.print(t.getData()+"");
				
				else
					System.out.print(t.getData()+",");
				
				t=t.getNext();
			}
			System.out.println("]");
		}
	}
	
	Integer pop() {
		if(isEmpty()) {
			  System.out.println("Stack Is Empty"); 
			  return null;
		}
		
		else
		{
			Node t=top;
			top=top.getNext();
			size--;
			return Integer.valueOf(t.getData());
		}
		
		
	}
	
	Integer peek () {
	  return top==null ? null: Integer.valueOf(top.getData()) ;
	  }
	
	 int size() {
	 return size;
	}
	@Override
	public String toString() {
		return "Stack [Top =" + top + "]";
	}
	
	  
}
