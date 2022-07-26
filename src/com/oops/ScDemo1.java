package com.oops;

import java.util.Scanner;

public class ScDemo1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no 1 :");
		int a=sc.nextInt();
		System.out.println("Enter no 2 :");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum is :"+c);
	}
}
