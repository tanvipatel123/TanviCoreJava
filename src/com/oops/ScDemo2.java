package com.oops;


import java.util.Scanner;

public class ScDemo2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter ur roll no :");
		int rno=sc.nextInt();
		System.out.println("Enter ur name :");
		//String name=sc.next();
		//String name=sc.nextLine();
		String name=sc1.nextLine();
		System.out.println("ur roll nu is.."+rno);
		System.out.println("ur name is.."+name);
	}
}
