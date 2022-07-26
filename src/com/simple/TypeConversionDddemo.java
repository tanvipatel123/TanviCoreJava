package com.simple;

public class TypeConversionDddemo 
{
	public static void main(String[] args)
	{
		int i1=100;//4 bytes
		long l1; // 8 bytes
		l1=i1;// implicit
		System.out.println("Implicit is.."+l1);
		
		int x=(int)l1;
		System.out.println("Explicit is..."+x);
		
		int a=512;//4 bytes
		byte b; //1 byte  -128 to +127
		
		b=(byte)a;
		System.out.println("byte is.."+b);
	}
}
