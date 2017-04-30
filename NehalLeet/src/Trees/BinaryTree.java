package Trees;

import java.util.ArrayList;
import java.util.Iterator;

import Trees.BinarySearchTree.Node;

public class BinaryTree {
 Node root;
	static class Node
	{
		Node left;
		Node right;
		int data;
		Node(int val)
		{
			data=val;
		}
	}
	
	public void insert(int key)
	{
		addNode(key,root);
	}
	public Node addNode(int key,Node a)
	{
		if(a==null)
		{
			a=new Node(key);
			return a;
		}
		else
		{
			
			if(key>a.data)
			{
				a.right=addNode(key,a.right);
			}
			else if(key<a.data)
			{
				a.left=addNode(key,a.left);
			}
			
		}
		return a;
	}
	public boolean search(int key)
	{

		Node result=searchRec(key,root);
		if(result==null)
				return false;
		else return true;
	}
	public Node searchRec(int key,Node a)
	{
		if(a==null)
			return null;
		if(key==a.data)
			return a;
		else
		{
			if(key>a.data)
				return searchRec(key,a.right);
			else 
				return searchRec(key,a.left);
		}
		
	}
	public void delete(int key)
	{
		deleteRec(key,root);
	}
	public void deleteRec(int key,Node current)
	{
		
		if(current==null)
		{
			return ;
		}
		else
		{
			if(current.data>key)
			{
			if(current.left.data==key)
			{
				current.left=null;
			}
			else
			{
				deleteRec(key,current.left);
			}}
			else if(current.data<key)
			{
			if(current.right.data==key)
			{
				current.right=null;
			}
			else
			{
				deleteRec(key,current.right);
			}
			}
		}
	}
	
public int sumOfLeftLeaves(Node root,boolean b) {

if(root==null)
return 0;if(root.left==null && root.right==null)
        {
        	if(b==true)
        	return root.data;
        	else return 0;
        	
        }
        else 
        {
        	
        	return sumOfLeftLeaves(root.left,true)+sumOfLeftLeaves(root.right,false);
        			
        }
      
    }
public ArrayList height(Node node,ArrayList a,int height)
{int data=0;
	if(node!=null)
	if(node.left==null && node.right==null)
	{
		return a;
	}
		if(node!=null)
		{
		if(node.left!=null && node.right!=null)
		{
			data=node.left.data+node.right.data;
		}
		
		else if(node.left==null && node.right!=null)
			{
				data=node.right.data;
			}
		else if(node!=null)
			if(node.left!=null && node.right==null)
			{
				data=node.left.data;
			}
		a.add(data);
		height(node.left,a,height);
		height(node.right,a,height);
		
		}
return a;
}
public int maxHeight(Node node,int height)
{
	
	if(node==null)
	{
		return 0;
		
	}
	else
	{
	int a=maxHeight(node.left,height);
	 int b=maxHeight(node.right,height);
	if(a<b)
		return a+1;
	else
		return b+1;
	
	}
}
public Node invertTree(Node node) {
    if(node==null)
    {
    	return null;
    }
    else if(node!=null)
    {
    	Node a=node.left;
    	
    	Node b=invertTree(node.right);
    	Node c=invertTree(a);
    	
    }
    return root;
}
public boolean Symmetric()
{
	
	return isSymmetric(root);
	
}
public boolean isSymmetric(Node node)
{
	if(node!=null)
	{
		if(isSymmetric(node.left)==isSymmetric(node.right))
		return true;
		else return false;
	}
	
	return false;
}

	public static void main(String args[])
	{
		int a=4;
		
		BinaryTree bst=new BinaryTree();
		bst.root=new Node(10);
		Node one=new Node(-5);
		Node two=new Node(30);
		Node three=new Node(-10);
		Node four=new Node(0);
		Node five=new Node(5);
		Node six=new Node(30);
		Node seven=new Node(36);
		Node eight=new Node(17);
		Node nine=new Node(31);
		bst.insert(10);
		bst.insert(one.data);
		bst.insert(two.data);
		bst.insert(three.data);
		bst.insert(four.data);
		bst.insert(five.data);
		bst.insert(six.data);
		bst.insert(seven.data);
		bst.insert(eight.data);
		bst.insert(nine.data);
		ArrayList ab=new ArrayList<>();
		ab=bst.height(bst.root, ab,0);
		Iterator it=ab.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//System.out.println(bst.maxHeight(bst.root, 1));
		//bst.invertTree(bst.root);
		System.out.println(bst.isSymmetric(bst.root));
		//System.out.println(bst.sumOfLeftLeaves(bst.root,false));
		//bst.delete(0);
		//System.out.println(bst.search(100));
	}
}
