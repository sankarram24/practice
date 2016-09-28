/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class comparebooleanarray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		boolean[] bl1=new boolean[]{true,false};
		boolean[] bl2=new boolean[]{true,false};
		boolean b=Arrays.equals(bl1,bl2);
		System.out.println(b);
	}
}
