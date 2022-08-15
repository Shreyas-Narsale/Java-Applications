
import java.lang.*;

class Commond_Line_Argu
{
	public static void main(String arg[])
	{
		System.out.println("First No. is:"+arg[0]);
		System.out.println("First No. is:"+arg[1]);
		
		int ans=Integer.parseInt(arg[0])+Integer.parseInt(arg[1]);
		System.out.println("Addition is:"+ans);
		System.out.println("length of argv is:"+arg.length);
	}
}