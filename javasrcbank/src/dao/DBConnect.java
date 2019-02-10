package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection()
	{
		Connection cons =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/abcbankdb","root","happy123$");
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return cons;
	}
	
	public static void main(String[] args)
	{
		System.out.println(getConnection());
	}

}
