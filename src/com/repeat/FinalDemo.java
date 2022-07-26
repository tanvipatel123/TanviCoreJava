package com.repeat;

 class final1
{
	final int a=10;
	void show()
	{
		//a=25;
		System.out.println("A ="+a);
	}
}
class final2 extends final1
{
	int b=20;
	void show()
	{
		super.show();
		System.out.println("B = "+b);
	}
}
public class FinalDemo {
	public static void main(String[] args) 
	{
		final2 f=new final2();
		f.show();
	}
}
