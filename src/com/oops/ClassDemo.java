package com.oops;

class Student 
{
	int sid;
	String sname,city,degree;
	public void setData()
	{
		sid=1;
		sname="Tanvi";
		city="Ahemdabad";
		degree="BCA";
	}
	public void show()
	{
		System.out.println("sid is.."+sid);
		System.out.println("sname is.."+sname);
		System.out.println("sid is.."+city);
		System.out.println("sid is.."+degree);
	}
}
public class ClassDemo 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setData();
		s1.show();
	}
}
