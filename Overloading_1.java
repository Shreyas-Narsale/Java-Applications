
import java.lang.*;
class Demo
{
	public int Add(int i, int j)
	{
		return i+j;
	}
	public int Add(int i, int j, int k=10)//not allowed beacauses
	//Ambiguity
	{
		return i+j+k;
	}
	
	
	
}
	
class Overloading
{
	public static void main(String arr[])
	{
		Demo obj=new Demo();
		int iRet=0;
		
		iRet=obj.Add(10,20);//30
		System.out.println(iRet);
		
		iRet=obj.Add(10,20);//60
		System.out.println(iRet);
		
	}
}