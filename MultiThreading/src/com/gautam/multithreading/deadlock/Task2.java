package com.gautam.multithreading.deadlock;

public class Task2 implements Runnable {

	
	private Pen pen ;
	private Paper paper ;
	
	
	public Task2(Pen pen, Paper paper) {
		super();
		this.pen = pen;
		this.paper = paper;
	}
	
	

	@Override
	public void run() {

		paper.writeWithPaperAndPen(pen);
		
	}
	

}
