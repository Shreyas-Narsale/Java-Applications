
import java.lang.*;
import java.io.*;


class Input2_Buffer
{
	public static void main(String args[])
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		try
		{
			System.out.println("Enter your Name:");
			String name=name=bobj.readLine();
			System.out.println("your Name is:"+name);
			
			System.out.println("Enter your Age:");
			int iAge=Integer.parseInt(bobj.readLine());
			System.out.println("your age is:"+iAge);
			
		}
		catch(IOException obj)
		{
			System.out.println("Exception Occured:"+obj);
		}
		finally
		{
			iobj=null;
			bobj=null;
		}
		
	}
}