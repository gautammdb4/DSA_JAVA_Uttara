package com.gautam.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
	
	private int balance =100;
	
	
	private final Lock lock = new ReentrantLock();
	
	public  void withdraw(int amount)
	{
		
		System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
		
		
		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
			{
				if(balance>=amount)
				{
					System.out.println(Thread.currentThread().getName()+" processing to withdraw ");
					
					try {
						Thread.sleep(3000);
						balance-= amount;
						System.out.println(Thread.currentThread().getName()+" completed  withdraw remaining balance "+ balance);
						
					} catch (InterruptedException e) {
						
						Thread.currentThread().interrupt();
					}
					finally {
						
						lock.unlock();
					}
					
				
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+" insufficient amount ");
					
				}
			}
			else {
				System.out.println("Could not acquire the lock will try later ");
			}	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void withdrawl(int amount)
	{
		
		System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
		
		if(balance>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" processing to withdraw ");
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			balance-= amount;
			System.out.println(Thread.currentThread().getName()+" completed  withdraw remaining "+ balance);
			
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" insufficient amount ");
			
		}
	}

}
