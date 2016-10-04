import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class collectionsmin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(6);
		ar.add(3);
		ar.add(4);
		ar.add(9);
		ar.add(3);
		Object obj=Collections.min(ar);
		System.out.println(obj);
	}
}
