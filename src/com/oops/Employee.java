package com.oops;

class Employee1
{
	int empid,salary,da,hra,pf,netsal;
	String ename,designation;
	
	public void setData()
	{
		empid =1;
		ename="abc";
		designation="doctor";
		salary=50000;
		da=500;
		hra=1000;
		pf=2000;
	}
	public void calc()
	{
		netsal=(salary+da+hra)-pf;
	}
	public void display()
	{
		System.out.println("empid is.."+empid);
		System.out.println("ename is.."+ename);
		System.out.println("designation is.."+designation);
		System.out.println("salary is.."+salary);
		System.out.println("DA is.."+da);
		System.out.println("HRA is.."+hra);
		System.out.println("pf is.."+pf);
		System.out.println("netsal is.."+netsal);
	}
}
public class Employee
{
	public static void main(String[] args) 
	{
		Employee1 e1=new Employee1();
		e1.setData();
		e1.calc();
		e1.display();
	}
}



