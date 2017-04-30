package Stacks;

import java.util.Stack;

public class BalancedParanthesis {
	Stack<Character> myStack=new Stack();
	String s;
	public boolean check(String s)
	{
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
	if(ch=='('||ch=='['||ch=='{')
	{
		myStack.push(ch);
	}
	else
	{
		switch(ch)
		{
		case '}':
		{
			if(myStack.peek()=='}')
			{
				myStack.pop();
			}
		}
		case ')':
		{
			if(myStack.peek()=='(')
			{
				myStack.pop();
			}
		}
		case ']':
		{
			if(myStack.peek()=='[')
			{
				myStack.pop();
			}
		}
		}
	}
	}
	if(myStack.isEmpty())
	{
		return true;
	}
	return false;
	}
public static void main(String args[])
{
	BalancedParanthesis bp=new BalancedParanthesis();
boolean value=bp.check("[()]{}{[()()]()}");
if(value==true)
{
	System.out.println("paranthesis is palindrome");
}
else
	System.out.println("paranthesis is not palindrome");
}
}
