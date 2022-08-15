
import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String arg[])
	{
		int iRow=0,iCol=0;
		Scanner sobj=new Scanner(System.in);
		int arr[][]=new int [3][];
		arr[0]=new int[3];
		arr[1]=new int[5];
		arr[2]=new int[2];
		
		for(iRow=0;iRow<arr.length;iRow++)
		{
			for(iCol=0;iCol<arr[iRow].length;iCol++)
			{
				arr[iRow][iCol]=sobj.nextInt();
			}
		}
		
		for(iRow=0;iRow<arr.length;iRow++)
		{
			for(iCol=0;iCol<arr[iRow].length;iCol++)
			{
				System.out.println(arr[iRow][iCol]);
			}
		}
	}
}