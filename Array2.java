
import java.lang.*;
import java.util.*;

class Array2
{
	public static void main(String arg[])
	{
		int iLength=0;
		int iCnt=0;
		
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Total no. of elements:");
		iLength=sobj.nextInt();
		
		int arr[]=new int[iLength];
		System.out.println("Enter elements:");
		for(iCnt=0;iCnt<arr.length;iCnt++)
		{
			arr[iCnt]=sobj.nextInt();
		}
		System.out.println("Enterd elements are:");
		
		for(iCnt=0;iCnt<arr.length;iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
		
		
		
	}
}