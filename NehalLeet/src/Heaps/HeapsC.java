package Heaps;
import java.util.*;
public class HeapsC {
	

	
	
	public void arrange(int a[])
	{
		Comparator<Integer> c=new MaxComparator();
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(c);
		for(int i=0;i<a.length;i++)
		{
		
			pq.add(a[i]);
			
	}
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=pq.poll();
		System.out.println(b[i]);
	}
	}
	
	public static void main(String args[])
	{
		HeapsC hc=new HeapsC();
		int a[]={9,8,7,6,5,4,3,2,1};
		hc.arrange(a);
		
	}

	public class MaxComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	}
	
}
