package Trees;
import java.util.*;
public class BFS2 {

	int vertices;
	LinkedList<Integer> ll[];
	//HashMap<int,LinkedList<Integer>> hm=new HashMap<>();
	
	BFS2(int v)
	{
		vertices=v;
		ll=new LinkedList[v];
		
	}
	
	
	void addEdge(int a,int b)
	{
		if(ll[a]==null)
			ll[a]=new LinkedList();
			
		
		ll[a].add(b);
	}
	
	void BFS(int s)
	{
		boolean visited[]=new boolean[vertices];
		LinkedList<Integer> queue=new LinkedList<>();
		
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0)
		{
			s=queue.poll();
			System.out.println(s);
			Iterator i=ll[s].iterator();
			while(i.hasNext())
			{
				int n=(int) i.next();
				if(!visited[n])
				{
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String arg[])
	{
		BFS2 g = new BFS2(4);
		 
        g.addEdge(10, 11);
        g.addEdge(10, 12);
        g.addEdge(11, 12);
        g.addEdge(12, 10);
        g.addEdge(12, 13);
        g.addEdge(13, 13);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.BFS(2);
		
	}
}
