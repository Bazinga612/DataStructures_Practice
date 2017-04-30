import java.util.*;
public class LeetHard {


	    public boolean canCross(int[] stones) {
	        int diff[]=new int[stones.length];
	        for(int i=0;i<stones.length-1;i++)
	        {
	            diff[i]=stones[i+1]-stones[i];
	        }
	        for(int i=0;i<diff.length;i++)
	        {
	            if(diff[i]>diff[i+1])
	            {
	                if((diff[i]-diff[i+1])!=1)
	                {
	                    return false;
	                }
	            }
	            if(diff[i]<diff[i+1])
	            {
	                if((diff[i+1]-diff[i])!=1)
	                {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }
	
	public static void main(String arg[])
	{
		LeetHard lh=new LeetHard();
		int a[]={0,1,3,4,5,7,9,10,12};
		lh.canCross(a);
		/*//String s="cbacdcbc";
		String answer="";
		
		HashMap list=new HashMap();
		Stack st=new Stack();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			
			if(!list.containsKey(ch[i]))
			{
				list.put(ch[i],1);
				
			}
			else
				list.put(ch[i],(int)list.get(ch[i])+1);
			
			if(!st.isEmpty())
			{
				char ans=(char)st.peek();
				if(((int)ans>(int)ch[i])&& !st.contains(ch[i]))
				{
					st.pop();
					
					st.push(ch[i]);
					
				}
			}
				 if(!st.contains(ch[i]))
				{
					st.push(ch[i]);
				}
			}
			
			
			
		
		
		for(int i=0;i<st.size();i++)
		{
			answer=(String)(answer+(Character)st.pop());
		}
		System.out.println(answer);*/
	}
}
