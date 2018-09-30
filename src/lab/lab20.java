package lab;
import java.util.Scanner;
import java.util.StringTokenizer;
public class lab20 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string:");
		String st1=sc.nextLine();
		System.out.println("Enter 2nd string:");
		String st2=sc.nextLine();
		
		String str1[]=st1.split("");
		String str2[]=st2.split("");
		
		int i=0,j=0,count=0,count2=0;
		
		while(i<str1.length)
		{
			count=0;
		while(j<str1.length)
		{	
			if(str1[i].equals(str1[j]))
			{
				count++;
			}
			j++;
		}
		j=0;
		if(str1[i]!=" ")
		{
			while(j<str2.length)
			{
				if(str1[i].equals(str2[j]))
						{
							count2++;
						}
			}
		}
		if(count!=count2)
		{
			System.out.println("not anagram");
			System.exit(1);
		}
		
		i++;
		}
	}

}
