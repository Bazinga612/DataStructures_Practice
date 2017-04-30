package Miscellaneous;

import java.util.Scanner;
import java.util.Stack;

public class JackDanielString {

	public static void main(String args[])
	{
		JackDanielString jd=new JackDanielString();
		String finalString="";
		Stack s=new Stack();
		Stack t=new Stack();
		Scanner in =new Scanner(System.in);
		String s1="JACK";
		String t1="DANIEL";
		char ch[]=s1.toCharArray();
		char ch1[]=t1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s.push(ch[i]);
		}
		
		for(int i=ch1.length-1;i>=0;i--)
		{
			t.push(ch1[i]);
		}
		int length=ch.length+ch1.length;
		for(int i=0;i<length;i++)
		{
			char a=' ';
			char b=' ';
			if(!s.isEmpty())
			{
			 a=(char)s.peek();
			}
			if(!s.isEmpty())
			{ b=(char)t.peek();}
			if((int)a<(int)b )
			{
				
				finalString=finalString+s.pop();
			}
			else
			{
				finalString=finalString+t.pop();
			}
		}
		System.out.println(finalString);
	}
	
}
