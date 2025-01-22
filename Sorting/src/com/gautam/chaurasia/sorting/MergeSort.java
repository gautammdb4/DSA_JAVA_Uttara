package com.gautam.chaurasia.sorting;

public class MergeSort {

	
	public static void mergeSort(int arr [])
	{
		int low =0;
		int high =arr.length-1;
		
		int [] temp = new int[arr.length];
		mergeSort(arr,low,high,temp);
	}

	private static void mergeSort(int[] arr, int low, int high, int[] temp) {
		int mid ;
		if(low>=high)
			return;
		else
		{
			mid=(low+high)>>1;
			mergeSort(arr, low, mid, temp);
			mergeSort(arr, mid+1, high, temp);
			
			merge(arr,low,mid,high,temp);
		}
		
	}

	private static void merge(int[] arr, int low, int mid, int high, int[] temp) {
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid && j<=high)
		{
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			
			else
				temp[k++]=arr[j++];
			
		}
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		while(j<=high)
		{
			temp[k++]=arr[j++];
		}
		
		for (i = low;   i<= high;  i++) {
			arr[i]=temp[i];
		}
	}
}
