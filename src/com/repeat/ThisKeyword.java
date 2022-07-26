package com.repeat;
class student 
{
	int rollno;
	String name;
	
	student()
	{
		System.out.println("Default Construcor Called..");
	}
	student(int rollno)
	{
		this.rollno;
		System.out.println("this.rollno");
	}
}

public class ThisKeyword 
{
	public static void main(String[] args) 
	{
		student s1= new student();
		student s =new student(int rollno);
	}
}
