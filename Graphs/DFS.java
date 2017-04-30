
package Graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	LinkedList<Integer> ll[];
	Stack stack=new Stack();
	boolean visited[]=new boolean[5];
	DFS(int v)
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
	
	
	while(visited[ll[count].get(i)]!=true)
	{
		
		traversal(ll[count].get(i));
	}
}
				}
			
		
		
			
			//System.out.println(visited[i]);
		}
		
	
		
	}
	public int calculateAll(int [][] input)
	{
		int count=0;
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[i].length;j++)
			{
				count++;
			}
		}
		int finalcount=count*(count-1)/2;
		return finalcount;
	}
	
	public void jtm(int [][] input)
	{
		int a=calculateAll(input);
		System.out.println(a);
		int b=0;
		for(int i=0;i<input.length;i++)
		{
			
			b=b+dfs(input[i][0],0);
		}
		System.out.println(b);
		System.out.println(a-b);
	}
	public int dfs(int n,int count)
	{
		Stack s=new Stack();
		s.push(n);
		while(visited[n]!=true)
		{
			visited[n]=true;
			Iterator it=ll[n].iterator();
			while(it.hasNext())
			{
				int n1=(int) it.next();
				while(visited[n1]!=true)
				{
					
					dfs(n1,count+1);
				}
				
			}
			
		}
		return count;
	}
	public static void main(String args[])
	{
		DFS bfs=new DFS(4);
		bfs.addEdge(1,4);
		bfs.addEdge(1,2);
		bfs.addEdge(1,3);
		
		bfs.addEdge(2,4);
		bfs.addEdge(3,4);
		bfs.addEdge(4,2);
		//bfs.dfs(1);
		//bfs.traversal(1);
		//bfs.print();
	int [][] input={{0,1},{2,3}};
	bfs.jtm(input);
	}
}
