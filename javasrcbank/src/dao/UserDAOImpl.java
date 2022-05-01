package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import controller.LoginController;

import java.sql.PreparedStatement;

import org.apache.log4j.Logger;
import dao.ContextListener;


public class UserDAOImpl implements UserDAO {

	public static void main(String[] args) {
		UserDAOImpl dao = new UserDAOImpl();
		// dao.addUser(new User(0, "admin", "12345", "admin", "1"));
//		System.out.println(dao.checkUser("admin"));
		//System.out.println(dao.login("admin", "12345"));
	}

	static final Logger LOGGER = Logger.getLogger(LoginController.class);
	@Override
	public boolean login(String username, String password) {
		Connection con = DBConnect.getConnection();
		String sql = "select * from abcbanktb where username='" + username
				+ "' and password='" + password + "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				con.close();
				return true;
			}
		} catch (SQLException e) {
			LOGGER.info("query sent"+sql);
			return false;
			//e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public ResultSet data(String username) {
		Connection con = DBConnect.getConnection();
		String sql = "select * from abcbanktb where username='" + username+ "'";
		PreparedStatement ps;
		try {
			ps = (PreparedStatement) con.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				//String email = rs.getString("email");
				
				//con.close();
				return rs;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

	

	


}
