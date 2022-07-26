
package com.ph;

public class ArrayphDemo1 
{
	public static void main(String[] args) 
	{
//		int[] marks=new int[3];
		int marks[]=new int[3];
		
		marks[0]=98;//java
		marks[1]=96;//math
		marks[2]=87;//eng
		
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("The marks is : "+marks[i]);
		}
	}
}
