import java.util.ArrayList;

public class Permutations {

	public String generate(String[] s,int k)
	{
		ArrayList result=new ArrayList();
		String res=recur(result,0,s,k);
		return res;
	}
	
	public String recur(ArrayList result,int start,String[] s,int k)
	{
		if(start>=s.length)
		{
			if(k==0)
				return generateString(s);
			if(!result.contains(generateString(s)))
			result.add(generateString(s));
			k--;
			
		}
		for(int i=start;i<s.length;i++)
		{
			
			
			swap(s,start,i);

			recur(result,start+1,s,k);
			swap(s,start,i);
		}
		    //recur(result);
		
		return generateString(s);
	}
	public String generateString(String s[])
	{
		String temp="";
		for(int i=0;i<s.length;i++)
		{
			temp=temp+s[i];
		}
		return temp;
	}
	public void swap(String a[],int i,int j)
	{
		String temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	public static void main(String args[])
	{
		Permutations p=new Permutations();
		String s[]={"1","2","3"};
		String st=p.generate(s,2);
	}
}
