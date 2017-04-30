package Miscellaneous;

import java.util.*;
public class PlantsStacks {
int days=0;
ArrayList count=new ArrayList();
	public void checkForDeadPlants(int a[])
	{
		ArrayList initial=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			initial.add(a[i]);
		}
		System.out.println(recur(initial));
		
	}
	
	public int recur(ArrayList a)
	{
		count=new ArrayList();
		ArrayList initial=a;
		Iterator it=initial.iterator();
		for(int j=0;j<a.size()-1;j++)
		{
			if((int)a.get(j)<(int)a.get(j+1))
			{
				count.add(a.get(j+1));
			}
		}
		if(count.isEmpty())
			return days;
		for(int j=0;j<count.size();j++)
		{
			System.out.println(count.get(j));
			a.remove(count.get(j));
		}
		days=days+1;
		recur(a);
		return days;
	}
	public static void main(String args[])
	{
		PlantsStacks ps=new PlantsStacks();
		int a[]={6, 5, 8, 4, 7, 10, 9};
		ps.checkForDeadPlants(a);
	}
}
