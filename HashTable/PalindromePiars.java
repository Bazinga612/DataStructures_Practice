package HashTable;
import java.util.*;
import javax.print.attribute.HashAttributeSet;

public class PalindromePiars {

	HashMap<String,String> hm=new HashMap();
	ArrayList al=new ArrayList();
	public void generate(String ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			StringBuilder sb=new StringBuilder(ar[i]);
			
			hm.put(ar[i], sb.reverse().toString());
		}
		
	}
	
	public ArrayList palindromePairs(String ar[])
	{
		generate(ar);
		for(int i=0;i<ar.length;i++)
		{
			Iterator j=hm.entrySet().iterator();
			if(j.hasNext())
			{
				if(j.next()==ar[i])
				{
					al.add(i,j);
				}
			}
		}
		return al;
		
	}
public boolean find132pattern(int[] a) {
        

    for(int k=0;k<a.length-2;k++)
    {
        
        for(int i=k+1;i<a.length-1;i++)
        {String pattern="1";
            if(a[k]<a[i])
            	{pattern=pattern+"3";
            for(int j=i+1;j<a.length;j++)
            {
            	if(a[i]>a[j] && a[j]>a[k])
            		{pattern=pattern+"2";
            	return true;}}
            }
            }
    }
        return false;
    }
	    public String getHint(String secret, String guess) {
	        HashMap secrethash=new HashMap();
	        HashMap guesshash=new HashMap();
	        String finalresult="";
	        String temp="";
	        String temp1="";
	        int count_bulls=0;
	        int count_cows=0;
	        for(int i=0;i<secret.length();i++)
	        {
	            secrethash.put(i,secret.substring(i,i+1));
	        }
	        for(int j=0;j<guess.length();j++)
	        {
	            guesshash.put(j,guess.substring(j,j+1));
	        }
	        for(int j=0;j<guess.length();j++)
	        {
	            if(guesshash.get(j).equals(secrethash.get(j)))
	            {
	                count_bulls++;
	            }
	            else
	            {
	                if(secrethash.containsValue(guesshash.get(j)))
	                	
	                {	
	                	
	                	if(!temp.equals((String) guesshash.get(j)))
	                	{temp=(String) guesshash.get(j);
	                count_cows++;}
	                }
	            }
	        }
	        finalresult=count_bulls+"A"+count_cows+"B";
	        return finalresult;
	    }
	    public String removeDuplicateLetters(String st) {
	        
	        Stack s=new Stack();
	        char ch[]=st.toCharArray();
	        String result="";
	        char ch1 = 0;
	        int temp=0;
	        StringBuilder st1=new StringBuilder();
	        for(int i=0;i<ch.length;i++)
	        {
	            
	            if(s.isEmpty())
	            {
	                s.push(ch[i]);
	                ch1=(char)s.peek();
	            }
	            else 
	            if((int)ch[i]<(int)ch1 )
	            {temp=(int)ch[i];
	                s.pop();
	                s.push(ch[i]);
	            }
	            if(s.contains(ch[i]))
	            {
	                
	            }
	            else
	            	s.push(ch[i]);
	            }
	            
	            
	        
while(!s.isEmpty())
	        {
	            result=result+s.peek();
	            s.pop();
	        }
	        st1.append(result.toString());
	        return st1.reverse().toString();
	       }
	    
	    
	   /* public List<Integer> findAnagrams(String s, String p) {
	        
	    	List<Integer> al=new ArrayList();
	    	Stack st=new Stack();
	    	for(int i=0;i<p.length();i++)
	    	{
	    		
	    	}
	    }*/
	    public int evalRPN(String[] tokens) {
	       
	        Stack operands=new Stack();
	        int result = 0;
	        for(int i=0;i<tokens.length;i++)
	        {
	        	if(tokens[i]=="/"||tokens[i]=="+"||tokens[i]=="-"||tokens[i]=="*")
	        	{
	        		int first=Integer.parseInt((String)operands.pop());
	        		int second=Integer.parseInt((String)operands.pop());
	        		if(tokens[i]=="/" && second!=0)
	        				{
	        					result=second/first;	
	        					
	        					operands.push(String.valueOf(result));
	        				}
	        		if(tokens[i]=="+")
    				{
    					result=first+second;
    					operands.push(String.valueOf(result));
    				}
	        		if(tokens[i]=="-")
    				{
    					result=second-first;	
    					operands.push(String.valueOf(result));
    				}
	        		if(tokens[i]=="*")
    				{
    					result=first*second;	
    					operands.push(String.valueOf(result));
    				}
	        		try
	        		{
	        		if(tokens[i]=="/" && second==0)
	    			{
	        			
	    			    
	    			    
	    			}}
	        		catch(NumberFormatException e)
	        		{
	        			e.printStackTrace();
	        			return -1;
	        		}
	        	}
	        	else
	        	{
	        		operands.push(tokens[i]);
	        	}
	        }
	        result=Integer.parseInt((String)operands.peek());
	        return result;
	    }
	    public void generateAnagram(String c,String b)
	    {
	    	HashMap hm1=new HashMap();
	    	ArrayList list=new ArrayList();
	    	for(int i=0;i<c.length();i++)
	    	{
	    		System.out.println(c.substring(i,i+1));
				if(hm1.containsKey(c.substring(i,i+1)))
				{
				hm1.put(c.substring(i,i+1), (int)hm1.get(c.substring(i,i+1))+1);}
				else
				hm1.put(c.substring(i,i+1), 1);
				
			}
for(int i=0;i<b.length();i++)
list=check(c,b,list,hm1,i);
for(int i=0;i<list.size();i++)
System.out.println(list.get(i));	    	
	    }
	    public ArrayList check(String c,String b,ArrayList list,HashMap hm1,int start )
	    {
	    	if(start>b.length()-c.length())
	    		return list;
	    	else
	    	{
			HashMap hm2=new HashMap();
			
			
	    	for(int i=start;i<start+c.length();i++)
			{
				if(hm2.containsKey(b.substring(i,i+1)))
				{
				hm2.put(b.substring(i,i+1), (int)hm2.get(b.substring(i,i+1))+1);}
				else
				hm2.put(b.substring(i,i+1), 1);
			}
			if(hm1.equals(hm2))
			{
				list.add(start);
			}
		
			return list;
			}
	    }
	    
	public static void main(String args[])
	{
		PalindromePiars pp=new PalindromePiars();
		
		String ar[]={"abcd", "dcba", "lls", "s", "sssll"};
		//pp.palindromePairs(ar);
		//System.out.println(pp.getHint("1234","0111"));
		int a[]={3,1,4,2};
		//System.out.println(pp.removeDuplicateLetters("bcabc"));
		//System.out.println(pp.find132pattern(a));
		//String tokens[]={"0","3","/"};
		//System.out.println(pp.evalRPN(tokens));
		String c="aab";
		String b="ababababab";
		pp.generateAnagram(c, b);
		
		
	}
}

