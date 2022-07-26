package com.oops;


class Addition 
{
	int x,y;
	public void sum()
	{
		x=20;
		y=10;
		System.out.println("Frist sum is..."+(x+y));
	}
	public void sum(int a)
	{
		x=y=a;
		System.out.println("Second dum is..."+(x+y));
	}
	public void sum(float a)
	{
		x=y=(int)a;
		System.out.println("Third sum is.."+(x+y));
	}
	public void sum(int a ,int b)
	{
		x=a;
		y=b;
		System.out.println("Fourth sum is..."+(x+y));
	}
}
public class MethodOverloadingDemo 
{
	public static void main(String[] args)
	{
		Addition a1=new Addition();
		a1.sum();
		a1.sum(123);
		a1.sum(45.54f);
		a1.sum(80,90);           
	}
}
