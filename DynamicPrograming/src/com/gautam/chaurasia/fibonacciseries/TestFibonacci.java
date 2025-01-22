package com.gautam.chaurasia.fibonacciseries;

public class TestFibonacci {
	
	public static void main(String[] args) {
		
		FibonacciSeries f = new FibonacciSeries(10);
		int n=f.dpFib(10);
		
		System.out.println(n);
//		for (int i = 0; i < 10; i++) {
//			
//		
//			System.out.print(f.dpFib(i)+" ");
//		}
	}
	
}
