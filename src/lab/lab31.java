package lab;

import java.util.LinkedList;

public class lab31 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for(int p=list.size()-1;p>=0;p--)
		{
			System.out.println(list.get(p));
		}
	}

}
