package dao;


public interface UserDAO {

	public boolean login(String username, String password);

	String data(String username);

}
