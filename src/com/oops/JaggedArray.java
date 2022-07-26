package com.oops;

import java.util.Scanner;

public class JaggedArray
{
	public static void main(String[] args) 
	{
//		int[][] a=new int[3][];
//		a[0]=new int[5];
//		a[1]=new int[3];
//		a[2]=new int[4];
//		
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				a[i][j]=j+1;
//				System.out.println(" "+a[i][j]);
//			}
//			System.out.println();
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many rows...");
		int r=sc.nextInt();
		
		int[][] a=new int[r][];
		for(int i=0;i<r;i++)
		{
			System.out.println("Enter column for row "+i);
			a[i]=new int[sc.nextInt()];
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter value ...");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}