package dao;
import java.sql.*;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

import model.User;

public class UserDAOImpl {
	

	public static void main(String[] args)
	{
		UserDAOImpl dao = new UserDAOImpl();
			
	}
	
	public static boolean login(String username,String password)
	{
		Connection con = DBConnect.getConnection();
		String sql ="select * from banktb where username='"+username+"' and password='"+password+ "'";
		PreparedStatement ps;
		
		try {
			
			ps= (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				con.close();
				return true;
			}
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
}
