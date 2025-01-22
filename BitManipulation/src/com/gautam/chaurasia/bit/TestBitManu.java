package com.gautam.chaurasia.bit;

import java.util.LinkedList;
import java.util.List;

public class TestBitManu {

	
	public static void main(String[] args) {
		
		List<Integer> l = new LinkedList<>();
		l.add(5);
		l.add(10);
		l.add(1);
		l.add(5);
		l.add(2);
		System.out.println(BitManipulation.sumIndicesWithKSetBits(l, 1));
		System.out.println(BitManipulation.toBinary(42));
		System.out.println(BitManipulation.toDecimal("101010"));
		
		System.out.println( Integer.parseInt(Integer.toBinaryString(42), 2));
		System.out.println(Integer.toBinaryString(42));
	}
}
