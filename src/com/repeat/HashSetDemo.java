package com.repeat;

import java.util.HashSet;

/*
 * Hash set : it internally implements set interface and extends set abstract class.
 * 			: HashSet internally works with Hash Table
 * 			: it does not maintain the Insertion order 
 * 			: no Duplicate Values allowed in HashSet
 */
public class HashSetDemo 
{
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add("tops");
		hs.add('t');
		hs.add(10.10);
		hs.add(true);
		hs.add(null);
		hs.add(10);
		System.out.println(hs);
	}
}
