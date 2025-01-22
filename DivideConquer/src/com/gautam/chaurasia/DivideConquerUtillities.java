package com.gautam.chaurasia;

public class DivideConquerUtillities {

	
	
	public static int findMax(int arr[])
	{
		int low=0;
		int high =arr.length-1;
	
		return findMax(arr,low,high);
		
	}

	private static int findMax(int[] arr, int low, int high) {
		if(low==high)
			return arr[high];
		
		else
		{
			int mid=(low+high)>>1;
			
			int leftMax=findMax(arr, low, mid);
			int rigtMax=findMax(arr, mid+1, high);
			
			return Math.max(leftMax, rigtMax);
		}
	}
	
	public static int findMin(int arr[])
	{
		int low=0;
		int high =arr.length-1;
	
		return findMin(arr,low,high);
		
	}

	private static int findMin(int[] arr, int low, int high) {
		if(low==high)
			return arr[high];
		
		else
		{
			int mid=(low+high)>>1;
			
			int leftMax=findMin(arr, low, mid);
			int rigtMax=findMin(arr, mid+1, high);
			
			return Math.min(leftMax, rigtMax);
		}
	}
	
	public static int multipyDc(int num, int times)
	{
		if(times==0)
			return 1;
		
		else if(times%2==1) {
			
			return num*multipyDc(num, times-1);
			
		}
		else {
			
			int partSum=multipyDc(num, times>>1);
			return partSum*partSum;
		}
		
		
	}
}
