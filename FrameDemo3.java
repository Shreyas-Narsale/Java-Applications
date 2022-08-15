
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

class MarvellousListener implements WindowListener
{
	//abstarct methos in WindowListener interface that methods shoul be overrride
	public void windowDeactivated(WindowEvent obj)
	{}
	public void windowActivated(WindowEvent obj)
	{}
	public void windowDeiconified(WindowEvent obj)
	{}
	public void windowIconified(WindowEvent obj)
	{}
	public void windowClosed(WindowEvent obj)
	{}
	public void windowClosing(WindowEvent obj)
	{
		System.out.println("Inside windowClosing");
		System.exit(0);
	}
	public void windowOpened(WindowEvent obj)
	{}
	
}
class FrameDemo3
{
	public static void main(String args[])
	{
		System.out.println("Print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
		
	}
}