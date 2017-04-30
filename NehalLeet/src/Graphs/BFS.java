package Graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	LinkedList<Integer> ll[];
	BFS(int v)
	{ 
		ll=new LinkedList[v+1];
		for(int i=0;i<=v;i++)
		{
			ll[i]=new LinkedList<Integer>();
		}
	}	
		public void addEdge(int a,int b)
		{
			ll[a].add(b);
		}
	
	void traversal(int s)
	{

		boolean visited[]=new boolean[5];
		LinkedList<Integer>ll2=new LinkedList<>();
		//visited[s]=true;
		ll2.add(s);
		int count=s;
		
			
			while(!ll2.isEmpty()&& visited[s]!=true)
			{
				count=ll2.poll();
		for(int i=0;i<ll[count].size();i++)
		{
	System.out.println(ll[count].get(i));
	ll2.add(ll[s].get(i));
	
					
}
			
		visited[s]=true;
		s=ll2.getFirst();
			
			//System.out.println(visited[i]);
		}
		
	
		
	}
	public static void main(String args[])
	{
		BFS bfs=new BFS(4);
		bfs.addEdge(1,2);
		bfs.addEdge(1,3);
		bfs.addEdge(2,4);
		bfs.addEdge(3,4);
		
		bfs.traversal(1);
		//bfs.print();
	}
}
