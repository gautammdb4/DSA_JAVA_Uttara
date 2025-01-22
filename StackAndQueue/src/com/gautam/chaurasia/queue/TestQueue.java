package com.gautam.chaurasia.queue;

public class TestQueue {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(5);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(6);
		q.enQueue(9876);
		q.travese();
		System.out.println(q);
		System.out.println(q.deQueue());
		System.out.println(q);
		System.out.println(q.deQueue());
		System.out.println(q);
		System.out.println(q.deQueue());
		System.out.println(q);
		System.out.println(q.deQueue());
		System.out.println(q);
	}
}
