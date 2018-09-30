package lab;
import java.util.Scanner;
public class lab26 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String st=new String();
		System.out.println("Enter the String=");
		st=s.nextLine();
		try
		{
			int a=Integer.parseInt(st);
			System.out.println("The square is: "+a*a);
			System.out.println("the work has been done successfully !");
		}
		catch(NumberFormatException  e)
		{
			System.out.println("error");
		}

	}

}
