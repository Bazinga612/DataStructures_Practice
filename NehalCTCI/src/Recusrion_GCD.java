import java.util.Scanner;

public class Recusrion_GCD {

	public int GCD(int n1,int n2)
	{
		 
		 int a=n1;
		 int b=n2;
		 
		 int d;
		 if(b==0)
		 {
			 return a;
		 }
		 
		 
		 else if(a>b)
		 {
		 d=a%b;
		 a=b;
		 return GCD(a,d);
		 
		 }	 
		 else 
		 {
			 return 1;
		 }
	}
		 /*public String swap(String str,int counter_starting)
		 {
			 int length=str.length();
			 StringBuffer string1=new StringBuffer(str);
			 int counter_start=counter_starting;
			int counter_end=length;
			//char ch[]=string1.toCharArray();
			String temp;
			 if(counter_end==0)
			 {
				 return string1.toString();
			 }
			 else if(counter_start!=counter_end)
			 {
				 temp=string1.substring(counter_start, counter_start+1);
				 //temp.substring(counter_start, endIndex)				 
				 
			 }*/
			 
		 public int subsequence(String str,String sub)
		 {
			 
			 CharSequence s=sub.subSequence(0, sub.length());
			 int value=0;
			  
			 
			 
			 if(value==str.length() || !(str.contains(s)))
			 {
				 return 0;
			 }
			 else 
			 {
				 
				 
					 value=str.indexOf(str, 0);
					 value=value+sub.length();
					 str=str.substring(value);
					subsequence(str,sub);
					
			 }
			 return value;
		 }
	
	
	public static void main(String arg[])
	{
		Recusrion_GCD gcd=new Recusrion_GCD();
		/*Scanner in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();*/
		//System.out.println(gcd.GCD(2322,654));
		System.out.println(gcd.subsequence("catodagcat", "cat"));
		
		
	}
}
