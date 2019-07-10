package dao;

import java.sql.ResultSet;

public interface UserDAO {

	public boolean login(String username, String password);

	ResultSet data(String username);

}
