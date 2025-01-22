package com.gautam.multithreading.ExecutorFrameWork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameWork {

	

	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		long startTime = System.currentTimeMillis();
		
		
		ExecutorService executor=Executors.newFixedThreadPool(9);
		
	
		for (int i = 1; i <10; i++) {
			
			int finalI=i ;
			Future<?> submit = executor.submit(() -> factorial(finalI) ) ; 
			
			System.out.println( submit.get() );
		}
		
		executor.shutdown();
		
		try {
			 while(!executor.awaitTermination(10, TimeUnit.MILLISECONDS))
				 System.out.println("Waiting ....");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Total time "+(System.currentTimeMillis() -startTime));
	}
	
	private static long factorial(int n)
	{
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long fact=1;
		
		for(int i=1 ; i<=n ; i++)
				fact*=i ;
		
		return fact;
		
	}
}
