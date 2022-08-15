

import java.lang.*;

class Demo
{
	
	
}
	
	
class Hash
{
	public static void main(String args[])throws Exception
	{
		String str1="Marvellous";
		String str2="Marvellous";
		String str3="Infosystems";
		Demo dobj=new Demo();
		
		System.out.println("HashCode of Str1:"+str1.hashCode());
		System.out.println("HashCode of Str1:"+str2.hashCode());
		System.out.println("HashCode of Str1:"+str3.hashCode());
		System.out.println("HashCode of Str1:"+dobj.hashCode());
		
		//str1 and str2 has same hash code beacause same string laterlas
	}
}