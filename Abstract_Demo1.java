

import java.lang.*;

abstract class Demo
{
	public int i,j;
	public Demo()
	{
		System.out.println("Inside Demo Constructor");
	}
	
	public void fun()
	{
		System.out.println("Inside Demo fun");
	}
	
	
	public abstract void gun();//abstract method
}

class Hello extends Demo
{
	public int x,y;
	
	public Hello()
	{
		System.out.println("Inside Hello Constructor");
	}
	
	public void sun()
	{
		System.out.println("Inside Hello sun");
	}
	
	
	public  void gun()//concrete method
	{
		System.out.println("Inside Hello gun");
	}
}




class Abstract_Demo1
{
	
	public static void main(String arsg[])
	{
		Demo dobj;//allowed beacause it is just reference
		//Demo dobj=new Hello();//not allowed beacause of abstract class
		hobj.fun();
		hobj.sun();
		hobj.gun();
		
	}
}