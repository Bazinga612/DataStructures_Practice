import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Common {

	public String common(String a,String b)
	{
		HashMap<String,Integer> hm1=new HashMap();
		HashMap hm2=new HashMap();
		String result="";
		
		for(int i=0;i<a.length();i++)
		{
			if(hm1.containsValue(a.substring(i,i+1)))
				hm1.put(a.substring(i,i+1), (int)hm1.get(a.substring(i,i+1))+1);
			else
				hm1.put(a.substring(i,i+1), 1);
		}
		for(int i=0;i<b.length();i++)
		{
			if(hm2.containsValue(b.substring(i,i+1)))
				hm2.put(b.substring(i,i+1), (int)hm2.get(b.substring(i,i+1))+1);
			else
				hm2.put(b.substring(i,i+1), 1);
		}
		Iterator it=hm1.keySet().iterator();
		Iterator it2=hm2.entrySet().iterator();
		while(it.hasNext())
		{
			String temp=it.next().toString();
			if(hm2.containsKey(temp))
				result=result+temp;
		}
		return sort(result);
		
	}
	public String sort(String result)
	{
		String fr="";
		char c[]=result.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			fr=fr+c[i];
		}
		return fr;
		    
	}
	public static void main(String args[])
	{
		Common c=new Common();
		String a="9x34209asAb32sD840D9258";
		String b="02934x2DoebAaab90CDEe348290";
		System.out.println(c.common(a, b));
	}
}
