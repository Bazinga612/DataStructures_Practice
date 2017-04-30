package Stacks;

import java.util.Stack;

public class ReverseAString {

	String initial;
	String later="";
	Stack<Character> first=new Stack<Character>();
	
	ReverseAString()
	{
		
	}
	
	public String reverse(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			first.push(s.charAt(i));
			
			
		}
		for(int i=0;i<s.length();i++)
		{
			later=later+(first.pop());
			
			
		}
		
		return later;
	}
	public static void main(String args[])
	{
		ReverseAString rs=new ReverseAString();
		String ans=rs.reverse("abcdef");
		System.out.println(ans);
	}
}
