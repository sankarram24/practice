/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class arraylistappend
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
		
		Vector v=new Vector();
		v.add("5");
		v.add("6");
		
		arraylist.addAll(v);
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
		
		
		for(int i=0;i<arraylist.size();i++)
		{
			System.out.println(arraylist.get(i));
		}
	}
}
