package com.gautam.multithreading.locking;


public class ReadWriteLockTest {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ReadWriteCounter counter = new ReadWriteCounter() ;
		
		Runnable readTask = () -> {
			
			for(int i=0 ; i<10 ; i++)
			{
				System.out.println(Thread.currentThread().getName()+" read :  "+counter.getCount());
			}
		};
		
		
		Runnable  writeTask =  new Runnable() {
			
			@Override
			public void run() {
				
				for (int i = 0; i < 5; i++) {
					
					counter.increment();
					
					System.out.println(Thread.currentThread().getName()+" Incremented :  ");
					
				}
			}
		};
		
		Thread readThread  = new Thread(readTask, "Read Thread 1") ;
		Thread readThread2  = new Thread(readTask, "Read Thread 2") ;
		Thread writeThread  = new Thread(writeTask, "Write Thread ") ;
		Thread writeThread2   = new Thread(writeTask, "Write Thread2  ") ;
		
		
		writeThread.start();
		writeThread2.start();
		
		
		
		
		readThread.start();
		readThread2.start();
		
		
		
		readThread.join();
		readThread2.join();
		
		writeThread.join();
			writeThread2.join();

		System.out.println("Main Thread Ending");
	}

}
