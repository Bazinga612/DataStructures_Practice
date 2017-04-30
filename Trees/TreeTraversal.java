package Trees;

import Trees.BinarySearchTree.Node;

public class TreeTraversal {

	static Node root;
	static class Node
	{
		Node left;
		Node right;
		int data;
		Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
		
	}
	
	public void addNode(Node n,Node newNode)
	{
		TreeTraversal tr=new TreeTraversal();
		Node node=n;
		Node roott=tr.root;
		if(node.data>newNode.data)
		{
			node=node.left;
			if(node.right!=null)
			{
			addNode(node,newNode);
			}
			else if(node.right==null && node.left.data>newNode.data)

			{
				node.right=newNode;
			}
			
		}
		else if(node.data<newNode.data)
		{
			
			node=node.right;
			
			
			
			if(node.left==null && node.right.data>newNode.data)
			{
				node.left=newNode;
			}
			else
			{
				addNode(node,newNode);
			}
			
		}
		else {
			System.out.println("node cannot be added,already exists");
			
		}
		
	}
	public int rob(Node root) {
		
		
			int value=root.data;
			return recur(root,value);
		
		
		
	}
	
	
	public int recur(Node node,int value)
	{
		if(node.left==null && node.right==null)
			{ return (value+node.data);}
		int temp=0;
		if(node.left!=null)
			{temp=temp+node.data;
			}
		if(node.right!=null)
		{temp=temp+node.data;
		}
		if(temp>value)
			value=temp;
		
		return recur(node.left,value);
		recur(node.right,value);
			}
		
		
	
	public static void main(String argrs[])
	{
		TreeTraversal bst=new TreeTraversal();
		bst.root=new Node(10);
		Node one=new Node(-5);
		Node two=new Node(30);
		Node three=new Node(-10);
		Node four=new Node(0);
		Node five=new Node(5);
		Node six=new Node(30);
		Node seven=new Node(36);
		bst.root.left=one;
		bst.root.right=two;
		one.left=three;
		one.right=four;
		four.right=five;
		two.right=seven;
		Node newtobeadded=new Node(37);
		bst.addNode(bst.root, newtobeadded);
	}
}
