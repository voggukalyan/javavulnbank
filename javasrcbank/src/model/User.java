package model;

public class User {
	private int acno;
	private String username;
	private String password;
	private boolean isadmin;
	public User (int acno,String username,String password, boolean isadmin)
	{
		this.acno=acno;
		this.username=username;
		this.password = password;
		this.setIsadmin(isadmin);
		
	}
	
	public int getAcno()
	{
		return acno;
	}
	public void setAcno(int acno)
	{
		this.acno=acno;
	}
	
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}

	public boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}
	

}
