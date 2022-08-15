
import java.lang.*;



class Base
{
	public int i;
	public int j;
	
	public Base()
	{
		System.out.println("Inside Base Default Constructor");
		this.i=10;
		this.j=20;
	}
	
	public Base(int a, int b)
	{
		System.out.println("Inside Base Parametersized Constructor");
		this.i=a;
		this.j=b;
	}
	
	public void fun()
	{
		System.out.println("Inside base fun ");
		
	}

}

class Dervied extends Base// in c++, class Dervied:public Base
{
	public int x;
	public int y;
	
	
	public Dervied()
	{
		//using super we can access
		super(11,21);//varcha constructor hoil
		System.out.println("Inside Dervied Constructor");
		
		this.x=30;
		this.y=40;
	}
	public void sun()
	{
		System.out.println("Inside Dervied sun ");
		
		//using super we can access
		System.out.println(super.i);
		super.fun(); 
		
		
		
	}
	
}
	
class Inheritance_2
{
	
	public static void main(String args[])
	{
		
		Dervied dobj=new Dervied();
		dobj.sun();
	}
}

