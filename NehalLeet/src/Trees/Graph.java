package Trees;
import java.util.*;
public class Graph {

	private HashMap<Integer,Node> table=new HashMap<>();
	
	public static class Node
	{
		int id;
		LinkedList<Node> adjacent=new LinkedList<>();
		Node(int id)
		{
			this.id=id;
		}
		
		
	}
	public Node getNode(int id1)
	{
		return table.get(id1);
		
	}
		public void addEdge(int source,int destination)
		{
			Node source1=getNode(source);
			Node destination1=getNode(destination);
			if(getNode(source)==null)
			{
				source1=new Node(source);
				table.put(source, source1);
			}
			if(getNode(destination)==null)
			{
				 destination1=new Node(destination);
				 table.put(destination, destination1);
				 
			}
			
			source1.adjacent.add(destination1);
		}
	
		public boolean DFS(int source,int destination)
		{
			Node source1=table.get(source);
			Node destination1=table.get(destination);
			
			if(source1.adjacent.contains(destination1))
			{
				System.out.println(source1.id);
				return true;
			}
			else
			{
				if(source1!=null )
					if(source1.adjacent.peekFirst()!=null)
						
				{
				source1=source1.adjacent.getFirst();
				
				DFS(source1.id,destination);
				}
				else
				{
					System.out.println("not found");
					return false;
				}
					
			}
			return false;
		}
		
		public boolean BFS(int source,int destination)
		{
			Node source1=table.get(source);
			Node destination1=table.get(destination);
			LinkedList<Node> toVisit=new LinkedList<>();
			LinkedList<Integer> visited=new LinkedList<>();
			toVisit.add(source1);
			
			while(!toVisit.isEmpty())
			{
				Node node=toVisit.remove();
				if(node.id==destination)
				{System.out.println("found");
					return true;
				}
				if(visited.contains(node.id))
				{
					continue;
				}
				visited.add(node.id);
				
				for(Node child:node.adjacent)
				toVisit.add(child);
			}
			System.out.println("not found");
			return false;
		}
		public static void main(String args[])
		{
			Graph g=new Graph();
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(1, 3);
			g.addEdge(3, 4);
			g.addEdge(4, 5);
			g.addEdge(5, 6);
			g.DFS(0,1);
		}
}
