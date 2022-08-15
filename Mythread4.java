

import java.lang.*;


class Marvellous extends Thread
{
	public void run()//running state
	{
		System.out.println("Inside Thread:"+Thread.currentThread().getName());
		for(int i=0;i<=1000;i++)
		{
			System.out.println("Thread Scheduled: "+Thread.currentThread().getName()+" : "+i);
		}
	}
}
class Mythread4
{
	public static void main(String args[])
	{
		
		Marvellous mobj1=new Marvellous ();
		Thread t1=new Thread(mobj1,"First");//new state
		
		Marvellous mobj2=new Marvellous ();
		Thread t2=new Thread(mobj2,"Second");
		
		//this program conatin three threads- main thread, t1 , t2
		
		t1.start();//runnable state
		t2.start();
		// Dead State
		
	}
}