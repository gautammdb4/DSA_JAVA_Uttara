package com.gautam.chaurasia.dynamicprogramming;

import java.util.Arrays;

public class MaximumValueContiguousSubsequence {
	
	
	
	static int maxValueContiSubsequence(int arr [])
	{
		
		
		int ans =0 ;
		
		int n = arr .length;
		
		for(int i=0 ; i< n ; i++)
		{
			
			int sum=0;
			for(int j=i ; j<n; j++)
			{
				
				sum+= arr[j];
				
				if(ans < sum)
					ans =sum ;
			}
		}
		
		
		
		
		return ans ;
	}
	
	
	
	static int  maxValueContiSubsequenceDP(int arr [])
	{
		
		
		  int n = arr.length;
	        
	     
	        
	        int sum= 0;
	        int maxSum = arr[0]; 
	        
	        for (int i = 1; i < n; i++) {
	        	
	           sum =Math.max(sum +arr[i], arr[i]);
	           maxSum=Math.max(maxSum, sum);
	        }
	        
	        return maxSum;
	}
	
	public static void main(String[] args) {
		
		
//		int arr [] = {1,-3,4 ,-2,-1,6};  //ans --> {4,-2,-1,6} --> 7 
		int arr [] = {  -2,1, -3, 4, -1, 2, 1, -5, 4 };  //ans --> [4, −1, 2, 1] --> 7 
		
//		System.out.println(MaximumValueContiguousSubsequence.maxValueContiSubsequence(arr));
		
		
		 
		int a=maxValueContiSubsequenceDP(arr);
		
		System.out.println(a);
	}

}
