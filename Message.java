//Temporary container class
public class Message 
{
	private String message = "";
	
	//Constructors
	public Message()
	{
		
	}
	public Message(String m)
	{
		message = m;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String x)
	{
		message = x;
	}
}
