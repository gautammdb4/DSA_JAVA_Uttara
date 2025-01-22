package com.gautam.chaurasia.sorting;

public class QuickSort {

	
	public static void quickSort(int []arr ,int low , int high) {
		
		if(low>=high)
			 return ;
		
		else
		{
			int pivotIn=partition( arr ,  low ,  high);
			quickSort(arr, low, pivotIn-1);
			quickSort(arr, pivotIn+1, high);
		}
	}

	private static int partition(int [] arr , int low, int high) {
		int left , right , pivot ,temp;
		
		
		
		int randPI =(low + (int)(Math.random()*(high-low+1)));
		
		if(low!=randPI)
		{
//			arr[low] ^=arr[randPI];
//			arr[randPI]^=arr[low];
//			arr[low] ^=arr[randPI];
			
			temp=arr[low];
			arr[low]=arr[randPI];
			arr[randPI]=temp;
		}
		
		pivot=arr[low];
		left=low;
		right=high;
		
		while(left<right)
		{
			
			while(left < right && arr[left]<=pivot)
					 left++;
			
			while(arr[right]>pivot)
				right --;
			
			if(left<right)
			{
				temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
			
			
		}
		
		if(low!=right)
		{
			temp=arr[low];
			arr[low]=arr[right];
			arr[right]=temp;
		}
		
		return right;
	}

}
