package lab;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

class ludo implements ActionListener
{
	JFrame f=null;
	JButton jb=null;
	ludo()
	{
		f=new JFrame();
		f.setSize(640,360);
		f.setVisible(true);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb=new JButton("Spin");
	
		
		f.add(jb);
		jb.setBounds(300,100,80,80);
		jb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Random r=new Random();
		jb.setText(""+r.nextInt(6));
	}
	
}
public class lab31_2 {

	public static void main(String[] args)
	{
		ludo obj=new ludo();

	}

}
