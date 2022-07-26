package com.repeat;

import java.util.Scanner;

public class StaticDemo {
	int a;
	
	void setA() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A :");
		a=sc.nextInt();
		
	}
	 void getA()
	{
		System.out.println("A ="+a);
	}
public static void main(String[] args) {
	StaticDemo s1 = new StaticDemo();
	StaticDemo s2 = new StaticDemo();
	StaticDemo s3 = new StaticDemo();
	
	s1.setA();
	s2.setA();
	s3.setA();
	
	s1.getA();
	s2.getA();
	s3.getA();
}
}
