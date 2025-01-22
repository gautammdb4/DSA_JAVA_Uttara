package com.gautam.chaurasia.string.algo;

public class Solution {

	  public static int bruteForce(int[] text, int[] pattern) {
	        int n = text.length;
	        int m = pattern.length;
	        
	        int l=n-m;
	        
	        // Loop over each position in the text where the pattern could fit
	        for (int i = 0; i <= l; i++) {
	            int j = 0;
	            // Check if pattern matches starting at position i
	            while (j < m && text[i + j] == pattern[j]) {
	                j++;
	            }
	            // If j has reached the length of the pattern, we've found a match
	            if (j == m) {
	                return i;
	            }
	        }

	        // Pattern not found
	        return -1;
	    }

	    public static void main(String[] args) {
	        int[] text = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int[] pattern = {7, 8, 9};

	        int index = bruteForce(text, pattern);

	        if (index != -1) {
	            System.out.println("Pattern found at index: " + index);
	        } else {
	            System.out.println("Pattern not found.");
	        }
	    }
}
