package com.gautam.chaurasia.binaryheap;

public class BinaryHeap {
	
	private int arr[] ;
	
	int N=0;
	
	public BinaryHeap(int size)
	{
		this.arr= new int[size];
		
	}
	
	 public void insert(int a)
	{
		arr[++N]=a;
	}
	 
	 public void heapifying()
	 {
		 for (int i = N/2; i >=1; i--) {
			sink(i);
		}
	 }
	 private void sink(int k) {

			while(2*k<=N)
			{
				int j = 2*k;
				
				if(j<N && greater(j, j+1))
					j++;
				if (!greater(k, j))
					break;
				exch(k, j);
				k = j;
			}
	}
	 
	 private boolean greater(int i , int k)
		{
			return arr[i]>arr[k];
		}
	 
	 private void exch(int i, int k) {
			
			int a= arr[i];
			arr[i]=arr[k];
			arr[k]=a;
			
		}
	 
	 public void print()
		{
			System.out.println();
			
			for(int i=1;i<=N;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
}
