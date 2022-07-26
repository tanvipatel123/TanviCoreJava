package com.key;

 final class FDemo
{
	 final int no=123;
	 final String name="tanu";
	
	
	public  final void show()
	{
		System.out.println("no is.."+no);
		System.out.println("name is..."+name);
	}
}
public class FinalDemo
{
	public static void main(String[] args)
	{
		FDemo f1=new FDemo();
		
		f1.show();
	}
}
