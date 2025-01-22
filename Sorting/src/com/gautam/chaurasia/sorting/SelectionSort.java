package com.gautam.chaurasia.sorting;

public class SelectionSort {

	
	public static void selectionSort(int [] a)
	{
		int n =a.length;
		
		for (int i = 0; i < n; i++) {
			
			int min =i;
			boolean swapped=false;
			for (int j = i+1; j < n; j++) {
				if(a[min]>a[j])
				{
					min=j;
					swapped=true;
					}
			}
			
			if(swapped) {
			int t =a[min];
			a[min]=a[i];
			a[i]=t; }
			
			else
				break;
			System.out.println("Iteration  "+(i+1));
			for (int mi : a) {
				System.out.print(mi+" ");
			}
			System.out.println();	
		}
	}
}
