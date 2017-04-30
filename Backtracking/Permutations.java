package Backtracking;

public class Permutations {
	String actual="";
	
	
	public void permute(String a[])
	{
		
		
		back(a,0,0);
		
	}
	
	public void swap(String a,String b)
	{
		String temp;
		temp=a;
		a=b;
		b=temp;	
	}
	public void back(String a[],int start,int end)
	{
		if(start==end)
		{
			return;
		}
		else
		{
		swap(a[start],a[end]);
		
			back(a,start+1,end);
		}
		
	}
	/*public void backtrack(String a[],int start,int end)
	{
		
		System.out.println(actual);
		String temp="";
		for(int i=start;i<end;i++)
		{
			temp=a[start];
			a[start]=a[start+1];
			a[start+1]=temp;
			print(a);
			backtrack(a,start+1,end);
		}
		backtrack(a,0,a.length-1);
	}*/
	public void print(String a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		
	}
	public static void main(String args[])
	{
		String a[]={"A","b","c"};
		Permutations p=new Permutations();
		p.permute(a);
	}
}
