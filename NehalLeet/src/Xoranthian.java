import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Xoranthian {
	HashMap<String,String[]> colours=new HashMap<String,String[]>();
	Xoranthian()
	{
		
		String red[]={"red","blank"};
		colours.put("red",red);
		String blue[]={"blue","blank"};
		colours.put("blue",blue);
		String yellow[]={"yellow","blank"};
		colours.put("yellow",yellow);
		String purple[]={"blue","red"};
		colours.put("purple",purple);
		String green[]={"blue","yellow"};
		colours.put("green",green);
		String orange[]={"red","yellow"};
		colours.put("orange",orange);
	}
	
	public ArrayList calculateFirstRow(String arr[])
	{
		ArrayList a1=new ArrayList();
		Xoranthian x=new Xoranthian();
		HashMap hm=x.colours;
	 
			String ar[];
			String br[];
			int index=0;
			a1.add(index,arr[0]);
	 for(int i=1;i<arr.length-1;i++)
	 {
		  ar=(String[]) hm.get(arr[i]);
		  
			
	 }
	 for(int m=0;m<a1.size();m++)
	 {
		 System.out.println("hi"+a1.get(m));
	 }
		/*for(int i=1;i<arr.length-1;i++)
		{if(hm.containsKey(arr[i]))
				{
					String ar[]=(String[]) hm.get(arr[i]);	
					for(int k=0;k<ar.length;k++)
						{
						System.out.println(ar[k]);
						a1.add(ar[k]);}
						}
			
		}*/
		
		return a1;
	}
	public int countHi(String str) {
		  if(str.length()<2)
		  return 0;
		  if(str.substring(0,2).equals("ii"))
		  return 1+countHi(str.substring(2));
		  return countHi(str.substring(1));
		}
	public static void main(String arg[])
	{
		Xoranthian xr=new Xoranthian();
		String arr[]={"red", "purple", "green", "orange", "purple", "purple", "orange", "yellow", "yellow", "yellow"};
		//xr.calculateFirstRow(arr);
		System.out.println(xr.countHi("xxiiix"));
		
	}
}
