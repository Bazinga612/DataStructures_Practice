import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TopSecret {

	public void Convert(String s,String key)
	{
		int keylength=s.length();
		char[] convert=s.toCharArray();
		char[] keyconvert=key.toCharArray();
		ArrayList asciivalues=new ArrayList();
		ArrayList asciivalues1=new ArrayList();
		ArrayList asciivalues2=new ArrayList();
		ArrayList finalasciivalues=new ArrayList();
		String answer="";
		int n;
		char ch1[] = null;
		for(int i=0;i<convert.length;i++)
		{ n=(int)convert[i];
			
				if(n>64&&n<91)
				{
					asciivalues.add((int)convert[i]-65);
				}
				if(n<123&&n>96)
				{
					asciivalues.add((int)convert[i]-65);
				}

			
			
			
		}
		System.out.println(asciivalues.iterator().next());
		for(int i=0;i<keyconvert.length;i++)
		{
			n=(int)convert[i];
			if((n<123&&n>96)||(n>64&&n<91))
			{
				if(n>64&&n<91)
				{
					asciivalues1.add((int)keyconvert[i]-65);
				}
				if(n<123&&n>96)
				{
					asciivalues1.add((int)keyconvert[i]-65);
				}

			
			}
		}
		
		for(int i=0;i<asciivalues.size();i++)
		{
			
			asciivalues2.add(asciivalues1.get(i%10));
		}
		for(int i=0;i<convert.length;i++)
		{
			n=(int)asciivalues2.get(i);
			if((n<123&&n>96)||(n>64&&n<91))
			{
			int value=(int) asciivalues.get(i)+(int) asciivalues1.get(i);
			finalasciivalues.add(value);
			}
		}
		
		for(int i=0;i<finalasciivalues.size();i++)
		{
			answer = Character.toString((char)i)+answer;

		}
		System.out.println(answer);
	}
	
	public static void main(String args[])
	{
		TopSecret ts=new TopSecret();
		String input="GOODBYE" ;
		String key="HELLO";
		int value1=(int)'a';
		System.out.println(value1);
		//ts.Convert(input,key);
		ts.Convert(input,key);
		
		
	}
}
