/*collection : it is grop of data.(one object contains another object)
*tostring() calling internally
 * it is like structure in c programming
 * all interfaces belongs to java.util.package
 * 
 * ArrayList : 
 * 
 * 
 * 
 * 
 */
package com.repeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class collectionDemo //ArrayList Demo
{
		public static void main(String[] args)
		{
			ArrayList al= new ArrayList();
			al.add("tops");
			al.add(10);
			al.add(10.10);
			al.add('t');
			al.add(true);
			al.add(10);
			al.add(null);
			System.out.println(al);
			
			System.out.println(al.size());
			System.out.println(al.indexOf(10.10));
			System.out.println(al.isEmpty());
			al.remove(5);
			System.out.println(al);
			al.set(5,10);
			System.out.println(al);
			al.add(5, 100);
			System.out.println(al);
			Iterator itr =al.iterator();
			
			while (itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			 ListIterator litr = al.listIterator();
			System.out.println("using list iterator top- bottom");
			while(litr.hasNext())
			{
				System.out.println(litr.next()+"tops");
			}
			
			System.out.println("using list iterator privious bottom-top");
			while(litr.hasPrevious())
			{
				System.out.println(litr.previous());
			}
		}
}
