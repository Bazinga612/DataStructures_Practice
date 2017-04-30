package Trees;

public class BinarySearchTree {
static Node head;
	static class Node{
		Node right;
		Node left;
		int data;
		Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
	}
	public void addNode(Node n)
	{
		Node node=n;
		Node nodeTree=head;
		while(n.data>nodeTree.data)
		{
			if(nodeTree.right!=null)
			nodeTree=nodeTree.right;
			else
			{
				nodeTree.right=node;
				break;}
			
		}
		while(n.data<nodeTree.data)
		{
			if(nodeTree.left!=null)
			nodeTree=nodeTree.left;
			else
			{nodeTree.left=node;
				break;
		}}
		
	}
	/*public Node preOrder(Node n)
	{
		Node newNode=n;
		Node temp;
		BinarySearchTree bt=new BinarySearchTree();
		
		if(bt.head.data==n.data)
		System.out.println(n.data);
		
		
			temp=newNode;
			if(newNode.left!=null)
			{newNode=newNode.left;
			
			System.out.println(newNode.data);
			}
			if(preOrder(newNode.left)==null)
			{
				newNode=temp;
				newNode=newNode.right;
				System.out.println(newNode.data);
				if(preOrder(newNode.right)==null)
				{
				return null;
				}
			}
			
		
		
		return newNode;
		
	}*/
	
	public void preOrder(Node n)
	{
		
		
		if(n==null)
		{
			
			return;
		}
			System.out.println(n.data);
			
			preOrder(n.left);
			preOrder(n.right);
			
			
	}
	
	public void inOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		
		inOrder(n.left);
		System.out.println(n.data);
		inOrder(n.right);
		
		
	}
	
	public void postOrder(Node n)
	{
		if(n==null)
		{
			return;
		}
		
		postOrder(n.left);
		postOrder(n.right);
		System.out.println(n.data);
		
		
		
	}
	public Node traversal(Node n,int key)
	{
		Node newNode=n;
		 if(newNode.data==key)
		{
			return newNode;
		}
		
		else if(newNode.data>key && newNode.left!=null)
		{
			newNode=newNode.left;
			if(traversal(newNode,key)!=null)
				return newNode;
			
		}
		else if(newNode.data<key && newNode.right!=null)
		{
			newNode=newNode.right;
			if(traversal(newNode,key)!=null)
				return newNode;
		}
		
		newNode=null;
		return newNode;
	}
	
	public void delete(Node n)
	{
		Node node=n;
		Node nodeTree=head;
		if(node==traversal(node,nodeTree.data))
		{
			if(node.left!=null)
				node=node.left;
			else
				node=node.right;
		}
	}
	public boolean search(int key)
	{
		BinarySearchTree bst=new BinarySearchTree();
		Node left=bst.head.left;
		Node right=bst.head.right;
		if(bst.head.data==key)
			return true;
		else
		{
			if(bst.head.data>key)
			{
				
				left=bst.head.left;
				if(traversal(left,key)==null)
					return false;
					else
						return true;
				
			}
			else
			{
				right=bst.head.right;
				if(traversal(right,key)==null)
				return false;
				else
					return true;
				
			}
		}
		
	}
	public static void main(String args[])
	{
		BinarySearchTree bst=new BinarySearchTree();
		bst.head=new Node(10);
		Node one=new Node(-5);
		Node two=new Node(30);
		Node three=new Node(-10);
		Node four=new Node(0);
		Node five=new Node(5);
		Node six=new Node(30);
		Node seven=new Node(36);
		Node eight=new Node(17);
		Node nine=new Node(31);
		bst.head.left=one;
		bst.head.right=two;
		one.left=three;
		one.right=four;
		four.right=five;
		two.right=seven;
		two.left=eight;
		//bst.addNode(eight);
		//bst.addNode(nine);
		//bst.preOrder(bst.head);
		//bst.inOrder(bst.head);
		//bst.postOrder(bst.head);
		//System.out.println(bst.search(30));
		if(bst.search(30)==true)
		{
			bst.delete(nine);}
			else
				System.out.println("does not exist");
		}
		
	}

