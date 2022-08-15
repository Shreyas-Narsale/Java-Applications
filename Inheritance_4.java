
import java.lang.*;



class Base
{
	public int i;
	public int j;
	
	
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

class Dervied extends Base
{
	public int x;
	public int y;
	
	
	public Dervied(int a, int b)
	{
		super(a, b);//In c++ Dervied :: Base(11,21)
		this.x=30;
		this.y=40;
	}
	public void sun()
	{
		System.out.println("Inside Dervied sun ");
	}
	
}
	
class Inheritance_4
{
	
	public static void main(String args[])
	{
		
		Dervied dobj=new Dervied(11,21);
		dobj.sun();
	}
}

