package com.gautam.chaurasia.fibonacciseries;

public class FibonacciSeries {

	
	private int a[];
	
	public FibonacciSeries(int n) {
		a =new int[n+1];
		for (int i = 0; i < a.length; i++) {
			a[i]=-1;
		}
	}

	
	public int fib(int n) {
		if (n == 0)
			return n;
		else if (n == 1)
			return n;

		else
		{
			int a=fib(n-1);
			int b=fib(n-2);
			return a+b;
		}
			
	}
	
	
	public int dpFib(int n) {
		
	    if(a[n] != -1)
	        return a[n];
	    
	    else if (n == 0) {
	        a[n] = 0;
	        return a[n];
	    }
	    
	    else if (n == 1) {
	        a[n] = 1;
	        return a[n];
	    }
	    
	    else {
	        int x = dpFib(n-1);
	        int y = dpFib(n-2);
	        a[n] = x + y; // Update a[n] with the correct Fibonacci value
	        return a[n];
	    }
	}

}
