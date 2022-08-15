
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class Demo//backend
{
	public String DataDe()
	{
		return "Jay Ganesh...";//ethe socket join kara ani data server varun ghya
	}
	
}
class MarvellousFrame extends WindowAdapter implements ActionListener//frotend class
{
	public Frame fobj;
	public Button bobj;
	public TextField tobj;
	
	public MarvellousFrame(String name)
	{
		fobj=new Frame(name);
		bobj=new Button("Marvellous");
		tobj=new TextField();
		
		tobj.setBounds(60,60,170,20);
		bobj.setBounds(110,130,90,20);
		
		fobj.add(bobj);
		fobj.add(tobj);
		
		fobj.setSize(600,600);
		fobj.setVisible(true);
		fobj.setLayout(null);//set default layout of frame
		
		bobj.addActionListener(this);
		fobj.addWindowListener(this);
	}
	public void windowClosing(WindowEvent obj)
	{
		System.out.println("Inside windowClosing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent obj)
	{
		Demo dobj=new Demo();
		String str=dobj.DataDe();
		System.out.println("Inside Button clicked");
		tobj.setText(str);
	}
	
}


class FrameDemo5
{
	public static void main(String args[])
	{
		System.out.println("Print the data on console");
		
		MarvellousFrame mobj=new MarvellousFrame("PPA");
		
		
	}
}