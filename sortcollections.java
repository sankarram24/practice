/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Collections;

/* Name of the class has to be "Main" only if the class is public. */
class sortcollections
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(7);
		li.add(5);
		li.add(9);
		li.add(8);
		li.add(3);
		li.add(4);
		Collections.sort(li);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
	}
}
