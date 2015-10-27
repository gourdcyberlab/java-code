/*A node is accompanied by an agency. Messages are sent/received between nodes.
 * 
 */

import java.util.*;
public class Node 
{
	public Agency agency;
	private ArrayList<Message> messages = new ArrayList<Message>();
	private ArrayList<Node> connections= new ArrayList<Node>();
	
	//Constructors
	public Node()
	{
		
	}
	public Node(int id)
	{
		agency = new Agency(id);
	}
	
	public void addConnections(ArrayList<Node> a)
	{
		connections = a;
	}
	
	public ArrayList<Node> findPath(Node a, Node b)
	{
		ArrayList<Node> path = new ArrayList<Node>();
		//path.add(new Node(4));
		path.add(b);
		//I need a stack to do a breadth/depth search?
		
		return path;
	}
	
	public void send(Message message, Node node)
	{
		ArrayList<Node> path = findPath(this, node);
		agency.send(message,path);
	}
	
	public void receive(Agent a, ArrayList<Node> path)
	{
		agency.receive(a, path);
	}
	
	public void receive(Message m)
	{
		messages.add(m);
	}
	
	public String toString()
	{
		String out = "";
		if (messages.isEmpty()) return "No messages";
		for(Message m : messages)
		{
			out = out+m.getMessage()+"\n";	
		}
		return out;
	}
	
}
