

import java.lang.*;


class Marvellous implements Runnable
{
	public void run()
	{
		System.out.println("Inside Thread:"+Thread.currentThread().getName());
		
	}
	
}
class Mythread3
{
	public static void main(String args[])
	{
		
		Marvellous mobj1=new Marvellous ();
		Thread t1=new Thread(mobj1,"First");
		
		Marvellous mobj2=new Marvellous ();
		Thread t2=new Thread(mobj2,"Second");
		
		//this program conatin three threads- main thread, t1 , t2
		
		t1.start();
		t2.start();
		
		
	}
}