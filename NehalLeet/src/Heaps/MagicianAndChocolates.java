package Heaps;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MagicianAndChocolates {

	int steps=0;
	int bags=0;
	int no_elements[];
	int max=0;
	public MagicianAndChocolates(int k,int n,int a[]) {
		// TODO Auto-generated constructor stub
		steps=k;
		bags=n;
		no_elements=a;
		calculate();
	}
	
	public int subtract(int a)
	{
		
		if(a%2!=0)
		{
			a=(a-1)/2;
			
		}
		else
		{
			a=a/2;
		}
		return a;
	}
	public void calculate()
	{
		
		
		while(steps>0)
		{
			Comparator<Integer>queue=new MaxComparator();
			PriorityQueue<Integer>pq=new PriorityQueue<Integer>(bags, queue);
			for(int i=0;i<no_elements.length;i++)
			{
				pq.add(no_elements[i]);
				
				
				
				if(steps>0)
				max=max+no_elements[i];
				steps--;
			}
			
			for(int i=0;i<no_elements.length;i++)
			{
				no_elements[i]=subtract(no_elements[i]);
			}
			
		}
		System.out.println(max);
		
	}
	public class MaxComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2) {
			if(o1<o2)
				return -1;
			else if(o1>o2)
				return 1;
			else
			return 0;
		}
		
	}
	
public static void main(String args[])

{ int a[]={6,5,7};
	MagicianAndChocolates m=new MagicianAndChocolates(6,3,a);
	
}
}