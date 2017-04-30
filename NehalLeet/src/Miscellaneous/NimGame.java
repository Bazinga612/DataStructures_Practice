package Miscellaneous;

import java.util.HashMap;

public class NimGame {

	int count=1;
	public String largestNumber(int a[])
	{
		String number = "";
	HashMap hm=new HashMap();
	int counter[] = new int[a.length];
		sort(a);
		
		
		
		
		int length=(int)(Math.log10(a[a.length-1])+1);
		//System.out.println(length);
		int count=length;
		for(int i=0;i<a.length;i++)
		{
			count=length;
			if(count-((int)(Math.log10(a[i])+1))>0)
			{
				
					count--;
					a[i]=a[i]*10;
					
					
						
					
				System.out.println(i+""+a[i]);
			}
			
				
			
				
			//System.out.println(a[i]);
		}
		sort(a);
		for(int j=0;j<a.length-1;j++)
		{
			counter[j]=(int)(Math.log10(a[j])+1);
			System.out.println(a[j]);
			System.out.println(counter[j]);
		}
		for(int i=a.length-1;i>-1;i--)
		{
			//System.out.println(a[i]);
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(hm.get(i));
		}
		
		for(int i=a.length-1;i>-1;i--)
		{
			//System.out.println(i);
			if(a[i]%10==0 && counter[i]!=length)
			{
				a[i]=a[i]/10;
				number=number+a[i];
			}
			else
				number=number+a[i];
			//System.out.println(a[i]);
		}
		return number;
	}
	void sort(int arr[]){
        int n = arr.length;
        for (int i=1; i<n; ++i){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
	}
	/*public boolean canWin(int stones)
	{
		count++;
		if(count%2!=0)
		{
			System.out.println("Player 1 turn");
		if(stones==1||stones==2||stones==3)
		{
			return false;
		}
		else
		{
			canWin(stones-1);
			canWin(stones-2);
			canWin(stones-3);
			return true;
		}
		
		}*/
	/*public int sum(int a,int b)
	{ int sum=0;
	Integer.toBinaryString(i)
		return sum;
	}*/
	
	public static void main(String args[])
	{
		NimGame ng=new NimGame();
		int a[]={3,30,34,5,9};
		System.out.println(ng.largestNumber(a));
		
		String a1="10";
		/*String s=Integer.toString(17, 9);
		System.out.println(s);
		int s1=Integer.parseInt(s);
		System.out.println((s1>>1));
		System.out.println(Integer.parseInt("1001",3));
		byte b = (byte) 9;
		System.out.println(b>>1);*/
		/*int a=23;
		int b=13;
		int bef=1;
		int car;
		int counter = 0;
		if(a>b)
		{
			bef=a/b;
			a=a%b;
			if(a!=0)
			{
				counter=1;
			while(a<b)
			{
				a=a*10;
				System.out.println(a);
				a=a/b;
				
			}
			}
			else
			{
				counter=0;
				
			}
			
		}
		else if(a<b)
		{
			bef=0;
			while(a<b)
			{
				a=a*10;
				System.out.println(a);
				a=a/b;
				
			}
		}
		
		if(counter!=0)
		System.out.println(bef+"."+a);
		else
		System.out.println(bef);*/
		//System.out.println(Integer.toString(Integer.parseInt(a1,2),3));
		
		
	}
}
