package com.gautam.chaurasia.stack.in.array;

public class Stack implements IStack {

	int top;
	int [] a;
	
	public Stack(int size) {
	 a= new int [size];
	 top=-1;
	}
	@Override
	public void push(int data) {
		if(top==a.length-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			a[++top]=data;
		}
		
	}

	
	@Override
	public int pop() {
		
		return a[top--];
	}
	@Override
	public void traverse() {
		
		if (isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.print("[");
			for (int i=0;i<=top ; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print("]");
		}
		
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
	
}
