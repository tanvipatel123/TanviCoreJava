package com.simple;

public class ElseIfLedderDemo 
{
	public static void main(String[] args) 
	{
		int a=100,b=1000,c=10;
		if(a>b && a>c)
		{
			System.out.println("A is max value..");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is max value..");
		}
		else
		{
			System.out.println("C is max value..");
		}
	}
}
