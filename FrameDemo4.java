
import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class MarvellousFrame
{
	public Frame fobj;
	public MarvellousFrame(String name)
	{
		fobj=new Frame(name);//resorce allocation
		fobj.setSize(600,600);//size in pixel
		fobj.setVisible(true);//for visble on console
		fobj.addWindowListener(new MarvellousListener());
	}
	
}

class MarvellousListener extends WindowAdapter//implements WindowListener
{
	
	public void windowClos;ing(WindowEvent obj)
	{
		System.out.println("Inside windowClosing");
		System.exit(0);
	}
	
	
}
class FrameDemo4
{
	public static void main(String args[])
	{
		System.out.println("Print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
		
	}
}