package com.oops;

class sum 
{
	int x,y;
	public sum()//default const..
	{
		x=10;
		y=20;
		System.out.println("Frit sum is.."+(x+y));
	}
	
	public sum(int a)//parameterised const..
	{
		x=a;
		y=a;
		System.out.println("Frit sum is.."+(x+y));
	}
	public sum(int a ,int b)//parameterised const..
	{
		x=a;
		y=b;
		System.out.println("Frit sum is.."+(a+b));
	}
}
public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		//sum s1=new sum();
		new sum(100);
		new sum(52,65);
		
	}
}
