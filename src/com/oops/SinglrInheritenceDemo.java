package com.oops;

class Customer//parent
{
	int cid;
	String cname,city;
	public void setCustomerData()
	{
		cid=123;
		cname="tanvi";
		city="botad";
	}
}

class Store extends Customer //store is an child class.
{
	int sid;
	String sname;
	public void setStoreData()
	{
		sid=323;
		sname="Dmart cart";
		
	}
	public void display()
	{
		System.out.println("Customer id is..."+cid);
		System.out.println("Customer name is..."+cname);
		System.out.println("City is.."+city);
		System.out.println("Store id is..."+sid);
		System.out.println("Store name is.."+sname);
	}
}
public class SinglrInheritenceDemo 
{
	public static void main(String[] args) 
	{
		Store s1=new Store();
		s1.setCustomerData();
		s1.setStoreData();
		s1.display();
	}
}
