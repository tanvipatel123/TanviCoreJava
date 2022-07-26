package com.practice;

import java.util.Iterator;

public class ArrayDemop1
{
	public static void main(String[] args) 
	{
		int marks[][]=new int[2][3];
		marks[0][0]=80;
		marks[0][1]=70;
		marks[0][2]=76;
		marks[1][0]=78;
		marks[1][1]=80;
		marks[1][2]=85;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("marks["+i+"]["+j+"]="+marks[i][j]);
			}
				
			}
		}
	}

