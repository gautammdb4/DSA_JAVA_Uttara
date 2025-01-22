package com.gautam.chaurasia.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class Solution {

	public static void main(String[] args) {

		String[] s = { "Mary", "John", "Emma" };
//		int b[] = { 180, 165, 170 };
		int b[] = { 3, 1, 2, 4 };
		
		String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
		
		
		LinkedList<Integer> ll=null;
		System.out.println();
		System.out.println(countValidWords(sentence));
//		System.out.println(sortArrayByParity(b));
//		System.out.println((char) ('a' + '1' - 48));
//		System.out.println(((int) 'a'));

	}

	public static int countValidWords(String sentence) {

		String[] s = sentence.split(" ");
		int ans = 0;
		boolean f = true;
		for (String a : s) {
			
			char[] ch = a.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (Character.isDigit(ch[i])) {
					f = false;
					break;
				} else if (ch[i] == '-' && (i == 0 || i == ch.length - 1)) {
					f = false;
					break;

				} else if ((ch[i] == ',' || ch[i] == '!' || ch[i] == '.') && i != ch.length - 1) {
					f = false;
					break;

				}

			}

			if (f)
				ans++;
		}

		return ans;
	}

	public static int[] sortArrayByParity(int[] nums) {

		int n = nums.length;
		for (int x = 0, y = 0; y < n; y++) {
			if (nums[y] % 2 == 0) {
				int temp = nums[x];
				nums[x++] = nums[y];
				nums[y] = temp;
			}
		}

//        LinkedList<Integer> even = new LinkedList<>();
//        LinkedList<Integer> odd = new LinkedList<>();
//        
//        for(int i=0 ,j=nums.length -1; i<=j ; i++ ,j--)
//        {
//            if(nums[i]%2==0)
//                even.add(nums[i]);
//            else
//                odd.add(nums[i]);
//            
//            if(i!= j && nums[j]%2==0)
//                even.add(nums[j]);
//            else if(i!= j)
//                odd.add(nums[j]);
//        }
//
//         Collections.sort(even);
//         Collections.sort(odd);
//         for(int i=0 ; i<even.size() ;i++)
//         {
//            nums[i]=even.get(i);
//         }
//         for(int i=0 ,j=even.size(); i<odd.size();i++ ,j++)
//            nums[j]=odd.get(i);

		return nums;
	}

	public static int[] sortByBits(int[] arr) {

//		 Arrays.sort(arr);
		int dp[][] = new int[arr.length][2];
		for (int i = 0; i < arr.length; i++) {
			dp[i][0] = arr[i];
			dp[i][1] = Integer.bitCount(arr[i]);
		}
		Arrays.sort(dp, Comparator.comparingInt(o -> o[1]));
		for (int i = 0; i < arr.length; i++) {
			arr[i] = dp[i][0];
		}
		return arr;

	}

	public static String[] sortPeople(String[] names, int[] heights) {

		Map<Integer, String> map = new HashMap<>();

		for (int i = 0; i < heights.length; i++) {
			map.put(heights[i], names[i]);
		}

		String[] ans = new String[names.length];
		Arrays.sort(heights);
		for (int i = 0, j = ans.length - 1; i < ans.length; i++, j--) {
			ans[i] = (String) map.get(heights[j]);

		}

		return ans;
	}

	public static int maxDepth(String s) {
		int ans = 0;
		int a = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				a++;

			else if (s.charAt(i) == ')') {
				ans = Math.max(ans, a);
				a--;
			}
		}
		return ans;
	}

	public static String restoreString(String s, int[] indices) {

		// StringBuffer sb = new StringBuffer();
		char arr[] = new char[s.length()];

		for (int i = 0; i < indices.length; i++) {
			arr[indices[i]] = s.charAt(i);
		}
		String sb = new String(arr);
		return sb;
	}

	public static int countStudents(int[] students, int[] sandwiches) {

		LinkedList st = new LinkedList();
		Stack sandw = new Stack<>();
		for (int s : students) {
			st.add(s);
		}
		for (int s : sandwiches) {
			sandw.push(s);
		}
		while (st.isEmpty() ? false : sandw.contains(st.get(0))) {
			System.out.println(st.get(0));
			System.out.println(sandw.peek());
			if (st.get(0).equals(sandw.peek())) {
				st.removeFirst();
				sandw.pop();
			} else {
				st.addLast(st.get(0));
				st.removeFirst();
			}

		}

		return st.size();
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {

		int i, temp, ans, maxSize = 9;
		int[] freqMap = new int[maxSize];
		int[] prefixSum = new int[maxSize];
		int[] ansMap = new int[nums.length];

		for (i = 0; i < nums.length; i++) {
			freqMap[nums[i]] = freqMap[nums[i]] + 1;
		}

		for (i = 1; i < 9; i++) {
			prefixSum[i] = prefixSum[i - 1] + freqMap[i - 1];
		}

		for (i = 0; i < nums.length; i++)
			ansMap[i] = prefixSum[nums[i]];

		return ansMap;
	}

	public static int trap(int[] height) {

		int n = height.length;
		int[] left = new int[n];
		// left[0]=height[0];
		int[] right = new int[n];
		// right[n-1]=height[n-1];

		int sum = 0;
		// for(int i =1 ,j =n-2 ;i<n && j >=0;i++ , j--)
		// {
		// left[i]=Math.max(left[i-1],height[i]);
		// right[j]=Math.max(right[j+1],height[j]);
		// }
		// for(int i =n-2 ;i >=0;i--)
		// {
		// right[i]=Math.max(right[i+1],height[i]);
		// }

		// for(int i=0 ;i<n ;i++)
		// {
		// sum =sum+Math.min(left[i],right[i])-height[i];
		// }

		for (int i = 0, j = n - 1; i < n - 1 && j > 0; i++, j--) {
			sum = sum + Math.min(Math.max(height[i], height[i + 1]), Math.max(height[j], height[j - 1])) - height[i];
		}
		return sum;
	}

}