package com.gautam.multithreading.locking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
	
	private ReentrantReadWriteLock lock =new ReentrantReadWriteLock() ;
	
	private final Lock readLock = lock.readLock(); 
	
	private final Lock writeLock = lock.writeLock(); 

	private  int count =0;
	
	public void increment()
	{
		writeLock.lock();
		
		
		try {
			for (int i = 0; i < 10; i++) {
			count++ ;
			}
		}
		finally {
			writeLock.unlock();
		}
		
	}
	
	public int getCount() {
		
		readLock.lock();
		try {
		return count;
		}
		finally {
			readLock.unlock();
		}
	}
}
