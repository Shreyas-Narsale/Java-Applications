
//final charaterstics
import java.lang.*;
class Demo
{
	public int i;
	public final int j=20;//allowed
	public final int k;
	
	public Demo()
	{
		this.i=10;
		this.k=30;//allowed
	}
	public Demo(int a, int b)
	{
		this.i=a;
		this.k=b;//allowed
	}
	
	public void fun()
	{
		this.i++;
		//j++;//Error
		//k++;//Error
	}

}
class Final_1
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		obj.fun();
		obj.i++;// allowed
		//obj.j++;//not allowed
		//obj.k++;//not allowed
		System.out.println("obj.i"+obj.i);
		System.out.println("obj.j"+obj.j);
		System.out.println("obj.k"+obj.k);
		
		
		Demo obj1=new Demo(11,21);
		obj1.fun();
		System.out.println("obj1.i"+obj1.i);
		System.out.println("obj1.j"+obj1.j);
		System.out.println("obj1.k"+obj1.k);
		
	}
}