

import java.lang.*;
import java.util.*;

class Exceptation3
{
	public static void main(String arg[])
	{
		int Arr[]={10,20,30,40,50};
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the Index:");
		int index=sobj.nextInt();
		
		try
		{
			System.out.println("Inside try");
			System.out.println("Element at that Index is:"+Arr[index]);//excepation prone code
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Inside catch ArrayIndexOutOfBoundsException");
			System.out.println("Error Occured:"+obj);
		}
		catch(Exception obj)
		{
			System.out.println("Inside catch Exception");
			System.out.println("Error Occured:"+obj);
		}
		finally
		{
			System.out.println("Inside finally");
		}
		System.out.println("End of Application");
			
		
		
		
		
		
	}
}