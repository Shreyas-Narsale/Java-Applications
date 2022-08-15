

import java.io.*;


class Wrapper
{
	public static void main(String args[]) throws IOException
	{
		int no=11;
		
		Integer iobj=new Integer(11);
		
		int i=iobj;//Unboxing
		
		Integer iobj2=no;//Boxing
		
		System.out.println("no is:"+no);
		System.out.println("iobj is:"+iobj);
		System.out.println("i is:"+i);
		System.out.println("iobj2 is:"+iobj2);
	}
}