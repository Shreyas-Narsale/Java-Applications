

import java.lang.*;
import java.util.*;

class Exception2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		int iAns=0;
		
		System.out.println("Enter First No.:");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter Second No.:");
		int iNo2=sobj.nextInt();
		
		try
		{
			iAns=iNo1/iNo2;//Exception Prone
		}
		catch(ArithmeticException obj1)
		{
			System.out.println("Exception Occured as:"+obj1);
		}
		finally
		{
			sobj.close();
		}
		System.out.println("Division is:"+iAns);
		
	}
}