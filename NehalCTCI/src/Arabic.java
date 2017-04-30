import java.util.HashMap;
import java.util.Scanner;

public class Arabic {

	HashMap hm=new HashMap();
	Arabic()
	{
		hm.put('I', 1);
		hm.put('V', 5);
		hm.put('X', 10);
		hm.put('M', 1000);
		hm.put('C', 100);
		hm.put('L', 50);
		hm.put('D', 500);
	}
	public int calculate(String expr)
	{
		char ch[]=expr.toCharArray();
		int result=0;
		int flag=0;
		if(ch.length==0)
			return 0;
		
		if(ch.length==1 && hm.get(ch[0])!=null)
			return (int)hm.get(ch[0]);
		for(int i=0;i<ch.length;i++)
		{
			if(hm.get(ch[i])==null)
			{
			
			return -1;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			
			if(ch.length>1&& i<ch.length-1 &&((int)hm.get(ch[i])<(int)hm.get(ch[i+1])) && (i+1)<ch.length)

				{result=result+(int)hm.get(ch[i+1])-(int)hm.get(ch[i]);
				flag=1;
				}
			else if(flag!=1)
				{
				result=result+(int)hm.get(ch[i]);
				}
			else
				flag=0;
		}
		
		return result;
		
	}
	public static void main(String args[])
	{
		Arabic a=new Arabic();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to be converted");
		String input=in.nextLine();
		int result=a.calculate(input);
		if(result==-1)
		{
			System.out.println("Incorrect expression.Enter again");
			System.out.println("Enter the string to be converted");
			input=in.nextLine();
			result=a.calculate(input);
		}
		if(result!=-1)
			System.out.println(""+result);
		
		
	}
}
