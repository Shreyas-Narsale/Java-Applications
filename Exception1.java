

import java.lang.*;
import java.util.*;

class Exception1
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		
		
		System.out.println("Enter First No.:");
		int iNo1=sobj.nextInt();
		
		System.out.println("Enter Second No.:");
		int iNo2=sobj.nextInt();
		
		int iAns=iNo1/iNo2;//Exception Prone
		//error if iNo2 is zero
		
		System.out.println("Division is:"+iAns);
		
	}
}