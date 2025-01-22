package com.gautam.chaurasia.leetcode.histogram;

import java.util.Stack;

public class LargestAreaHistogram {
	
	


	public static void main(String[] args) {
		
		int [] heights = {2,1,5,6,2,3};
		System.out.println(largestRectArea(heights));
	}
	
	
	//this method will take O(n*n)  so it taking too much of time 
	public static int largestRectangleArea(int[] heights) {
	
	
		int maxArea =0;
		for (int i = 0; i < heights.length; i++) {
			int left = i ,right = i ;
			int area=0;
			
			while( left >=0 && heights[left]>=heights[i] )
				  left--;
			while( right < heights.length && heights[right]>=heights[i] )
				  right++ ;
			
			
			area=(right-left -1)*heights[i];
			
			maxArea=Math.max(maxArea, area);
			
			
			
			
		}
	return maxArea;
        
    }
	
	
	
	public static int largestRectArea(int[] heights) {
		
		
		int maxArea =0;
		int area =0;
		int prevS [] = getPreviousSmaller(heights) ;
		int nextS[] = getNextSmaller(heights) ;
		
		

		for(int i=0; i<heights.length;i++) {
		area=(nextS[i]-prevS[i] -1)*heights[i];
		
		maxArea=Math.max(maxArea, area);
		}
	return maxArea;
        
    }


	private static int[] getNextSmaller(int[] heights) {
		int nextS[] = new int[heights.length] ;

		
		Stack<Integer>  stack = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
            	nextS[i]= heights.length;
            }else{
            	nextS[i] = stack.peek();
            }
            stack.push(i);
        }
		return nextS;
	}


	private static int[] getPreviousSmaller(int[] heights) {
			
			int prevS [] =new int[heights.length];
			Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			
			while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
			{
				stack.pop();
			}
			
			if(stack.isEmpty())
				prevS[i]=-1;
			else
			{
				prevS[i]=stack.peek();
			}
			
			stack.push(i);
			
		}
		return prevS;
	}
}
