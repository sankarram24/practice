/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sublist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList arraylist=new ArrayList();
		
		arraylist.add("1");
		arraylist.add("2");
		arraylist.add("3");
		arraylist.add("4");
		arraylist.add(3,"4");
		
	/*	Vector v=new Vector();
		v.add("5");
		v.add("6");*/
		
	//	arraylist.addAll(1,v);
		List lst=arraylist.subList(1,);
		System.out.println("sublist");
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		lst.remove(1);
		System.out.println("mainlist");
		
		//Object[] objArray=arraylist.toArray();
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		
		
	}
}
