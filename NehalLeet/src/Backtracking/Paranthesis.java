package Backtracking;

import java.util.ArrayList;

public class Paranthesis {

	public void para(int n)
	{
		int a[]={0,1,2};
		int b[]={0,1,2};
		String s="";	
		int count1=0;
		int count2=0;
		ArrayList<String> as=new ArrayList<String>();
		for(int i=0;i<b.length;i++)
		{
			count1=a[i];
			
			for(int j=0;j<b.length;j++)
			{
				count2=b[j];
				if(a[i]>=b[j])
				{
					while(count1>=0)
					{
						s=s+"(";
						count1--;
					}
					
					while(count2>=0)
					{
						s=s+")";
						count2--;
					}
					
				}
				
				
			}
			as.add(s);
		}
		for(int i=0;i<as.size();i++)
		{
			System.out.println(as.get(i));
		}
	}
	
private ArrayList<String> res;
    
	public ArrayList<String> generateParenthesis(int A) {
	    res = new ArrayList<>();
	    StringBuilder str = new StringBuilder();
	    rec(0, 0, 0, str, A);
	    return res;
	}
	
	public void rec(int leftCount, int rightCount, int index, StringBuilder str, int n) {
	    
	    if (leftCount > n || rightCount > n)
	        return;
	        
	    if (rightCount > leftCount)
	        return;
	    
	    if (index == 2 * n) {
	        res.add(str.toString());
	        return;
	    }
	    
	    str.append('(');
	    rec(leftCount + 1, rightCount, index + 1, str, n);
	    str.deleteCharAt(str.length() - 1);
	    
	    str.append(')');
	    rec(leftCount, rightCount + 1, index + 1, str, n);
	    str.deleteCharAt(str.length() - 1);
	    
	}
	public static void main(String args[])
	{
		Paranthesis p=new Paranthesis();
		//p.para(3);
		p.generateParenthesis(3);
		
	}
}
