package Graphs;

import java.util.HashSet;
import java.util.LinkedList;

public class BFS1 {
	LinkedList<Integer> ll[];
	BFS1(int v)
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
		public void traversal(int a)
		{
			LinkedList next=new LinkedList();
			HashSet visited=new HashSet();
			next.add(a);
			
			while(!next.isEmpty())
			{
				int node=(int) next.remove();
				visited.add(node);
				for(int i=0;i<ll[node].size();i++)
				{
					if(!next.contains(ll[node].get(i)))
					next.add(ll[node].get(i));
				}
				
			}
		}
		public static void main(String args[])
		{
			BFS1 bfs=new BFS1(4);
			bfs.addEdge(1,2);
			bfs.addEdge(1,3);
			bfs.addEdge(2,4);
			bfs.addEdge(3,4);
			bfs.traversal(1);
			
			//bfs.print();
		}
}
