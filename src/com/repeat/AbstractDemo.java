package com.repeat;

abstract class abs1
{
	public void meth1()
	{
		System.out.println("Non abstract method..");
	}
	abstract public void meth2();
}
class abs2 extends abs1
{

	@Override
	public void meth2() {
		// TODO Auto-generated method stub
		System.out.println("umimplemented method 2 in implemented in class...");
	}
	
}
public class AbstractDemo 
{
	public static void main(String[] args) {
		abs2 a=new abs2();
		a.meth1();
		a.meth2();
	}
}
