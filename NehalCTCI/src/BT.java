import java.util.ArrayList;
import java.util.Stack;
 
/* Class containing left and right child of current 
 node and key value*/

 
/* Class to print the inorder traversal */
class BT {
 
    Node root;
    class Node {
    	 
        int data;
        Node left, right;
     
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
 
    void inorder() {
        if (root == null) {
            return;
        }
        
        //keep the nodes in the path that are waiting to be visited
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
         
        //first node to be visited will be the left one
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
         
        // traverse the tree
        while (stack.size() > 0) {
           
            // visit the top node
            node = stack.pop();
            System.out.print(node.data + " ");
            if (node.right != null) {
                node = node.right;
                 
                // the next node to be visited is the leftmost
                while (node != null) {
                    stack.push(node);
                    node = node.left;
                }
            }
        }
    }
public Node buildTree(int[] preorder, int[] inorder) {
        
	return helper(preorder[0],inorder[0],inorder[inorder.length-1],preorder,inorder );
	
    }

public Node helper(int pstart,int instart,int end,int[] preorder,int []inorder)

{
	Node node=new Node(preorder[pstart]);
	
	for(int i=instart;i<=end;i++)
	{
		if(node.data==inorder[i])
			instart=i;
	}
	root.left=helper(pstart+1,instart,pstart,preorder,inorder);
	root.right=helper(pstart+1,instart,pstart,preorder,inorder);
	return root;
	
}
    public static void main(String args[]) {
         
        /* creating a binary tree and entering 
         the nodes */
        BT tree = new BT();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);
        tree.inorder();
    }
}