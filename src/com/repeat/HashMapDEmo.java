package com.repeat;
/*
 * 
 * 
 * 
 * 
 * 
 */
import java.util.HashMap;

public class HashMapDEmo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "jack");
		hm.put(2, "jill");
		hm.put(3, "jane");
		hm.put(4, "john");
		hm.put(5, "james");
		System.out.println(hm);
		
		System.out.println(hm.get(5));
		System.out.println(hm.remove(4));
		System.out.println(hm);
		
	}

}
