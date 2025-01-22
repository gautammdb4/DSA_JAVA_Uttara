package com.gautam.chaurasia.sorting;

public class BubbleSort {

	
	public static void bubbleSort(int a[])
	{
		 
		int n = a.length;
		for(int i=0 ; i<n-1 ; i++)
		{
			boolean swapped = false;
			for (int j = 0; j < n-i-1; j++) {
				
				if(a[j]>a[j+1])
				{
//					int t =a[j];
//					a[j]=a[j+1];
//					a[j+1]=t;
					
					a[j]=a[j]^a[j+1];
					a[j+1]=a[j]^a[j+1];
					a[j]=a[j]^a[j+1];
					
					swapped=true;
				}
			}
			
				System.out.println("Iteration  "+(i+1));
				for (int mi : a) {
					System.out.print(mi+" ");
				}
				System.out.println();
				
				if(!swapped)
					break;
		}
		
		
	}
}
