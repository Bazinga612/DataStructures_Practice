import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree
{
    // Root of Binary Tree
    Node root;
 
    BinaryTree()
    {
        root = null;
    }
 
    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.key + " ");
    }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
 public void call(Node root)
 {
	 ArrayList inner=new ArrayList();
	 inner=printPreorder(root,inner);
	 Iterator it=inner.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
 }
    /* Given a binary tree, print its nodes in preorder*/
    ArrayList printPreorder(Node node,ArrayList inner)
    {
        if (node == null)
            return inner;
        
        inner.add(node.key);
        /* first print data of node */
        System.out.print(node.key + " ");
 
        /* then recur on left sutree */
        printPreorder(node.left,inner);
        inner.add(node.key);
        /* now recur on right subtree */
        printPreorder(node.right,inner);
        inner.add(node.key);
        return inner;
    }
    
/*public List<List<Integer>> levelOrderBottom(Node root) {
        
List inner=new ArrayList();
List<List<Integer>> outer=new ArrayList<List<Integer>>();
outer=levelOrder(root,outer);
return outer;
    }

public List<List<Integer>> levelOrder(Node root,List<List<Integer>> outer) {

outer=levelOrder(root,outer);
return outer;
    }*/

/*public int[] findMode(Node root) {
    int max=0;
    int value[] ;
    HashMap hashmap=new HashMap();
    findMode(root,hashmap);
    String s="";
    Iterator it=hashmap.keySet().iterator();
    while(it.hasNext())
    {
        int a=(int)it.next();
        if((int)hashmap.get(a)>max)
        {
            max=(int) hashmap.get(it.next());
            s=s+a;
        }
        else
            if((int)hashmap.get(a)==max)
            {
                value[value.length+1]=a;
            }
        
    }
    
    return value;
    
    }
public void findMode(Node root,HashMap hashmap)
{
    if(root==null)
        return;
    if(!hashmap.containsKey(root.key))
    hashmap.put(root.key, 1);
    else
        hashmap.put(root.key, (int)hashmap.get(root.key)+1);
    findMode(root.left,hashmap);
    findMode(root.right,hashmap);
}*/
    
public Node invertTree(Node root) {
        
	if(root==null)
		return null;
	Node temp=invertTree(root.left);
	root.left=invertTree(root.right);
	root.right=temp;
	return root;
    }
    // Wrappers over above recursive functions
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
   /* void printPreorder()   {     printPreorder(root);  }*/
 
    public int sumOfLeftLeaves1(Node root)
    {
        return sumOfLeftLeaves(root, 0,false);
    }
public int sumOfLeftLeaves(Node root,int count,boolean b) {
    if(root==null)
        return count;
        if(root.left==null && root.right==null && b==false)
            
     
        {count=count+root.key;
            return count;
        }
        count=sumOfLeftLeaves(root.left, count,false);
        count=sumOfLeftLeaves(root.right, count,true);
       return count;
    }

public boolean pathSum1(Node root, int sum) {
    int count=0;
    
    if(root==null)
    return false;
    if(root.left==null && root.right==null )
    {
        if(root.key==sum)
        return true;
        else
        return false;
    }
    int inter=0;
    
    ArrayList a=new ArrayList();
    pathSum(root,sum,a,inter);
    if(a.size()>0)
        return true;
    else
        return false;
}
public void pathSum(Node root,int sum,ArrayList a,int inter)
{
    if(root==null )
    {if(inter==sum)
    {
    a.add(inter);
    
    }
        return;
    }
    if(inter==sum)
        {
        a.add(inter);
        return ;
        }
    pathSum(root.left,sum,a,inter+root.key);
    pathSum(root.right,sum,a,inter+root.key);
    
}

