package com.simple;

public class DataTypeDemo
{
	public static void main(String[] args) 
	{
		int i1=10; // 4 bytes -2147483648 to +2147484647
		long l1=123456; // 8 bytes
		float f1=12.54f;// 4 bytes
		double d1=3123123.232; //8 bytes
		byte b1=123; //1 byte -128 to +127
		boolean bb=true; //1bit
		char c1='t'; // 2 bytes
		System.out.println("int is..."+i1);
		System.out.println("long is..."+l1);
		System.out.println("float is..."+f1);
		System.out.println("double is..."+d1);
		System.out.println("byte is..."+b1);
		System.out.println("boolean is..."+bb);
		System.out.println("char is..."+c1);
		
		System.out.println("Integer size in..."+Integer.BYTES+"bytes");
		System.out.println("Float size in..."+Float.BYTES+"bytes");
		System.out.println("Double size in..."+Double.BYTES+"bytes");
		System.out.println("Long size in..."+Long.BYTES+"bytes");
	}
}
