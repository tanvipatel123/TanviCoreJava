package com.repeat;

public class StaticMethod
{
	static int a=10;
	static int b;
	
	static void meth(int x)//ststic block...
	{
		System.out.println("X : "+x);
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
	{ 		//normal block...
		System.out.println("Normal block");
	}
	static
	{
		System.out.println("ststic block is calling");
		b = a*10;
	}
	public static void main(String[] args) 
	{
		StaticMethod s1= new StaticMethod();
		meth(9);
	}
}
