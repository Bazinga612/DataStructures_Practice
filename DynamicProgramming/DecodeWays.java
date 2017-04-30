package DynamicProgramming;

public class DecodeWays {

	public int numberOfWays(String s)
	{
		int dp[];
		if(s.length()==0 && s!=null && s.charAt(0)!='0')
			return 0;
		else
		{
			dp=new int[s.length()];
			dp[0]=1;
			for(int i=1;i<s.length();i++)
			{
				
				dp[i]=dp[i-1]+1;
			}
			for(int i=0;i<s.length()-1;i++)
			{
				System.out.println(s.substring(i, i+2));
				if(Integer.parseInt(s.substring(i, i+2))>10 && Integer.parseInt(s.substring(i, i+2))<26)
				{}
				else
					{dp[i+1]=dp[i+1]-1;	}		}
		}
		return dp[s.length()-1];
	}
	
	
	    public int integerBreak(int n) {
	        int max=1;
	        int temp2=1;
	        if(n==1)
	        return 1;
	        else if(n==0)
	        return 0;
	        else
	        {
	            int sum=0;
	            int temp=1;
	            for(int i=2;i<=n;i++)
	            {
	            	sum=0;
	            	if(temp2<max)
	            		temp2=max;
	            	max=1;
	            while(sum<n)
	            {
	                if((float)n/i>(n/i))
	                { 
	                	temp=n/i;
	                	if((n-sum)>temp)
	                temp=temp;
	                	else if((n-sum)==temp)
	                		temp=temp;
	                	else if((n-sum)<temp)
	                		temp=temp-1;}
	                else
	                	temp=i;
	                max=max*temp;
	                sum=sum+temp;
	            }
	            }
	        }
	        return temp2;
	       
	    }
	
	public static void main(String args[])
	{
		DecodeWays dw=new DecodeWays();
		String s="127";
		//System.out.println(dw.numberOfWays(s));
		System.out.println(dw.integerBreak(10));
		
	}
}
