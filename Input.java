

import java.lang.*;
import java.util.*;

class Input
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name=sobj.nextLine();
		
		System.out.println("Enter Your Age:");
		int age=sobj.nextInt();
		
		System.out.println("Enter Your Percentage:");
		float percentage =sobj.nextFloat();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Percentage:"+percentage);
		sobj.close();
	}
}