package com.gautam.multithreading;

public class MyThread  extends Thread{
	
	
	private  Counter counter;
	public MyThread(String name, Counter c)
	{
		super(name);
		this.counter=c;
		
	}
	@Override
	public  void run() {
		
		System.out.println(Thread.currentThread().getName());
		for(int i =0 ; i< 1000 ; i++)
			counter.getIncrement();
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		Counter c = new Counter() ;
		MyThread t1 = new MyThread("Thread 1 " ,c);
		MyThread t2 = new MyThread("Thread 2",c);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(c.getCount());
		
	}
}
