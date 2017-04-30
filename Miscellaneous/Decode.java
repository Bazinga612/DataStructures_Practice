import java.util.*;
public class Decode {

	Stack op=new Stack();
	Stack alp=new Stack();
	String result="";
	public void Decode(String s)
	{
		
		for(int i=0;i<s.length();i++)
		{
			String at=s.substring(i, i+1);
			String pattern1="(\\d)";
			if(at.equals("1")||at.equals("2")||at.equals("3")||at.equals("4")||at.equals("5")||at.equals("6")||at.equals("7")||at.equals("8")||at.equals("9"))
			{
				op.push(at);
				if(!alp.isEmpty())
					alp.add('/');
			}
			else if(at.equals("["))
				{
					op.push(at);
					if(!alp.isEmpty())
						alp.add('/');
				}
				else if(at.equals("]"))
				{
					op.pop();
					String temp="";
					while(alp.size()!=0 && alp.peek()!=(Object)'/' )
					{
						temp=temp+alp.pop();
					}
					String value=(String)op.pop();
					generator(Integer.parseInt(value),temp);
					
				}
				else
				{
					alp.add(at);
				}
		}
		if(!alp.isEmpty())
		{
			while(!alp.isEmpty())
				{
				result=result+alp.pop();
				}
		System.out.println(result);
		}
	}
		public String generator(Integer a,String b)
		{
			while(a!=0)
			{
				result=result+b;
				a--;
			}
			return result;
		}
	
	public static void main(String args[])
	{
		Decode d=new Decode();
		d.Decode("2[abc]3[cd]ef");
	}
	
}
