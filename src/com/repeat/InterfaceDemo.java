package com.repeat;

interface isf1
{
	void meth1();
}
interface isf2 extends isf1
{
	void meth2();
}
class ABC implements isf1,isf2
{
	void meth4()
	{
		System.out.println("This is the method4 class..");
	}
	public void meth1()
	{
		System.out.println("method of interfece is implemented..");
	}
	public void meth2()
	{
		System.out.println("method of interface is implemented..");
	}
}

class XYZ implements isf2
{
	public void meth2()
	{
		System.out.println("method 2 interface implemented is class XYZ..");
	}
	public void meth1()
	{
		System.out.println("method 1 interface implemented in class XYZ");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		ABC a=new ABC();
		a.meth1();
		a.meth2();
		a.meth4();
	}
}
