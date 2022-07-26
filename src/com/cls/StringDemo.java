package com.cls;

public class StringDemo 
{
	public static void main(String[] args) {
		String s1=new String("This is tops technologies...");
		System.out.println("length is..."+s1.length());
		System.out.println("Original is..."+s1);
		System.out.println("To uppercase is.."+s1.toUpperCase());
		System.out.println("To lower case is..."+s1.toLowerCase());
		System.out.println("Substring is..."+s1.substring(2));
		System.out.println("Substring is .."+s1.substring(2,4));
		System.out.println("Char is.."+s1.charAt(2));
		if(s1.equalsIgnoreCase("This is tops technologies..."))
		{
			System.out.println("Both are equals...");
		}
		else
		{
			System.out.println("Both are not equals...");
		}
		
	}
}
