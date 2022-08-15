
//final method
import java.util.*;


class Base
{
	
	public void fun()
	{
		System.out.println("Inside Base fun");
		
	}
	public final void  gun()
	{
		System.out.println("Inside Base gun");
	}
	
}

class Dervied extends Base
{
	public void fun() //Overriding
	{
		System.out.println("Inside Dervied fun");
		
	}
	/*
	public final void gun() //Not Allowed
	{
		System.out.println("Inside Dervied gun");
	}
	*/
	
	
}
	
	
class Final_2
{
	public static void main(String arsg[])
	{
		Dervied dobj=new Dervied();
		dobj.fun();//Dervied fun
		dobj.gun();//Base gun
	}
}