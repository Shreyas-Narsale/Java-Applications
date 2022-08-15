
import java.lang.*;
import java.io.*;


class Input1_Buffer
{
	public static void main(String args[])throws IOException  //excepation throws
	{
		InputStreamReader iobj=new InputStreamReader(System.in);
		BufferedReader bobj=new BufferedReader(iobj);
		
		System.out.println("Enter your Name:");
		String name=null;
		name=bobj.readLine();
		System.out.println("your Name is:"+name);
		
	}
}