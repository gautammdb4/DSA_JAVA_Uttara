package com.gautam.multithreading.deadlock;

public class Pen {

	public synchronized  void writeWithPenAndPaper(Paper paper )
	{
		System.out.println(Thread.currentThread().getName()+" is Using Pen "+this+" and trying to use paper "+ paper);
		
		paper.finishWriting();
	}
	
	
	public synchronized void finishWriting() {
		System.out.println(Thread.currentThread().getName()+" finished using pen "+this);
		
	}

}
