
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
				Thread.sleep(5000);//1000 miliseconds (1 sec)
			}
			catch( InterruptedException  obj)
			{
			}
				
		}
	}
}
class Mythread5
{
	public static void main(String args[])
	{
		Demo dobj1=new Demo();
		Thread t1=new Thread(dobj1);//new state
		
		Demo dobj2=new Demo();
		Thread t2=new Thread(dobj2);
		
		t1.start();//Runnable state
		t2.start();
		//dead state
	}
}
//jar don thread excute hot astil  ani same logic asal tar firsrt thread complete zalavar dusara band karaycha asal tar, py batch la era che icream che example dilate , te kase karat yeil sanaga na