

//Composition
import java.util.*;


final class Base
{
	
	public void fun()
	{
		System.out.println("Inside Base fun");
		
	}
	
}
/*
class Dervied extends Base //Error -Not Allowed
{
	
	
}
*/	
	
class Dervied
{
	public Base bobj=new Base();
	
	public void gun()
	{
		System.out.println("Inside Dervied gun");
		
	}
}
class Final_3
{
	public static void main(String arsg[])
	{
		Dervied dobj=new Dervied();
		dobj.bobj.fun();
		dobj.gun();
		
	}
}