public void max(Node root)
{
	ArrayList<Integer>inner=new ArrayList();
	maxR(root.left,root.key,inner);maxR(root.right,root.key,inner);
	
}
 public ArrayList maxR(Node root,int max,ArrayList<Integer> inner)
 {
	 if(root==null)
		 return inner;
	 
	inner.add(root.key);
	maxR(root.left,max,inner);
	maxR(root.right,max,inner);
		// return Math.max(a, b);
	inner.add(Integer.MAX_VALUE);
	//inner.add(max);
	// inner.add(Math.max(a,b));
	return inner;
	 
	
 }
 
 public boolean isSameTree(Node p, Node q) {
     
	 if(q==null && p==null)
		 return true;
	 if(q==null || p==null)
		 return false;
	 if(p.key==q.key)
		 return isSameTree(p.left,q.left)&& isSameTree(p.right,q.right);
	 return false;
	 
 }
 public boolean isSymmetric(Node root) {
     if(root==null)
    	 return false;
     return isSymmetric(root.left,root.right);
    	 
 }
 
 public boolean isSymmetric(Node root,Node root2)
 {
	 if(root==null && root2==null)
		 return true;
	 if(root==null || root2==null)
		 return false;
	 if(root.key==root2.key)
	 {
		 return isSymmetric(root.left,root2.right)&& isSymmetric(root.right,root2.left);
		 
		 }
	 return false;
 }
 
 /*public boolean isBalanced(Node root) {
     
	 if(root==null)
		 return true;
	 return isBalanced(root.left,root.right);
 }*/
 
 public int maxDepth(Node root) {
     if(root==null)
    	 return 0;
     
     return Math.min(1+maxDepth(root.left), 1+maxDepth(root.right));
 }
 public int maxDepth(Node root,int height)
 {
	 if(root==null)
		 return height;
	 if(root.left==null && root.right==null)
return height;
	 return Math.max(height+maxDepth(root.left,height+1), height+maxDepth(root.right,height+1));
 }
 
 static List<List<Integer>> zigzagLevelOrder(Node root) {
	 
     if(root==null)
    	 return null;
     List<List<Integer>> outer=new ArrayList();
     String l="l";
     return zigzag(root,root.right,outer,new ArrayList<Integer>(),l);
     
 }
 static List<List<Integer>> zigzag(Node root,Node next,List<List<Integer>> outer,List<Integer> inner,String position)
 {
	 if(root==null)
		 return outer;
	 inner.add(root.key);
	 if(position=="l")
	 {
		 outer.add(inner);
		 inner=new ArrayList<Integer>();
		 Node temp=next;
		 next=root.left;
		 root=temp;
		 zigzag(root,next,outer,inner,"r"); 
	 }
		 
	 else
	 {
		 Node temp=next;
		 next=root.right;
		 root=temp;
		 zigzag(root,next,outer,inner,"l");
	 }
	 return outer;
 }
 static int isBalancedTree(Node root,int count1,int count2) {
     
	 if(root==null)
		 return 0;
	 count1=count1+isBalancedTree(root.left,count1+1,count2);
	 count2=count2+isBalancedTree(root.right,count1,count2+1);
	 return Math.abs(count1-count2);
 }
 
 static boolean isBalanced(Node root)
 {
	 if(root==null)
		 return true;
	 int count=isBalancedTree(root.left, 0, 0)-isBalancedTree(root.right, 0, 0);
	 if (count>1)
	 return false;
	 return true;
 }
 public Node sortedArrayToBST(int[] nums) {
     if(nums.length==0)
    	 return null;
     int mid=(0+nums.length-1)/2;
     return sortedArrayToBST(nums,0,nums.length-1);
     
 }
 
 public Node sortedArrayToBST(int []nums,int start,int end)
 {
	 if(start>end)
		 return null;
	 int mid=(start+end)/2;
	 Node root=new Node(nums[mid]);
	 root.left=sortedArrayToBST(nums,start,mid-1);
	 root.right=sortedArrayToBST(nums,mid+1,end);
 return root;}
 
 public boolean hasPathSum(Node root, int sum) {
     if(root==null)
    	 return false;
     return hasPathSum(root,sum,0);
 }
 
 public boolean hasPathSum(Node root,int sum,int start)
 {
	 if(root==null)
		 return false;
	 if(root.key==sum && root.left==null && root.right==null)
		 return true;
	return hasPathSum(root.left,sum-root.key,start+root.key) ||hasPathSum(root.right,sum-root.key,start+root.key);
	// return false;
 }
 
 public int pathSum(Node root, int sum) {
     if(root==null)
    	 return 0;
     
     return pathSumTotal(root,sum,0);
 }
 
 public int pathSumTotal(Node root,int sum,int total)
 {
	 if(root==null)
		 return total;
	 if(root.key==sum && root.left==null && root.right==null)
		 return total+1;
	 return pathSumTotal(root.left,sum-root.key,total)+pathSumTotal(root.right,sum-root.key,total);
 }
 public List<String> binaryTreePaths(Node root) {
     
	 if(root==null)
		 return null;
	 List<String> list=new ArrayList<String>();
return	 binaryTreePaths(root,list,new String(""));
 }
 
 public List<String>binaryTreePaths(Node root,List<String> list,String s)
 {
	 if(root==null)
		 return list;
	 if(root.left==null && root.right==null)
	 {
		 s=s+"->"+root.key;
		 list.add(s);
		 s=new String("");
	 }
	 binaryTreePaths(root.left,list,s+"->"+root.key);
	 binaryTreePaths(root.right,list,s+"->"+root.key);
 return list;}
 
 
 public int sumOfLeftLeaves(Node root) {
     if(root==null)
    	 return 0;
     return sumOfLeftLeaves(root.left,0,"t")+sumOfLeftLeaves(root.right,0,"f");
 }
 
 public int sumOfLeftLeaves(Node root,int sum,String b)
 {
	 if(root==null)
		 return sum;
	 if(root.left==null && root.right==null && b=="t")
	 {
		 sum=sum+root.key;
	 }
	sum= sumOfLeftLeaves(root.left,sum,"t");
	 sum=sumOfLeftLeaves(root.right,sum,"f");
	 return sum;
 }
 
 public List<List<Integer>> levelOrderBottom(Node root) {
     
	if(root==null)
		return null;
	List<List<Integer>> finallist=new ArrayList<>();
	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	List<Integer> temp=new ArrayList<>();
	temp.add(root.key);
	
	while(!queue.isEmpty())
	{
		Node node=queue.poll();
		
		if(node.left!=null)
		{temp.add(node.key);
			queue.add(node.left);}
		if(node.right!=null)
			queue.add(node.right);
	}
	finallist.add(temp);
	return finallist;
	}
 public List<List<Integer>> levelOrderBottom2(Node root) {
     if(root==null)
    	 return null;
     List<List<Integer>>finallist=new ArrayList<>();
     levelOrderBottom2(root.left,finallist,0);
     levelOrderBottom2(root.right,finallist,0);
     return finallist;
 }
 public List<List<Integer>> levelOrderBottom2(Node root,List<List<Integer>>finallist,int count) {
     if(root==null)
     {
    	 
     }
     Queue queue=new LinkedList<>();
     queue.add(root);
     levelOrderBottom2(root.left,finallist,0);
     levelOrderBottom2(root.right,finallist,0);
     return finallist;
 }
 
 static Node lowestCommonAncestor(Node root, Node p, Node q) {
     if(root==null ||p==null ||q==null)
    	 return null;
     List<Node> list1=new ArrayList<>();
     List<Node> list2=new ArrayList<>();
     commonAncestor(root,p,list1,new Node(0));
     commonAncestor(root,q,list2,new Node(0));
     Iterator it=list1.iterator();
     Node temp=root;
     while(it.hasNext())
     {
    	 Node temp1=(Node)it.next();
    	 if(list2.contains(temp1))
    	 {
    		 temp=temp1;
    	 }
     }
     return temp;
 }
 
 static Node commonAncestor(Node root,Node node,List<Node> list,Node temp)
 {
	 if(root==null)
		 return temp;
	 if(root==node)
	 {list.add(root);
		 temp=node;
		 return temp;
	 }
	 list.add(root);
	 if(temp!=node)
	 temp=commonAncestor(root.left, node, list,temp);
	 if(temp!=node)
	 temp=commonAncestor(root.right,node,list,temp);
	 return temp;
 }
 
 static Node kth(Node root,int k)
 {
	 if(root==null)
		 return null;
	 ArrayList<Node> node=new ArrayList();
	 kth(root,k,node);
	 return node.get(k-1);
 }
 
 static void kth(Node root,int k,ArrayList<Node> node)
 {
	 if(root==null)
		 return;
	 if(node.size()==k)
		 return;
	
	 kth(root.left,k,node);
	 node.add(root);
	 kth(root.right,k,node);
 }
 
 static int findBottomLeftValue(Node root) {
     if(root==null)
    	 return Integer.MAX_VALUE;
     HashMap<Node,Integer> hm=new HashMap();
     findBottomLeftValue(root,hm,0,"t");
     Iterator it=hm.keySet().iterator();
     int max=0;
     int value=0;
     while(it.hasNext())
     {
    	 Node node=(Node)it.next();
    	 
    	 if(hm.get(node)>max)
    	 {
    		 max=hm.get(node);
    		 value=node.key;
    	 }
     }
     return value;
 }
 static void findBottomLeftValue(Node root,HashMap<Node,Integer>hashmap,int depth,String value)
 {
	 if(root==null)
		 return;
	 if((root.left==null || root.right==null) && value.equals("t"))
		 hashmap.put(root,depth );
	 findBottomLeftValue(root.left,hashmap,depth+1,"t");
	 findBottomLeftValue(root.right,hashmap,depth+1,"f");
 }
 
 static List<Integer> largestValues(Node root) {
     if(root==null)
    	 return null;
     List<Integer> finallist=new ArrayList();
     List<List<Integer>> list=new ArrayList();
     Queue<Node> queue=new LinkedList<>();
     queue.add(root);
 	 List<Integer> temp = new ArrayList();
     while(!queue.isEmpty())
     {
    
    	 Node node=(Node)queue.poll();
    	 temp.add(node.key);
    	 if(node.left!=null)
    	 { queue.add(node.left);
    	 
    	 }
    	 
    	 if(node.right!=null)
    	 {
    		 queue.add(node.right);
    	 }
    	 
     }
     list.add(temp);
     Iterator it=list.iterator();
     while(it.hasNext())
     {
    	 List<Integer>temp1=(List<Integer>) it.next();
    	Collections.sort(temp1);
    	 finallist.add(temp1.get(temp1.size()-1));
    	 
     }
     return finallist;
 }
 
 static Node construct(int [] arrays)
 {
	 if(arrays.length==0)
		 return null;
	 Node root=new Node(arrays[0]);
	 for(int i=1;i<arrays.length;i++)
	 { construct(arrays,i,root);
	 }
	 return root;
 }
 
 static Node construct(int []arrays,int position,Node root)
 {
	 
	 if(root==null)
	 {
		 root=new Node(arrays[position]);
		 return root;
	 }
	 if(arrays[position]>root.key)
	 {
		 root.right=construct(arrays,position,root.right);
	 }
	 else
		 root.left=construct(arrays,position,root.left);
	return root;
	 
 }
 static List<List<Integer>> permute(int[] nums) {
	   List<List<Integer>> list = new ArrayList<>();
	   // Arrays.sort(nums); // not necessary
	   backtrack(list, new ArrayList<>(), nums);
	   return list;
	}

	static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums){
	   if(tempList.size() == nums.length){
	      list.add(new ArrayList<>(tempList));
	   } else{
	      for(int i = 0; i < nums.length; i++){ 
	         if(tempList.contains(nums[i])) continue; // element already exists, skip
	         tempList.add(nums[i]);
	         backtrack(list, tempList, nums);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	} 
	
	
		 
		
		
		 static int f(int n){
		 System.out.println( "f(" + n + ")" );
		 if(n<=1)
		 return 2;
		 else
		 return f(n-1) + 5;
		 }
		
    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        //tree.root.right.left = new Node(5);
        //tree.root.right.right = new Node(4);
        //tree.root.right.left.left = new Node(15);
        //tree.root.right.left.left.left = new Node(14);
        //tree.max(tree.root);
        
        Node tree2 = new Node(5);
        tree2.left = new Node(2);
        tree2.right = new Node(6);
       // tree2.left.left = new Node(1);
        //tree2.left.left.left=new Node(10);
        tree2.left.right = new Node(4);
        tree2.right.right = new Node(8);
        //tree2.right.left.left=new Node(7);
        
        int num[]={1,2,3,4,5,6,7};
        //System.out.println(tree.sumOfLeftLeaves(tree.root));
        //Node n=tree.sortedArrayToBST(num);
       //List<String>m=tree.binaryTreePaths(tree2);
        //System.out.println(tree.findMode(tree2));
        //List<List<Integer>> list=tree.levelOrderBottom(tree2);
        //Node node=tree.invertTree(tree2);
        //System.out.println(tree.sumOfLeftLeaves(tree2));
       // System.out.println(tree.pathSum(tree2, 10));
        //System.out.println(tree.maxDepth(tree.root));
        //System.out.println(tree.isSymmetric(tree.root));
        //System.out.println(tree.isSameTree(tree.root, tree2));
 /*
        System.out.println("Preorder traversal of binary tree is ");
        tree.call(tree.root);
 
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
        
        //tree.findMode(tree.root);
        //tree.findMode(tree.root);
        
        System.out.println(tree.pathSum(tree.root, 3));
        double a,b;
        a=3.5;
        b=2.0;*/
        //Node node=lowestCommonAncestor(tree2,tree2.left , tree2);
        //System.out.println(isBalanced(tree2));
        //List<List<Integer>> in=zigzagLevelOrder(tree.root);
        //Node node=kth(tree2,6);
       //System.out.println(findBottomLeftValue(tree2));
        //List<Integer> list=largestValues(tree2);
        int a[]={5,2,6,1,4,8};
        int nums[]={1,2,3};
        System.out.println(f(7));
        // for unique binary trees
    /*    List<List<Integer>>list=permute(nums);
       Iterator it=list.iterator();
       List<Node>treenodes=new ArrayList();
       while(it.hasNext())
       {
    	   Node node=constructTree(it.next());
    	   treenodes.add(node);
       }*/
       //
        int A[]={1,2};
        int B[]={3,4};
        int C[]=new int[A.length+B.length];
        
    }
}