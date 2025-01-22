package com.gautam.chaurasia.stack.in.array;

public class TestStack {

	
	public static void main(String[] args) {
		Stack s= new  Stack(5);
		s.push(5);
		s.push(5);
		s.push(4);
		s.push(5);
		s.push(4);
		s.traverse();
		s.pop();
		s.pop();
		s.traverse();
		
				
	}
}
