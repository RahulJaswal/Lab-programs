package lab;
class t1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=9;i=i+2)
		{
			System.out.println(i);
			
			
		}
	}
}
class t2 extends Thread
{
	public void run()
	{
		for(int i=2;i<=10;i=i+2)
		{
			System.out.println(i);
			//notify();
		
	}}
}
public class lab24 {

	public static void main(String[] args)
	{
		t1  o=new t1();
		t2  ob=new t2();
		
		o.start();
		ob.start();
	}

}
