package com.interview.prep;

import java.util.*;

public class Test {

	
	public static void main(String[] args) {
		
		
		String s1 = new String("You Cannot Change me");
		String s2 = new String("You Cannot Change me");
		
		System.out.println(s1==s2);

		String s3 = "You Cannot Change me";
		String s4 = "You Cannot Change me";
		
		System.out.println(s3==s4);
		System.out.println(s2==s4);
		
		String s5 ="You Cannot"+" Change me";
		
		System.out.println(s5==s4);
		
		final String s6 ="You Cannot";
		
		String s7 =s6+" Change me";
		
		System.out.println(s7==s4);
	}
}
