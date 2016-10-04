/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class set
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int count[]={3,2,9,7,5,4};
		Set<Integer>set=new HashSet<Integer>();
		for(int i=0;i<6;i++){
			set.add(count[i]);
		}
		System.out.println(set);
		TreeSet<Integer> ts=new TreeSet<Integer>(set);
		System.out.println(ts);
		System.out.println((Integer)ts.first());
		System.out.println((Integer)ts.last());
	}
}
