
import java.util.*;


class StringX
{
	public static void main(String args[])
	{
		//String literal
		String str1="Hello";
		String str2="world";
		
		System.out.println(str1);
		System11.out.println(str1.length());
		
		String str3=str1+str2;//here + operator overloading done by java
		System.out.println(str3);
		String str4="Hello";
		//String objects
		String str5=new String("Hello");
		String str6=new String("World");
		String str7=new String("Hello");
		
		System.out.println("Data is:"+str1);//+ concate two string
	}
}