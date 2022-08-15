
import java.lang.*;
import java.util.*;

class Array1
{
	public static void main(String arg[])
	{
		int iCnt=0;
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("Size of Array:"+arr.length);//length is the property for the array in java
		//System.out.println("elements of Array:"+arr);//display hash code of arr
		System.out.println("By for loop:");
		for(iCnt=0;iCnt<arr.length;iCnt++)
		{
			System.out.println(arr[iCnt]);
		}
		iCnt=0;
		System.out.println("By while loop:");
		while(iCnt<arr.length)
		{
			System.out.println(arr[iCnt]);
			iCnt++;
		}
		System.out.println("By for each loop:");
		for (int no:arr)
		{
			System.out.println(no);
		}
	}
}