package blood.dto;

public class ReceiverLoginDTO {
	
	String user_id,user_name,password;

	public String getUser_id()
	{
		return user_id;
	}

	public void setUser_id(String user_id) 
	{
		this.user_id = user_id;
	}

	public String getUser_name()
{
		return user_name;
	}

	public void setUser_name(String user_name) 
	{
		this.user_name = user_name;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	

}
