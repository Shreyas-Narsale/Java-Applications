
import java.lang.*;



class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		System.out.println("Inside Base Constructor");
		int i=0;
		int j=0;
	}
	
	public void fun()
	{
		System.out.println("Inside base fun ");
		
	}

	public void fun(int x)
	{
		System.out.println("Inside base fun with interger arguments");
		
	}
	
	public void gun()
	{
		System.out.println("Inside base gun ");
		
	}
}

class Dervied extends Base// in c++, class Dervied:public Base
{
	public int x;
	public int j;
	
	public Dervied()
	{
		System.out.println("Inside Dervied Constructor");
	}
	public void sun()
	{
		System.out.println("Inside Dervied sun ");
	}
	
}
	
class Inheritance_1
{
	static
	{
		System.out.println("Inside static block");
	}
	public static void main(String args[])
	{
		System.out.println("Inside main");
		Dervied obj=new Dervied();
		//firstly it loads Base.class file and then
		// load Dervied.class file
		obj.fun();
		obj.fun(11);
		obj.gun();
		obj.sun();
		
	}
}

