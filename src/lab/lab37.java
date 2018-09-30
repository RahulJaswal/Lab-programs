package lab;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class tfield 
{
	JFrame j=null;
	JTextField tf=null;
	JButton b=null;
	JLabel lb=null;
	tfield()
	{
		j=new JFrame();
		j.setSize(640,360);
		j.setVisible(true);
		j.setLayout(null);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//lb=new JLabel("Name = ",BorderLayout.WEST);
		lb.setVisible(true);
		j.add(lb);
	
		tf=new JTextField(10);
		tf.setVisible(true);
		tf.setBounds(20, 50, 70,20);
		
		j.add(tf);
		
		b=new JButton("Submit");
		b.setBounds(320,200,131,121);
		j.add(b);
	}
}

public class lab37 {

	public static void main(String[] args)
	{
		tfield t=new tfield();

	}

}
