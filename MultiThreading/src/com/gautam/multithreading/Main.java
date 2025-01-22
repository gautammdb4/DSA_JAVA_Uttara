package com.gautam.multithreading;

public class Main {

	
	public static void main(String[] args) {
		
		
		BankAccount sbi = new BankAccount();
				
		Runnable task =() -> {
				
//				sbi.withdrawl(50);
				sbi.withdraw(50);	
		};
		
		Thread t1 = new Thread(task, "Thread 1");
		Thread t2 = new Thread(task, "Thread 2");
		Thread t3 = new Thread(task, "Thread 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
