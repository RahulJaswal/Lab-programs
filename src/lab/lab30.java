package lab;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class lab30 {

	public static void main(String[] args)
	{
		File file=new File("F:\\my doc\\testd.txt");
		FileReader fr=null;
		String st="";
		String temp="";
		try   //to read and copy string in st;
		{
			fr=new FileReader(file);
			int ch;
			while((ch=fr.read())!=-1)
			{
				st=st.concat((char)ch +"");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		StringTokenizer str=new StringTokenizer(st);
		while(str.hasMoreTokens())
		{
			String temp0;
			if(temp.length()<(temp0=str.nextToken()).length()) //just calculate the length of each token
			{
				temp=temp0;
			}
		}
		System.out.println("word with largest length is - "+temp);
	}

}
