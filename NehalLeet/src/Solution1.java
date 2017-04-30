import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	 public String lengthOfLongestSubstring(String s) {
	    	Map str=new HashMap();
	    	char ar[]=s.toCharArray();
	    	String finalarr=null;
	    	for(int i=0;i<ar.length;i++)
	    	{
	    		while(i!=ar.length)
	    		{
	    		if(ar[i]!=ar[i+1])
	    		{
	    			finalarr=finalarr+ar[i];
	    			i++;
	    		}
	    		
	    		}
	    		
	    	}
	    	return finalarr;
	    
	 }
	 public int numSquares(int n) {
		 
		 int sq=n/2;
		 int count=0;
		 int max=0;
		 while(sq!=0)
		 {
			 if((sq*sq)<=n)
			 {
				 if(n==(sq*sq))
						 return count+1;
				 if((n)%(sq*sq)==0)
				 {
					 
					 while(n>0)
					 {
					 count=count+n/(sq*sq);
					 n=(sq*sq);
					 break;
					 }
				 }
				 else
				 {
				 n=n-(sq*sq);
				 count++;}
			 }
			 sq--;
		 }
		 return count;
	 }
	 
	    
	    public static void main(String args[])
	    {
	    	
	    	Solution1 s=new Solution1();
	    	
	    	//String answer=s.lengthOfLongestSubstring("aaabccddd");
	    	System.out.println(s.numSquares(4));
	    	
	    	
	    }
	}


