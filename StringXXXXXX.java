
import java.util.*;


class StringXXXXXX
{
	public static void main(String args[])
	{
		
		String str1="Hello";//100
		String str2="Hello";//100
		
		String str3=new String ("Hello");//200
		
		if(str1==str3)//if(100 == 100)
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		
		if(str1.equals(str3))//if("Hello".equals("Hello"))
		{
			System.out.println("String are same");
		}
		else
		{
			System.out.println("String are different");
		}
		
	}
}