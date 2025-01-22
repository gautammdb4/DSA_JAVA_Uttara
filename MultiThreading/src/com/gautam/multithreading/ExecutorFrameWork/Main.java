package com.gautam.multithreading.ExecutorFrameWork;


public class Main {

	
	
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		Thread []  threads = new Thread[9] ;
		for (int i = 1; i <10; i++) {
			
			int finalI=i ;
			threads[i-1] = new Thread(
					() -> 
					{
						System.out.println("factorial of "+finalI+" ->"+factorial(finalI));
					}
					);
			
			
			threads[i-1].start();
		}
		
		
		for (Thread thread : threads) {
			
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
