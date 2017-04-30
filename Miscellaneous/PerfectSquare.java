import java.util.ArrayList;
import java.util.Arrays;

public class PerfectSquare {

	public boolean perfectSquare(long n)
	{
		//boolean result=recur(n,n/2);
		
		/*if(result==false)
			System.out.println("Not a sqrt");
		else
			System.out.println("Sqrt");*/
		
		
		for(long i=n/2;i>1;i--)
		{
			
			if(i*i==n)
			{
				return true;
				
			}
		}
		return false;
		
	}
	public boolean isPerfectSquare(long n) {
		 long low = 0;
	      long high = n - 1;
	      while (low <= high) {
	         long mid = (low + high)/2;
	         if (mid*mid == n) return true;
	         else if (mid*mid < n) low = mid + 1;
	         else high = mid - 1;
	      }
	      return false;
}
	public boolean recur(int n,int m)
	{
		if(n==1)
		{
			return true;
		}
		if(m==1 ||m==0)
		{
			return false;
		}
		else
			if(m*m==n)
			{
				m=0;
				return true;}
			else
			{
			boolean result=recur(n,m-1);
			if(result==true)
			return true;
			else
				return false;}
			
		
			
	}
	
	public long sequence(long n)
	{
		ArrayList seq=new ArrayList();
		long i=1;
		while(seq.size()!=n)
		{
			PerfectSquare ps=new PerfectSquare();
			boolean result=ps.uglyNumber(i);
			if(result==true)
				seq.add(i);
			i=i+1;
			
		}
		return (long) seq.get(seq.size()-1);
	}
	public boolean uglyNumber(long n)
	{
		if(n==0)
			return false;
		
		while(n%2==0)
		{
			n=n/2;
			
		}
		while(n%3==0)
		{
			n=n/3;
			
		}
		while(n%5==0)
		{
			n=n/5;
			
		}
		if(n==1)
			return true;
		else return false;
	}
	public static void main(String args[])
	{
		PerfectSquare ps=new PerfectSquare();
		//System.out.println(ps.perfectSquare(2147483647));
		//System.out.println(ps.sequence(1));
	String s=Integer.toString(9, 3);
	System.out.println(s);
	
	System.out.println(s.length());
	String c[]=new String[s.length()];
	Arrays.fill(c,0);
	if(s^c)
	/*char ch[]=s.toCharArray();1073741824
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		System.out.println(ch[i]);
		if(ch[i]=='1')
		{
			count++;
		}
	}*/
		
	}
}
