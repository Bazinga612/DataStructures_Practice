import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Trie {
	
	class TrieNode {
	    char c;
	    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
	    boolean isLeaf;
	 
	    public TrieNode() {}
	 
	    public TrieNode(char c){
	        this.c = c;
	    }
	}
	    private TrieNode root;
	 
	    public Trie() {
	        root = new TrieNode();
	    }
	 
	    // Inserts a word into the trie.
	    public void insert(String word) {
	        HashMap<Character, TrieNode> children = root.children;
	 
	        for(int i=0; i<word.length(); i++){
	            char c = word.charAt(i);
	 
	            TrieNode t;
	            if(children.containsKey(c)){
	                    t = children.get(c);
	            }else{
	                t = new TrieNode(c);
	                children.put(c, t);
	            }
	 
	            children = t.children;
	 
	            //set leaf node
	            if(i==word.length()-1)
	                t.isLeaf = true;    
	        }
	    }
	 
	    // Returns if the word is in the trie.
	    public boolean search(String word) {
	        TrieNode t = searchNode(word);
	 
	        if(t != null && t.isLeaf) 
	            return true;
	        else
	            return false;
	    }
	 
	    // Returns if there is any word in the trie
	    // that starts with the given prefix.
	    public boolean startsWith(String prefix) {
	        if(searchNode(prefix) == null) 
	            return false;
	        else
	            return true;
	    }
	 
	    public TrieNode searchNode(String str){
	        Map<Character, TrieNode> children = root.children; 
	        TrieNode t = null;
	        for(int i=0; i<str.length(); i++){
	            char c = str.charAt(i);
	            if(children.containsKey(c)){
	                t = children.get(c);
	                children = t.children;
	            }else{
	                return null;
	            }
	        }
	 
	        return t;
	    }
	    
	    
	    
	    public List<String> safeList(String [] input)
	    {
	        //for splitting on ,
	        String guest[]=new String[input.length];
	        String inviter[]=new String[input.length];
	        String candybrought[]=new String[input.length];
	        String candyconsumed[]=new String[input.length];
	        int leftOver[]=new int[input.length];
	        
	        ArrayList guestList=new ArrayList();
	        
	        for(int i=0;i<input.length;i++)
	        {
	            String temp[]=new String[4];
	            temp=input[i].split(",");
	            guest[i]=temp[0];
	            inviter[i]=temp[1];
	            guestList.add(guest[i]);
	            candybrought[i]=temp[2];
	            candyconsumed[i]=temp[3];
	            leftOver[i]=Integer.parseInt(candybrought[i])-Integer.parseInt(candyconsumed[i]);
	            
	        }
	        
	        
	        //For mapping between  guest and inviter with inviter as the key and arraylist of guests
	        ArrayList<Integer>inner=new ArrayList();
	        HashMap<String,ArrayList<Integer>> hashmap=new HashMap();
	        for(int i=0;i<inner.size();i++)
	        {
	            for(int j=0;j<inner.size();j++)
	            {
	                
	                    if(inviter[i]==inviter[j])
	            
	            {
	                inner.add(j);
	            }
	            if(!hashmap.containsKey(inviter[i]))
	            hashmap.put(inviter[i],inner);
	            inner=new ArrayList();
	            }
	        }
	     
	     Iterator it=hashmap.keySet().iterator();
	     List<String>uninvited=new ArrayList();
	     //for maintaining hashmap of visited and unvisited guests
	     HashMap hm=new HashMap();
	     for(int i=0;i<inviter.length;i++)
	     {
	         if(!hm.containsKey(inviter[i]))
	         hm.put(inviter[i],"f");
	         if(!hm.containsKey(guest[i]))
	         hm.put(guest[i],"f");
	     }
	     
	     //Iterating over hashmap to find the list of not to be invited guests
	     while(it.hasNext())
	     {
	         String temp=(String)it.next();
	         Stack s=new Stack();
	         s.push(temp);
	         hm.put(temp,"t");
	         while(!s.isEmpty())
	         {
	             String temp1=(String)s.pop();
	             ArrayList al=new ArrayList();
	             for(int i=0;i<al.size();i++)
	             {
	                 if(hm.get(al.get(i))!="t")
	                 {s.push(al.get(i));
	                     if(leftOver[guestList.indexOf(al.get(i))]<0)
	                     uninvited.add((String)al.get(i));
	                 }
	                 
	             }
	         }
	     }
	        return uninvited;
	    }
	    public int find_OddManOut(int [] input)
	    {
	        HashMap<Integer,Integer> hashmap=new HashMap();
	        for(int i=0;i<input.length;i++)
	        {
	            if(!hashmap.containsKey(input[i]))
	            hashmap.put(input[i],1);
	            else
	            hashmap.put(input[i],(int)hashmap.get(input[i])+1);
	        }
	        Iterator it=hashmap.keySet().iterator();
	        int output=0;
	        while(it.hasNext())
	        {
	            int temp=(int)it.next();
	            if((hashmap.get(temp))%2!=0)
	            {output=temp;
	        break;}}
	        return output;
	    }
	  //here i am taking an input array of length 11 ,indices decide the number and the element at the position indicate the weight
	  //the program would take (log 11) comparisons
	  public int find_heavyCoin(int [] input)
	  {
	      int group1=input[0]+input[1]+input[2]+input[3];
	      int group2=input[4]+input[5]+input[6]+input[7];
	      if(group1>group2)
	      {
	          int group3=input[0]+input[1];
	          int group4=input[2]+input[3];
	          if(group3>group4)
	          {
	              if(input[0]>input[1])
	              return 0;
	              else
	              return 1;
	          }
	          else
	          {
	              if(input[2]>input[3])
	              return 2;
	              else
	              return 3;
	          }
	      }
	      else if(group1<group2)
	      {
	          int group3=input[4]+input[5];
	          int group4=input[6]+input[7];
	          if(group3>group4)
	          {
	              if(input[4]>input[5])
	              return 4;
	              else
	              return 5;
	          }
	          else
	          {
	              if(input[6]>input[7])
	              return 6;
	              else
	              return 7;
	          }
	      }
	      else
	      {
	          if(input[8]==input[9])
	          return 10;
	          else 
	          if(input[8]>input[9])
	          return 8;
	          else
	          return 9;
	      }
	  }
	    public static void main(String rgs[])
	    {
	    	int nums[]={2,2,2,8,2};
	    	//System.out.println(find_OddManOut(nums));
	    }
	}

