package Trees;
import java.util.*;
public class Friendship {
	//
 ArrayList<Integer> al[];
ArrayList<ArrayList<Integer>> finalal=new ArrayList<>();
ArrayList<Integer>list=new ArrayList<>();
	public int search(String [][] m)
	{
		
		al=new ArrayList[m.length+1];
		int temp=m.length;
		al[temp]=new ArrayList<>();
		for(int i=0;i<m.length;i++)
		{
			al[i]=new ArrayList<>();
			al[i].add(temp);
			for(int j=0;j<m[0].length;j++)
			{
				if(m[i][j]=="Y")
				al[i].add(j);
				//System.out.println(al[i]);
			}
			
			
		}
		al[m.length].add(temp);
		for(int i=0;i<m.length;i++)
		{
			al[m.length].add(i);
		}
		;
		for(int j=0;j<al.length;j++)
		{
			
			System.out.println(al[j]);
		}
		findfriends(temp,m.length,finalal);
		
		
		return finalal.size();	
		}
		
	public void findfriends(int i,int length,ArrayList<ArrayList<Integer>> finalal)
	{
		
		if(!list.contains(i))
		list.add(i);
		ArrayList<Integer> a=al[i];
		Iterator ij=a.iterator();
		while(ij.hasNext())
		{
			int ijh=(int)ij.next();
			
			if(ijh!=i)
				if(ijh==length && !list.isEmpty())
				{
				finalal.add(list);}
	
		{
			if(!list.contains(ijh))
			{list.add(ijh);
			
			
			i=ijh;
			
			findfriends(i,length,finalal);
		}
		}
		
		}
			
		
		}
		
	
	
	public static void main(String args[])
	{
		Friendship fr=new Friendship();
		String fr_matrix[][]={{"Y","Y","N","N"},{"Y","Y","Y","N"},{"N","Y","Y","N"},{"N","N","N","Y"}};
		
	System.out.println(fr.search(fr_matrix));}
}
