

import java.lang.*;
import java.util.*;

class Demo
{
	public int Division(int iNo1, int iNo2) throws ArithmeticException
	{
		return iNo1/iNo2;
	}
}
class Exceptation5
{
	public static void main(String arg[])
	{
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter first No.:");
		int iValue1=sobj.nextInt();
		
		System.out.println("Enter Second No.:");
		int iValue2=sobj.nextInt();
		
		Demo dobj=new Demo();
		try
		{
			int iRet=dobj.Division(iValue1,iValue2);
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Exception Occured :"+obj);
		}
			
		System.out.println("iRet is:"+iRet);
		
	}
}