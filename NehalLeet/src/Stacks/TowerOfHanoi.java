package Stacks;

import java.util.Stack;

public class TowerOfHanoi {
	
	public Stack<Character> first;
	public Stack<Character> second;
	public Stack<Character> third;
	public TowerOfHanoi(String s) {
		System.out.println(s.length());
		first=new Stack<Character>();
		second=new Stack<Character>();
		third=new Stack<Character>();
		for(int i=s.length()-1;i>=0;i--)
		{
			
			char ch=s.charAt(i);
			first.push(ch);
			System.out.println(ch);
		}
	}
	
	public void calculate(String s)
	{
		for(int i=1;i<=s.length();i++)
		{
			if(i%s.length()==1)
			{
				
				third.push(first.pop());
			}
			if(i%s.length()==2)
			{
				
				second.push(first.pop());
			}
			if(i%s.length()==0 )
			{
				
				second.push(third.pop());
			}
			else
			{
				third.push(first.pop());
			}
		}
		
	}
	
	public void display()
	{
		
		while(third.isEmpty())
		{
			System.out.println(third.pop());
		}
	}
	public static void main(String main[])
	{
		TowerOfHanoi t=new TowerOfHanoi("abc");
		t.calculate("abc");
		
	}

}
