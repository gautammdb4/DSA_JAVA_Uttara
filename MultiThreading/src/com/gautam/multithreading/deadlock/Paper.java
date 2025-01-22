package com.gautam.multithreading.deadlock;

public class Paper {
	
	public synchronized  void writeWithPaperAndPen(Pen pen )
	{
		System.out.println(Thread.currentThread().getName()+" is Using paper "+this+" and trying to use pen "+ pen);
		
		pen.finishWriting();
	}

	public synchronized void finishWriting() {
		
		System.out.println(Thread.currentThread().getName()+" finished using paper "+this);
		
	}
}
