package com.gautam.chaurasia.sorting;

public class TestSorting {

	public static void main(String[] args) {
		
		int a[]= {20,5,30,15,10};
//				,25,-33,0,56,54,3232,13,43,-2333};
		for (int i : a) {
			System.out.print(i+" ");
		}
//		System.out.println();
//		QuickSort.quickSort(a,0,a.length-1);
//		for (int i : a) {
//			System.out.print(i+" ");
//		}
		System.out.println();
		
//		System.out.println((int)(Math.random()*(4-1)+1));
		
//		MergeSort.mergeSort(a);
		
		QuickSort.quickSort(a, 0, a.length-1);
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
