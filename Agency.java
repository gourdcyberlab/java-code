/*An agency sends and receives Agents to/from other agencies.
 * The agency is responsible for serializing the messages it sends and
 * de-serializing the messages it receives.
 * 
 * 
 */
import java.util.*;

public class Agency 
{
	private String pollen = "";
	private ArrayList<String> registry = new ArrayList<String>();
	
	//Constructors
	public Agency()
	{
		
	}
	public Agency(int p)
	{
		pollen = ""+p;
	}
	
	//Takes a message from the node, converts it to an agent, and sends it to another node
	public void send(Message message, ArrayList<Node> path)
	{
		Message s = Serialize(message);
		Agent a= new Agent(s);
		a.addTrace(pollen);
		
		send(a, path);
	}
	
	public void send(Agent a, ArrayList<Node> path)
	{	
		path.get(0).receive(a, path);
	}
	
	public void receive(Agent a, ArrayList<Node> path)
	{
		a.addTrace(pollen);
		Node last= path.get(0);
		path.remove(0);
		if(path.isEmpty())
		{
			registry.add(a.getTrace());
			Message m= Deserialize(a.getMessage());
			last.receive(m);
		}
		else
		{
			send(a, path);
		}
	}
	public Message Serialize(Message message)
	{
		message.setMessage(message.getMessage()+"7");
		return message;
	}
	
	public Message Deserialize(Message message)
	{
		String string = "";
		for(int x=0; x<message.getMessage().length()-1; x++)
		{
			string = string+message.getMessage().charAt(x);
		}
		message.setMessage(string);
		return message;
	}
	
	public String toString()
	{
		String out = "";
		if (registry.isEmpty()) return "No traces";
		for(String s : registry)
		{
			out = out+s+"\n";
			
		}
		return out;
	}
}
