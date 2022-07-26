package com.simple;

public class PiramidCharDemo
{
	public static void main(String[] args) 
	{
//a
//ab
//abc
//abcd
//abcde
//		for(int i=97;i<=101;i++)
//		{
//			for(int j=97;j<=i;j++)
//			{
//				System.out.print((char)j);
//			}
//			System.out.println();
//		}
		
		
		for(char i='a';i<='e';i++)
		{
			for(char j='a';j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
