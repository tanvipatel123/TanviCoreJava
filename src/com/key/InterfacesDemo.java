package com.key;

class Staff
{
	int stno;
	String stname;
	public void setStaffData()
	{
		stno=111;
		stname="tanu";
	}
}
class Inter extends Staff implements Student
{
	String name;
	@Override
	public void setData()
	{
		name="tanu";
	}
	public void show()
	{
		System.out.println("no is.."+no);
		System.out.println("name is..."+name);
		System.out.println("Staff is..."+stno);
		System.out.println("staff name is...."+stname);
	}
}
public class InterfacesDemo 
{
	public static void main(String[] args) 
	{
		Inter i1=new Inter();
		i1.setStaffData();
		i1.setData();
		i1.show();
	}
}
