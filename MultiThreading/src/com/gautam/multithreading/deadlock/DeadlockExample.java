package com.gautam.multithreading.deadlock;



public class DeadlockExample {

	
	public static void main(String[] args) {
		
		
		Paper paper = new Paper();
		Pen pen = new Pen();
		
		Paper paper1 = new Paper();
		Pen pen1 = new Pen();
		
		Thread t1 = new Thread(new Task1(pen, paper), "Gautam 1");
		Thread t2 = new Thread(new Task2(pen1, paper1), "Gautam 2");
		
		t1.start();
		t2.start();
	}
}
