package Stacks;

import java.util.Stack;

public class BasicCalci {

	public int calculate(String s)
	{
		Stack<Character> op=new Stack();
		char temp;
		char ch[]=s.toCharArray();
		char tempop;
		boolean flag=false;
		int result=0;
		for(int i=0;i<ch.length;i++)
		{
			if((int)ch[i]>=48 && (int)ch[i]<=57 || ch[i]=='(')
			{if(flag==false)
				op.push(ch[i]);
			else
			{
				tempop=op.pop();
				temp=(char)op.pop();
				char r=compute(temp,tempop,ch[i]);
				op.push(r);
			}
			}
			if(ch[i]==')')
			{
				if(i!=ch.length-1)
				{
				temp=op.pop();
				tempop=op.pop();
				op.push(compute(temp,tempop,op.pop()));
				}
				else
				{
					result=op.pop();
				}
			}
			if(ch[i]==' ')
			{
				
			}
			if(ch[i]=='+' || ch[i]=='-')
			{
				op.push(ch[i]);
				flag=true;
			}
			if(i==ch.length-1)
			{
				result=Character.getNumericValue(op.pop());
			}
		}
		return result;
	}
	public char compute(char c,char r,char d)
	{
		int result;
		char rt;
		if(r=='+')
			result=Character.getNumericValue(c)+Character.getNumericValue(d);
		else
			result=Character.getNumericValue(c)-Character.getNumericValue(d);
		rt=Character.forDigit(result, 10);
		return rt;
	}
	 public String removeKdigits(String num, int k) {
	        String result="";
	        if(num==null) 
	        return null;
	        else if(k==0)
	        return num;
	        else if (k==num.length())
	        return null;
	        if(Integer.parseInt(num.substring(0,1))>Integer.parseInt(num.substring(k,k+1)))
	        {
	        
	        	result=num.substring(k,num.length());
	            result=checkForLeadingZero(result);
	        }
	        else if(Integer.parseInt(num.substring(0,1))==Integer.parseInt(num.valueOf(k)))
	        {if(Integer.parseInt(num.substring(0,1))<Integer.parseInt(num.valueOf(k+1)))
	        		{System.out.println(Integer.parseInt(num.valueOf(k+1)));
	        	result=num.substring(0,1)+num.substring(k,k+1);
	        		}
	        else
	        		result=num.substring(0,1)+num.substring(k+1,num.length());
	            result=checkForLeadingZero(result);
	        }
	        else 
	        {
	        	
	        		result=num.substring(0,1)+num.substring(k+1,num.length());
	            result=checkForLeadingZero(result);
	        }
	        return result;
	    }
	    public String checkForLeadingZero(String result)
	    {
	        if(result.substring(0,1).equals("0"))
	        result=result.substring(1,result.length());
	        return result;
	    }
	public static void main(String args[])
	{
	BasicCalci b=new BasicCalci();
	//System.out.println(b.calculate("(1+(4+5+2)-3)+(6+8)"));
	System.out.println(b.removeKdigits("1112",1));
	}
}
