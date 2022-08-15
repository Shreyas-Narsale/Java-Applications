
import java.lang.*;

class Demo extends Thread
{
	public void run()//Running Thread
	{
		System.out.println("Inside Thread:"+Thread.currentThread().getName());
		System.out.println("Thread Prority is:"+Thread.currentThread().getPriority());
		
		
	}
}
class Mythread9
{
	public static void main(String args[])
	{
		System.out.println("Inside Thread:"+Thread.currentThread().getName());
		System.out.println("Thread Prority is:"+Thread.currentThread().getPriority());
		
		Demo dobj1=new Demo();
		Thread t1=new Thread(dobj1,"First");
		
		Demo dobj2=new Demo();
		Thread t2=new Thread(dobj2,"Second");
		
		t1.setPriority(10);
		t2.setPriority(2);
		t1.start();
		t2.start();
		
	}
}
