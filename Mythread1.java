

import java.lang.*;

class Mythread1
{
	public static void main(String args[])
	{
		
		System.out.println("Inside main");
		Thread tobj=Thread.currentThread();
		 
		System.out.println("Name of the thread is: "+tobj.getName()); 
		
	}
}