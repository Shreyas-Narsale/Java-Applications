
import java.lang.*;

class Demo
{
}

class classinfo_getClass
{
	public static void main(String arg[])
	{
		Demo obj=new Demo();
		class cref = obj.getClass();
		System.out.println("Class name of obj is:"+cref.getName());
		
		String str="Marvellous";
		class sref = str.getClass();
		System.out.println("Class name of obj is:"+sref.getName());
		
	}
}