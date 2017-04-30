package HashTable;
import java.util.*;

import Heaps.MagicianAndChocolates.MaxComparator;
public class Frequency {

	public void frequencySort(String s)
	{
		char ch[]=s.toCharArray();
		Hashtable ht=new Hashtable();
		
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			if(ht.containsKey(ch[i]))
			{
				ht.put(ch[i], (int)ht.get(ch[i])+1);
			}
			else
				ht.put(ch[i], 1);
		}
		ArrayList count=new ArrayList(ht.values());
		
		Collections.sort(count);
		Iterator it=count.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
	}
	
	}
	public static void main(String args[])
	{
		Frequency f=new Frequency();
		f.frequencySort("add");
	}
}

