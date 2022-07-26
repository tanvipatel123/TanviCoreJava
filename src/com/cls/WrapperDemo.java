package com.cls;

public class WrapperDemo
{
	public static void main(String[] args) 
	{
		Integer i1=new Integer(123);
		System.out.println("AutoBoxing is..."+i1);
		
		int a=100;
		Integer i2=new Integer(a);
		System.out.println("Boxing is.."+i2);
		
		int x=i1.intValue();
		System.out.println("UnBoxing is..."+x);
		
		String s="786";
		int z=Integer.parseInt(s);
		System.out.println("Unboxing is.."+z);
		
		String s1=i1.toString();
		System.out.println("String is.."+s1);
	}
}
