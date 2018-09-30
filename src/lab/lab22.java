package lab;
class dummy extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("j= "+i);
		}
	}
	
}
public class lab22 extends Thread 
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("i= "+i);
		}
	}
	public static void main(String args[])
	{
		new lab22().start();
		new dummy().start();
	}
}
