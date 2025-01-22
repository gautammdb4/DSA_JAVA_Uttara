package exam.apple.com.gautam;

import java.util.HashMap;


/*
 * Question 2 in apple exam 
 * Problem: Balanced Division of a String
Given a string s, you are asked to find how many ways you can split the string into two non-empty parts, such that both parts contain the same number of unique characters.

Steps to approach:
Split the string into two non-empty parts at each possible position.
Compare the number of unique characters in both parts.
Count the number of valid splits where the two parts have the same number of unique characters.
Example Walkthrough
Let's take the string "aacaba" as an example to understand the problem:

Step 1: Iterate over possible split positions
You can split the string at different positions. Each split divides the string into two parts: the left part and the right part. The idea is to check the number of unique characters in the left and right parts at each split position.

For "aacaba", there are 5 possible positions to split the string:

Position 1: "a" and "acaba"
Position 2: "aa" and "caba"
Position 3: "aac" and "aba"
Position 4: "aaca" and "ba"
Position 5: "aacab" and "a"
 * */
public class Apple {

	
	   public static void main(String[] args) {
	        String s = "aacaba";
	        System.out.println(countBalancedDivisions(s)); 
	   }
	   public static int countBalancedDivisions(String s) {
	        int count = 0;

	        
	        HashMap<Character, Integer> rightMap = new HashMap<>();
	        
	        
	        for (char c : s.toCharArray()) {
	            rightMap.put(c, rightMap.getOrDefault(c, 0) + 1);
	        }
	        

	        
	        HashMap<Character, Integer> leftMap = new HashMap<>();

	        
	        for (int i = 0; i < s.length() - 1; i++) {
	        	
	        	
	            char currentChar = s.charAt(i);

	            leftMap.put(currentChar, leftMap.getOrDefault(currentChar, 0) + 1);

	            rightMap.put(currentChar, rightMap.get(currentChar) - 1);
	            
	            if (rightMap.get(currentChar) == 0) {
	                rightMap.remove(currentChar);
	            }

	            // Check if both parts have the same number of unique characters
	            
	            if (leftMap.size() == rightMap.size()) {
	                count++;
	            }
	        }
	        return count;
	    }
}
