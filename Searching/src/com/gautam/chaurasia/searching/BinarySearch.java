package com.gautam.chaurasia.searching;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length - 1;

		return binarySearch3(arr, key, low, high);
	}

	private static int binarySearch2(int[] arr, int key, int low, int high) {

		if (low > high)
			return -1;

		else {
			int mid = low+(high-low)/2;
			
			if (key == arr[mid])
				return mid;
			
			else if (key > arr[mid])
				return binarySearch2(arr, key, mid + 1, high);

			else
				return binarySearch2(arr, key, low, mid - 1);
		}

	}

	private static int binarySearch(int[] arr, int key, int low, int high) {

		int mid = (low + high) >> 1;

		if (key == arr[mid])
			return mid;
		
		else if (low >= high)
			return -1;

		else {
			if (key > arr[mid])
				return binarySearch(arr, key, mid + 1, high);

			else
				return binarySearch(arr, key, low, mid - 1);
		}

	}
	
	private static int binarySearch3(int[] arr, int key, int low, int high) {

		
		while(low<=high) 
		{
			
			int mid = (low + high) >> 1;

			if (key == arr[mid])
				return mid;
		
			else
			{
				if(key>arr[mid]) 
					low=mid+1;
				else
					high=mid-1;
	
				}
		}
		
		return -1;
	}
		
}
