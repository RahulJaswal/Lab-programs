package lab;

import java.sql.*;

public class lab39 {

	public static void main(String[] args) 
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORACLE","scott","tiger");
			System.out.println("Connection established successfully!");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from dept");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"- "+rs.getString(2)+" -"+rs.getString(3)+" ");
			}
			con.close();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
			//System.out.println("one");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
