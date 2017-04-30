package Graphs;


import java.util.LinkedList;
import java.util.Stack;

public class Cycle{
	LinkedList<Integer> ll[];
	Stack stack=new Stack();
	boolean visited[]=new boolean[5];
	int exists=0;
	Cycle(int v)
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
	
	int isAcyclic(int s)
	{
		stack.add(s);
		int count=s;
		while(visited[count]!=true)
		{
			visited[count]=true;
			
		while(stack.size()!=0)
			{
			System.out.println(stack.peek());
				
			stack.pop();
		for(int i=0;i<ll[count].size();i++)
		{
			if(visited[ll[count].get(i)]!=true)
	{
				isAcyclic(ll[count].get(i));
	}
			else
			{
				exists=1;
			}
}
				}
	
		}
		
		return exists;
		
	}
	public static void main(String args[])
	{
		Cycle bfs=new Cycle(4);
		bfs.addEdge(0,1);
		bfs.addEdge(1,2);
		bfs.addEdge(2,4);
		bfs.addEdge(2,3);
		bfs.addEdge(3,3);
		int exists=bfs.isAcyclic(0);
		if(exists!=0)
		{
			System.out.println("cycle exists");}
			else
				System.out.println("cycle not exists");
		
		//bfs.print();
	}
}
