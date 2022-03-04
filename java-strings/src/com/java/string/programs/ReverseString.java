package com.java.string.programs;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "vaibhav";
		
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(6));
		// normal for loop
		/*
		 * for (int i = str.length() -1 ; i >= 0 ; i--) {
		 * System.out.print(str.charAt(i));
		 * 
		 * }
		 */
		
		// using StringBuilder
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
		

	}

}
