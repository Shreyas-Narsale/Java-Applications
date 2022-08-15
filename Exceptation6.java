

import java.lang.*;
import java.util.*;

class AgeInValid extends Exception
{
	public AgeInValid(String str)
	{
		super(str);
	}
}
class Exceptation6
{
	public static void main(String arg[])
	{
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter age:");
		int iAge=sobj.nextInt();
		try
		{
			if(age<18)
			{
				throw new AgeInValid("Age is below 18");
			}
		}
		catch(AgeInValid obj)
		{
			System.out.println("Error Occure:"+AgeInValid);
		}
		
		
	}
}