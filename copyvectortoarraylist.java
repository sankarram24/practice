/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class copyvectortoarraylist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList<String> li=new ArrayList<String>();
		li.add("1");
		li.add("22");
		li.add("3");
		li.add("4");
		System.out.println("adfdsfds");
		
		Vector<String> v=new Vector<String>();
		v.add("ab");
		v.add("c");
		v.add("g");
		v.add("g");
		
	
	/*	for(int i=0;i<4;i++)
		{
			System.out.println(v.get(i));
		}*/
		Collections.copy(li,v);
			Iterator it=li.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
