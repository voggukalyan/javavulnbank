package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


public class UserDAOImpl implements UserDAO {

	public static void main(String[] args) {
		UserDAOImpl dao = new UserDAOImpl();
		// dao.addUser(new User(0, "admin", "12345", "admin", "1"));
//		System.out.println(dao.checkUser("admin"));
		//System.out.println(dao.login("admin", "12345"));
	}

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
			e.printStackTrace();
		}
		return false;
	}

	


}
