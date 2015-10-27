/*An agent contains a message to be sent to/from an agency.
 * It keeps track of what agencies it passes through to get to its destination
 */
public class Agent
{
	private Message message = new Message("DefaultMessage");
	private String trace = "";
	
	//Constructors
	public Agent()
	{
		
	}
	public Agent(Message m)
	{
		message = m;
	}
	
	public void setMessage(Message x)
	{
		message = x;
	}
	
	public Message getMessage()
	{
		return message;
	}
	
	//Keeps track of what agencies have been visited
	public void addTrace(String pollen)
	{
		trace= trace+pollen;
	}
	
	public String getTrace()
	{
		return trace;
	}
	
}
