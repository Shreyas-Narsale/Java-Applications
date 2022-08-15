

import java.lang.*;

class Demo
{
	public int i;
	public int j;//non-static variable
	public static int k;//static variable
	
	static 
	{
		System.out.println("Inside static bloack");
		k=11;
	}
	public Demo()
	{
		System.out.println("Inside constructor");
		this.i=0;
		this.j=0;
		
	}
	public void fun()//non-static  method
	{
		System.out.println("Inside non-Static fun");
		System.out.println("this.i is :"+this.i);
		System.out.println("this.j is:"+this.j);
		System.out.println("this.k is:"+this.k);
		
	}
	
	public static void gun()//static method
	{
		System.out.println("Inside Static gun");
		System.out.println("k is:"+k);
	}
	
	
	
}
class static_Demo
{
	static
	{
		System.out.println("Inside static block");
	}
	public static void main(String args[])
	{
		System.out.println("Inside main");
		Demo.gun();
		/*
		Demo obj;// created refernce of Demo only not store anything (no memory)
		obj=new Demo();//now eaxcaly Demo class obj memory allocated
		obj.fun();
		System.out.println("obj.i is:"+obj.i);
		System.out.println("obj.j is:"+obj.j);
		*/
		Demo obj=new Demo();
		
	}
}