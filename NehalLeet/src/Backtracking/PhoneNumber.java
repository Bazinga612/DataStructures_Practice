package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {

	HashMap<Integer,ArrayList<String>> hm=new HashMap<Integer,ArrayList<String>>();
	public PhoneNumber() {
		ArrayList<String> a11=new ArrayList<String>();
		ArrayList<String> a22=new ArrayList<String>();
		a11.add("a");
		a11.add("b");
		a11.add("c");
		a22.add("d");
		a22.add("e");
		a22.add("f");
		
		hm.put(2,a11);
		
		hm.put(3,a22);
		
	}
		
	public ArrayList<String> calculate(int a,int b)
	{
		ArrayList<String>a1=hm.get(a);
		ArrayList<String>b1=hm.get(b);
		ArrayList c=new ArrayList<>();
		ArrayList<String>d1=generate(a1,b1,c,0,0,a1.size(),b1.size());
		for(int i=0;i<d1.size();i++)
		{
		System.out.println(d1.get(i));
		}
		return d1;
		
	}
	
	/*public ArrayList generate(ArrayList a1,ArrayList b1,ArrayList c1)
	{
		ArrayList c = c1;
		if((a1.size()==0))
			return c;
		else
		{
			
				for(int j=0;j<b1.size();j++)
				{
					c.add((a1.get(0))+""+b1.get(j));
				}
				a1.remove(0);
				generate(a1,b1,c);
			return c1;
		}*/
	
	public ArrayList generate(ArrayList a1,ArrayList b1,ArrayList c1,int n1,int n2,int l1,int l2)
	{
		ArrayList c = c1;
		int len1=l1;
		int len2=l2;
		
		if(n2==l2)
			{n2=0;
			n1=n1+1;
			}
		if(n1==l1)
			return c1;
		
		c1.add(a1.get(n1)+""+b1.get(n2));
		
			
		n2=n2+1;
		generate(a1,b1,c1,n1,n2,len1,len2);
		return c1;
		}
		
	
public static void main(String args[])
{
	PhoneNumber pn=new PhoneNumber();
	pn.calculate(2, 3);
}
}
