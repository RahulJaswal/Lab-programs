package lab;
class thread0 implements Runnable
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println("i= "+i);
		}
	}

}
public class lab23 {

	public static void main(String[] args) 
	{
		thread0 obj=new thread0();
		Thread obj0=new Thread(obj);
		if(!false)
		{
			System.out.println("check!");
		}
		obj0.start();
	}

}
