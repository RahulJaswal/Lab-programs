package lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class fchoose1 implements ActionListener
{
	JFrame f=null;
	
	fchoose1()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setSize(640,360);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		JButton b =new JButton("Chose background");
		b.setVisible(true);
		b.setSize(131,121);
		f.add(b);
		
		
		
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Color color=JColorChooser.showDialog(this,"Choose color", Color.blue);
		f.setBackground(Color.blue);
	}
	
}
public class lab38{

	public static void main(String[] args) 
	{
		fchoose1 o=new fchoose1();

	}

}
