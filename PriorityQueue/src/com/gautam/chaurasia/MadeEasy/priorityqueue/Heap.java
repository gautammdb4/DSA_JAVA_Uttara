package com.gautam.chaurasia.MadeEasy.priorityqueue;

import java.util.Iterator;

public class Heap {

	
	private int [] array;
	private int count ;
	private int capacity ;
	private int heap_type ;
	
	
	public Heap()
	{
		this.count=0;
		this.capacity=16;
		this.array= new int [capacity];
	}
	
	public  Heap(int a , int heap_type)
	{
		this.heap_type=heap_type;
		this.count=0;
		this.capacity=a;
		this.array= new int [capacity];
	}
	
	
	public int parant(int i)
	{
		if(i<=0 || i>=this.count)
			return -1 ;
		
		return (i-1)/2;
	}
	
	public int leftChild(int i)
	{
		
		int left=2*i+1;
		if(left>=this.count)
			 return -1 ;
		
		return left ;
	}
	
	public int rightChild(int i)
	{
		int right=2*i+2;
		if(right>=this.count)
			 return -1 ;
		
		return right ;
	}
	
	public int getMax()
	{
		return this.count==0? -1: this.array[0];
	}
	
	public void percolateDown(int i)
	{
		int l , r ,max , temp;
		
		l=leftChild(i);
		r=rightChild(i);
		
		if(l != -1 && array[l] > array[i])
			max=l;
		else
			max=i;
		if(r != -1 && array[r]>array[max])
			max=r;
		
		if(max != i)
		{
			temp=array[i];
			array[i]=array[max];
			array[max]=temp;
			percolateDown(max);
		}
		
		
	}
	
	public int deleteMax()
	{
		if(this.count==0)
			return -1 ;
		
		int data = this.array[0];
		
		this.array[0]=this.array[count-1];
		this.count--;
		percolateDown(0);
		
		return data;
	}
	
	
	public void insert(int data)
	{
		int i;
		
		if(this.count==capacity)
			reSizeHeap();
		
		this.count++;
		i=this.count-1;
		
		while(i>0 && data> this.array[(i-1)/2])
		{
			this.array[i]=this.array[(i-1)/2];
			i=(i-1)/2;
		}
		this.array[i]=data;
	}

	private void reSizeHeap() {
	
		int[] oldA = this.array;
	    this.capacity *= 2;
	    this.array = new int[this.capacity];
	    System.arraycopy(oldA, 0, this.array, 0, this.count);
	 
	 oldA=null;
		
	}

	public void print() {
		
		if(this.array==null || array.length <=0 )
				return ;
		
		for (int i = 0; i < count; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
}
