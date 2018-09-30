package lab;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class fchoose implements ActionListener
{
	JFrame f=null;
	JFileChooser jc=null;
	JMenu m=null;
	JMenuItem i1=null;
	JMenuBar mb =null;
	fchoose()
	{
		f=new JFrame();
		f.setVisible(true);
		f.setSize(640,360);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		m=new JMenu("Menu");
		i1=new JMenuItem("Open");
		m.add(i1);
				
		mb=new JMenuBar();
		mb.add(m);
		f.add(mb,BorderLayout.NORTH);

		
		
		i1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		jc=new JFileChooser();
		jc.showOpenDialog(null);
	}
	
}
public class lab36 {

	public static void main(String[] args) 
	{
		fchoose o=new fchoose();

	}

}
