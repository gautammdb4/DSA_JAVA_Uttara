package com.gautam.chaurasia.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
	
	
	public static void main(String[] args) {
		
//		int [] [] roads = { {0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
//		
//		System.out.println(maximumImportance(5, roads));
		
//		int [] [] graph = {{1,2},{3},{3},{}};
//		
//		System.out.println(allPathsSourceTarget(graph));
//		
		int [][] edges = {{0,1},{0,2},{1,2},{3,4},{3,5}};
		
		System.out.println(countCompleteComponents(6, edges));
	}
	
	
	class Pair {

        int v ;
        int e ;
        public Pair(int v , int e)
        {
            this.v=v;
            this.e=e;
        }

        @Override
        public String toString()
        {
            
            return "("+v+","+e+")";
        }
    }

    public static int countCompleteComponents(int n, int[][] edges) {
        
        List<Pair> cc = new ArrayList<>() ;

        boolean visited [] = new boolean [n];

        for(int i=0 ; i<edges.length ; i++)
        {
            if(!visited[i])
            {
                int arr[] = {0,0};
               dfs(edges , i , visited , arr);
               
           Pair p = new Test().new Pair(arr[0], arr[1]);
            System.out.println(p);
            }

        }
        
        return 0;
    }

    public static  void  dfs(int[][] edges , int i, boolean visited [], int [] arr)
    {
        visited[i]=true;
        arr[0]++;
            
        
          if(i>=edges.length)
        	  return;
        for(int a : edges[i])
        {

            if(!visited[a])
            {
            	
            	arr[1]++;
                 dfs(edges , a , visited,arr);
            }
        }
    }
	
	 public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
	        

	        List<List<Integer>> ans = new LinkedList<>();
	        
	        List<Integer> curr = new LinkedList<>();
	        curr.add(0);
	        dfs( ans ,curr , 0, graph.length -1, graph);
	        return ans;
	    }

	    public static  void dfs( List<List<Integer>> ans ,List<Integer> curr , int s, int d, int[][] graph)
	    {
	        
	    	if(s==d)
            {
                 ans.add(new LinkedList<>(curr));
	            return ;
            }
	        
	        for(int a : graph[s])
	        {
	            curr.add(a);
	             dfs( ans ,curr , a, d, graph);
	             curr.remove(curr.size() -1);
	        }
	        
	        System.out.print("");
	    }
	public  static long maximumImportance(int n, int[][] roads) {
        int imp[]=new int[n];
        for(int[] a:roads){
            imp[a[0]]++;
            imp[a[1]]++;
        }
        int[] arr=new int[roads.length+1];
        for(int i:imp)
        	arr[i]++;
        
        
        int x=n;
        long ans=0;
        for(int i=arr.length-1;i>=0;i--){
            while(arr[i]!=0){
                ans+=((long)x*(long)i);
                x--;
                arr[i]--;
            }
        }
        return ans;
    }
}
