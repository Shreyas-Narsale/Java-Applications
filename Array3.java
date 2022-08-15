
import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String arg[])
	{
		int arr[][]=new int [2][3];
		//arr is two dimensional array which contain two one dimensional array where each one dimensional array contain 3 elements
		
		arr[0][0]=11;
		arr[0][1]=21;
		arr[0][2]=51;
		arr[1][0]=101;
		arr[1][1]=111;
		arr[1][2]=121;
		
		//arr.length=2
		//arr[0].length 3
		//arr[1].length 3
		
		for(int iRow=0;iRow<arr.length;iRow++)
		{
			for(int iCol=0;iCol<arr[iRow].length;iCol++)
			{
				System.out.println(arr[iRow][iCol]);
			}
		}
		System.out.println("by for each loop");
		for(int brr[]:arr)//here arr each row is taken in brr single dimensional array
		{
			for(int no:brr)//here from brr one dimensional array access each no
			{
			
				System.out.println(no);
			}
		}
		
		
		
		
		
	}
}