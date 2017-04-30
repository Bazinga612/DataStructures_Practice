package Trees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import Trees.BFS.Node;

public class BFS {

	static int[][] adj_matrix;
	static ArrayList<Node> al=new ArrayList<>();
	static Node root;
	static class Node
	{
		int data;
		boolean visited;
		Node(int data)
		{
			this.data=data;
		}
	}
	BFS(int [][] ad)
	{
		for(int i=0;i<ad.length;i++ )
		{
			for(int j=0;j<ad[0].length;j++)
			{
				adj_matrix[i][j]=ad[i][j];
			}
		}
	}

    public void bfs(int []adjacency_matrix,Node n) {
        //BFS uses Queue data structure
        Queue q = new LinkedList();
        q.add(n);
        System.out.println(n);
        root.visited = true;
        while(!q.isEmpty()) {
            Node n = (Node)q.remove();
            Node child = null;
            while((child = getUnvisitedChildNode(n)) != null) {
                child.visited = true;
                System.out.println(child);
                q.add(child);
            }
        }
        //Clear visited property of nodes
        clearNodes();
    }

    public int getUnvisitedChildNode(Node n)
    {int child=0;
    for(int i=0;i<adj_matrix.length;i++)
    {
    	for(int j=0;j<adj_matrix[0].length;j++)
    	{
    		if(adj_matrix[n])
    	}
    }
    return child;
    	

		
	}
public static void main(String args[])
{
	int adjacency_matrix[][] = 
		{ {0,1,1,0,0,0,0}, // Node 1: 40 
		  {0,0,0,1,0,0,0}, // Node 2 :10 
		  {0,1,0,1,1,1,0}, // Node 3: 20 
		  {0,0,0,0,1,0,0}, // Node 4: 30 
		  {0,0,0,0,0,0,1}, // Node 5: 60 
		  {0,0,0,0,0,0,1}, // Node 6: 50 
		  {0,0,0,0,0,0,0}, // Node 7: 70 
		};
	BFS bfs=new BFS(adjacency_matrix);
	bfs.root=new Node(40); 
	
	Node node10 =new Node(10); 
	Node node20 =new Node(20); 
	Node node30 =new Node(30); 
	Node node60 =new Node(60); 
	Node node50 =new Node(50); 
	Node node70 =new Node(70);
	al.add(bfs.root);
	al.add(node10);
	al.add(node20);
	al.add(node30);
	al.add(node60);
	al.add(node50);
	al.add(node70);
	
	
	
	bfs.searchBFS(adjacency_matrix,bfs.root);
		}
			//Read more at http://www.java2blog.com/2015/12/breadth-first-search-in-java.html#jPY7fpKW7ij4R7hP.99

}
