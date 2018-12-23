package model;

public class User {
	private int acno;
	private String username;
	private String password;
	public User (int acno,String username,String password)
	{
		this.acno=acno;
		this.username=username;
		this.password = password;
		
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
	public void setUsername(int username)
	{
		this.acno=username;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(int password)
	{
		this.acno=password;
	}
	

}
