
import java.lang.*;


//MultiLevel Inheritance

//class Object

/*

class Object
{
	//Contents
}

//Avaiable in java.lang
*/
class Base // class Base extends Object
{
	public int i;
	public int j;
	
	
	
	public void fun()
	{
		System.out.println("Inside base fun ");
		
	}

}

class Dervied extends Base
{
	public int x;
	public int y;
	
	
	
	public void gun()
	{
		System.out.println("Inside Dervied gun ");
	}
	
}

class DerviedX extends Dervied
{
	public int a;
	
	public void sun()
	{
		System.out.println("Inside DerviedX sun ");
	}
	
}
	
class Inheritance_3
{
	
	public static void main(String args[])
	{
		
		Dervied dobj=new Dervied();
		
	}
}

