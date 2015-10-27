import java.util.*;
public class Stack 
{
	ArrayList<Node> list = new ArrayList<Node>();
	
	public Stack()
	{
		
	}
	
	public void push(Node s)
	{
		list.add(s);
	}
	
	public Node pop()
	{
		if (list.size()==0) return null;
		Node s = list.get(list.size()-1);
		list.remove(list.size()-1);
		return s;
	}
	
}
