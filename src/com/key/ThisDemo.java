package com.key;

class TDemo
{
	int no;
	String name;
	public final void setdata(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public void show()
	{
		System.out.println("no is..."+no);
		System.out.println("name is...."+name);
	}
}
public class ThisDemo 
{
	public static void main(String[] args) 
	{
		TDemo t1=new TDemo();
		t1.setdata(123,"tanu");
		t1.show();
	}
}
