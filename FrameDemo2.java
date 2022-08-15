
import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
	public Frame fobj;
	public MarvellousFrame(String name)
	{
		fobj=new Frame(name);//resorce allocation
		fobj.setSize(600,600);//size in pixel
		fobj.setVisible(true);//for visble on console
	}
}

class FrameDemo2
{
	public static void main(String args[])
	{
		System.out.println("Print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
		
	}
}