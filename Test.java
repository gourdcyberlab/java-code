import java.util.*;
import java.math.*;
/*This program will test agent sending/receiving through agencies.
 * 
 */
public class Test 
{
	public static void main(String[] args) 
	{		
		ArrayList<Node> a = new ArrayList<Node>();
		ArrayList<Node> b = new ArrayList<Node>();
		ArrayList<Node> c = new ArrayList<Node>();
		
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		
		a.add(node2);
		b.add(node1);
		b.add(node3);
		c.add(node2);
		
		node1.addConnections(a);
		node2.addConnections(b);
		node3.addConnections(c);
		
		Message m= new Message("Hi");
		
		int z;
		int g=0;
		int h=0;
		int i=0;
		int y;
		for (int x=1; x<=500; x++)
		{
			z=(int) (Math.random()*3);
			y=(int) (Math.random()*3);
			if(z==1)
			{
				g++;
				if(y==1) node1. send(m, node1);
				if(y==2) node1. send(m, node2);
				if(y==0) node1. send(m, node3);
			}
			if(z==2)
			{
				h++;
				if(y==1) node2. send(m, node1);
				if(y==2) node2. send(m, node2);
				if(y==0) node2. send(m, node3);
			}
			if(z==0)
			{
				i++;
				if(y==1) node3. send(m, node1);
				if(y==2) node3. send(m, node2);
				if(y==0) node3. send(m, node3);
			}
		}
		

		
		System.out.println(node2);
		System.out.println(node2.agency);
	}

}
