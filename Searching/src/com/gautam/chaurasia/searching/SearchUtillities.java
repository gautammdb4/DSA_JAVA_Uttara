package com.gautam.chaurasia.searching;

public class SearchUtillities {

	public static int firstOccurence(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		return firstOccurence(arr, key, low, high);
	}

	private static int firstOccurence(int[] arr, int key, int low, int high) {

		if (low > high)
			return -1;

		else {
			int mid = (low + high) >> 1;

			if (key == arr[mid] &&	 (low==mid || arr[mid - 1] < arr[mid]))
				return mid;

			else if (key > arr[mid])
				return firstOccurence(arr, key, mid + 1, high);
			else
				return firstOccurence(arr, key, low, mid - 1);

		}

	}

	private static int firstOccurenceIterative(int[] arr, int key, int low, int high) {

		while (low <= high) {
			
			int mid =low+ (high -low )/2;
			
			if ((low==mid && arr[mid]==key) || (key == arr[mid] && arr[mid - 1] < arr[mid]))
				return mid;

			else if (key <= arr[mid]) 
				high=mid-1;
			
			else 
				low=mid+1;

		}
		return -1;

	}
	
	public static int findLastOccurence(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;

		return findLastOccurence(arr, key, low, high);
	}

	private static int findLastOccurence(int[] arr, int key, int low, int high) {

		if (low > high)
			return -1;

		else {
			int mid = (low + high) >> 1;
				
			if ((arr.length-1 == mid && arr[mid]==key) || 
					(key == arr[mid] && arr[mid + 1] > key))
				return mid;

			else if (key < arr[mid])
				return findLastOccurence(arr, key,low, mid-1);
			else
				return findLastOccurence(arr, key, mid+1,high);

		}

	}

	
	public static int bitonicSearch(int[] arr) {
		int low = 0;
		int high = arr.length - 1;

		return bitonicSearch(arr, low, high);
	}

	private static int bitonicSearch(int[] arr, int low, int high) {

		while (low <= high) {
			if (low == high)
				return arr[low];

			else if (low + 1 == high)
				return Math.max(arr[low], arr[high]);

			else {

				int mid = low + high >> 1;

				if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
					return arr[mid];

				else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1])
					low = mid + 1;

				else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
					high = mid - 1;

			}

		}
		return -1;
	}
}
