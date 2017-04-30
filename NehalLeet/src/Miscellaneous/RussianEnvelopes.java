package Miscellaneous;
import java.util.*;
public class RussianEnvelopes {

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
	public static void main(String args[])
	{
		int [][] envelopes={{5,4},{6,7},{2,3},{6,4}};
		int b[]=new int[envelopes.length];
		HashMap<Integer,ArrayList<Integer>> hm=new HashMap<Integer,ArrayList<Integer>>();
		ArrayList al=new ArrayList();
		for(int j=0;j<envelopes.length;j++)
		{
			
			b[j]= envelopes[j][0];
			//System.out.println(b[j]);
			
		}
		for(int j=0;j<envelopes.length;j++)
		{
			al=new ArrayList();
			al.add(envelopes[j][1]);
			if(hm.get(envelopes[j][0])==null)
			hm.put(envelopes[j][0],al );
			else
			{
				al.add(hm.get(envelopes[j][0]));
				hm.put(envelopes[j][0],al );
			}
			
			
			
		}
		
		
		Iterator it=hm.keySet().iterator();
		while(it.hasNext())
		{
			ArrayList a=hm.get(it.hasNext());
			ArrayList c=hm.get(it.hasNext());
			Iterator f=a.iterator();
			Iterator g=c.iterator();
			if(f.hasNext())
			{
				
			}
			
			
			//if(it.)
		}
		
		
	}
}
