package DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BinaryTree {

	TreeNode root;
	String finalpaths="";
	static public class TreeNode{
		int val;
		TreeNode right;
		TreeNode left;
		TreeNode(int x)
		{
			val=x;
		}
	}
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> paths=new ArrayList();
		int count=0;
		
		TreeNode t=root;
		
		
		while(t.left!=null || t.right!=null)
		{
			traversal(root);
		}
		
		return paths;
	}
	public void traversal(TreeNode node)
	{
		List<Integer>list=new ArrayList();
		HashMap hm=new HashMap();
		if(node==root)
		{
		list.add(root.val);}
		
		while(node.left!=null)
		{ 
			node=node.left;
			hm.put(node.val, "true");
			list.add(node.val);
			
		}
		while(node.right!=null)
		{ 
			node=node.right;
			hm.put(node.val, "true");
			list.add(node.val);
			
		}
	}
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.root =new TreeNode(1);
		
		TreeNode t2=new TreeNode(2);
		TreeNode t3=new TreeNode(3);
		TreeNode t4=new TreeNode(4);
		bt.root.left=t2;
		bt.root.right=t3;
		t2.right=t4;
		
	}
}
