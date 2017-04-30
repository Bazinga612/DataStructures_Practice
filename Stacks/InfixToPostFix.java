package Stacks;

import java.util.Stack;

public class InfixToPostFix {

	public Stack myStack;
	String finalstring=null;
	InfixToPostFix(String n)
	{
		int nsize=n.length();
		myStack=new Stack();
	}
	public String check(String input)
	{
		
		
		finalstring="";
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if((ch!='+')&&ch!='-'&&ch!='*'&&ch!='/')
			{
				if(myStack.isEmpty())
				{
				finalstring=finalstring+String.valueOf(ch);
				}
				else
				{
					while(myStack.isEmpty())
							{
					String popped=(String)myStack.pop();
					finalstring=finalstring+popped;
					}
				}
			}
			else
			{
				
			switch(ch)
			{
			case '+':
			{
				if(myStack.peek().equals('*')||myStack.peek().equals('/'))
				{
					String popped=String.valueOf(myStack.pop());
					myStack.push(ch);
					finalstring=popped+finalstring;
					
				}
					
				break;
			}
			case '-':
			{
				if(myStack.peek().equals('*')||myStack.peek().equals('/'))
				{
					String popped=(String)myStack.pop();
					myStack.push(ch);
					finalstring=popped+finalstring;
					
				}
					
				break;
			}
			case '*':
			{
				myStack.push(ch);
				break;
			}
			case '/':
			{
				myStack.push(ch);
				break;
			}
			
		
			}
			}
		}
		return finalstring;
	}
	
	public static void main(String args[])
	{
		InfixToPostFix i=new InfixToPostFix("a+b*c/d");
		String result=i.check("a*(b+c)/d");
		System.out.println(result);
		
	}
		
	
}
