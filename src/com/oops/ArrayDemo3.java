package com.oops;
import java.util.Scanner;
public class ArrayDemo3
{
	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		int [][] b=new int[3][3];
		int [][] c=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("now start A array...");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter a["+i+"]["+j+"] = ");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("now start B array...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter b["+i+"]["+j+"] = ");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("now start C array...");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]=b[i][j];
				System.out.println(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}
