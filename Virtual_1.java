
import java.lang.*;



class Base 
{
	public int i,j;

	public void fun()//def
	{
		System.out.println("Inside base fun ");
	}

	public void gun()//def
	{
		System.out.println("Inside base gun ");
	}

	public void sun()//def
	{
		System.out.println("Inside base sun ");
	}

}

class Dervied extends Base
{
	public int x,y;
	
	public void fun()//Overriding def
	{
		System.out.println("Inside Dervied fun ");
	}
	
	public void sun()//Overriding def
	{
		System.out.println("Inside Dervied sun ");
	}
	
	public void run()//def
	{
		System.out.println("Inside Dervied run ");
	}
}


class Virtual_1
{
	
	public static void main(String args[])
	{
		//Base bobj=new Base();//No Casting
		//Dervied dobj=new Dervied();//No casting
		
		Base obj1=new Dervied();//Upcasting (in c++ Base *obj1=new Dervied())
		//Dervied  obj2=new Base();//Downcasting also not allowed in java like c++
		
		obj1.fun();//Dervied fun(in c++ obj->fun())
		obj1.gun();//Base gun
		obj1.sun();//Dervied sun
		//obj1.run(); not allowed beacause base kade run nahi 
		//compile time error
	}
}

