package com.gautam.chaurasia.stack;

public class TestStack {

	
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.size());
		s.push(1);
		s.push(55);
		s.push(53);
		s.push(5678);
		s.push(88);
		s.push(6);
		s.push(-456);
		System.out.println(s.isEmpty());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.size());
		s.traverse();
		System.out.println(s.pop());
		s.traverse();
		System.out.println(s.peek());
		System.out.println(s.size());
	}
}
