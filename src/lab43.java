import java.io.Serializable;
public class lab43 implements Serializable
{
	String name;
	int rno;
	public void setName(String n)
	{
		name=n;
	}
	public void setRno(int n)
	{
		rno=n;
	}
	String getName()
	{
		return name;
	}
	int getRno()
	{
		return rno;
	}

	public static void main(String[] args) 
	{
		lab43 obj=new lab43();
		obj.setName("Grey");
		obj.setRno(123);
		System.out.println("Name is "+obj.getName()+" & Roll no is "+obj.getRno());
	}

}
