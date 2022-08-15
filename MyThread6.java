
import java.lang.*;

class Demo extends Thread
{
	public void run()//Running Thread
	{
		System.out.println("Inside Thread:"+Thread.currentThread().getName());
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Value of i:"+i);
			try
			{
				Thread.sleep(1000);//1000 miliseconds (1 sec)
			}
			catch( InterruptedException  obj)
			{
			}
				
		}
	}
}
class Mythread6
{
	public static void main(String args[]) throws Exception
	{
		Demo dobj1=new Demo();
		Thread t1=new Thread(dobj1);//new state
		
		Demo dobj2=new Demo();
		Thread t2=new Thread(dobj2);
		
		t1.start();//Runnable state

		t1.join();
		t2.start();
		//dead state
	}
}
