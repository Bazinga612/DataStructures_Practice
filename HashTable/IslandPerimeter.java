package HashTable;
import java.util.*;
public class IslandPerimeter {
	public void removeKdigits(String num, int k) {
		char ch[]=num.toCharArray();
		ArrayList ar=new ArrayList();
		for(int i=0;i<ch.length;i++)
		{
			ar.add(ch[i]);
		}
		int j=0;
		int max;
		int index=-1;
		while(j!=num.length()-k)
		{
			
			for(int i=j;i<j+k;i++)
			{
				
				if((char)ar.get(i)>(char)ar.get(i+1))

				{
					index=i;
				}
				else if((char)ar.get(i)<(char)ar.get(i+1))
					index=i+1;
			}
			if(index!=-1)
			ar.remove(index);
			j++;
			
		}
	}
public int islandPerimeter(int[][] grid) {
       int temp=0;
       int count=0;
        int[][] grid_new=new int[grid.length+2][grid[0].length+2];
        for(int i=1;i<=grid.length;i++)
        {
        	for(int j=1;j<grid[0].length+1;j++)
        	{
        		grid_new[i][j]=grid[i-1][j-1];
        	}
        }
        for(int i=1;i<=grid.length;i++)
        {
        	for(int j=1;j<grid[0].length+1;j++)
        	{
        		if(grid_new[i][j]==1)
        		{int a=grid_new[i+1][j];
        			temp=grid_new[i][j+1]+grid_new[i-1][j]+grid_new[i][j-1]+grid_new[i+1][j];
        			temp=4-temp;
        			count=count+temp;
        		}
        	}
        }
        return count;

}

	 public List<List<String>> groupAnagrams(String[] strs) {
		 HashMap<String, List<String>> hm=new HashMap<String, List<String>>();
		
		 List<List<String>> al=new ArrayList();
		 List<String> inner;
		 List<String> hminner=new ArrayList(); ;
		 for(int i=0;i<strs.length;i++)
		 {
			 
				 char ch[]=strs[i].toCharArray();
				 
				 
				 Arrays.sort(ch);
				 String temp=String.valueOf(ch);
				 
				 if(!hm.containsKey(temp))
						hm.put(temp, new ArrayList<String>());
					hm.get(temp).add(strs[i]);
	 }
		 
		Iterator it=hm.values().iterator();
		while(it.hasNext())
		{
			al.add((List<String>) it.next());
		}
		
return al;
	 }
	 public void fractionToDecimal(int numerator, int denominator) {
	        float result=(float)numerator/(float)denominator;
	        String result1=String.valueOf(result);
	        String result2="";
	        String temp="";
	        int flag=0;
	        String [] ar=result1.split("\\.");
	        HashMap hm=new HashMap();
	        if(ar[1].equals("0"))
	        {
	        	result2=ar[0];
	        	System.out.println(result);
	        }
	        	
	        else
	        {
	        	for(int i=0;i<ar[1].length();i++)
	        	{
	        		if(hm.containsKey(ar[1].substring(i, i+1)))
	        		{
	        			flag=1;
	        			break;
	        		}
	        		
	        		else
	        		{
	        			hm.put(ar[1].substring(i, i+1), 1);
	        		}
	        		temp=temp+ar[1].substring(i, i+1);
	        	}
	        	
	        }
	        if(flag==1)
	        	System.out.println(ar[0]+".("+temp+")");
	        
	        System.out.println(result);
	    }
	public String getHint(String secret, String guess) {
		HashMap initial=new HashMap();
		HashMap finalhm=new HashMap();
		String result="";
		char ch1[]=secret.toCharArray();
		char ch2[]=guess.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(initial.containsKey(ch1[i]))
			{
				if(ch1[i]!=ch2[i])
			
			
				initial.put(ch1[i], (int)initial.get(ch1[i])+1);}
			else if(!initial.containsKey(ch1[i])&& ch1[i]!=ch2[i] )
				initial.put(ch1[i], 1);
			}
		for(int i=0;i<ch2.length;i++)
		{
			if(finalhm.containsKey(ch2[i]))
			{
				if(ch1[i]!=ch2[i])
			
				finalhm.put(ch2[i], (int)finalhm.get(ch2[i])+1);}
			else if(!finalhm.containsKey(ch2[i])&& ch1[i]!=ch2[i] )
				finalhm.put(ch2[i], 1);
			}
		Iterator it=initial.keySet().iterator();
		int temp=0;
		int cows=0;
		while(it.hasNext())
		{
			char c=(char)it.next();
			if(finalhm.containsKey(c))
			{
				temp=(int)finalhm.get(c)-(int)initial.get(c);
				if(temp<0)
					
					temp=temp*-1;
				if(temp==0)
					temp=(int)finalhm.get(c);
				temp=Math.min((int)initial.get(c), (int)finalhm.get(c));
				cows=cows+temp;
			}
		}
		int bulls=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch2[i])
				bulls++;
				
		}
		result=bulls+"A"+cows+"B";
		return result;
	}
public int firstMissingPositive(int[] nums) {
	Arrays.sort(nums);
	for(int i=0;i<nums.length-1;i++)
	{
		if(nums[i]+1!=nums[i+1]&& nums[i]+1>0)
		return nums[i]+1;
	}
	return -1;
        
    }
public boolean canMeasureWater(int x, int y, int z) {
	int big=x;
	int small=y;
	int temp=0;
	while(big!=z)
	{
		big=x;
		big=big-small;
		small=y;
		small=0;
		temp=big;
		big=small;
		small=temp;
	}
    if(big==z)
    	return true;
    	
    
	return false;
}

public boolean recur(int x,int y,int z,int a,int b)
{
	int big=a;
	int small=b;
	
	if(x==z)
		return true;
	else
	{
		recur(x,0,z,a,b);
		recur(x-small,small,z,a,b);
		recur(x-small,0,z,a,b);
		recur(0,x-small,z,a,b);
		return false;
	}
}

public static void main(String args[])
{
	IslandPerimeter ip=new IslandPerimeter();
	int [][] grid={{1,1}};
	//int result=ip.islandPerimeter(grid);
	//ip.removeKdigits("1432219", 3);
	
	//System.out.println(ip.getHint("2822013305","5706322849"));
	String a[]={"","b",""};
	//List<List<String>> result=ip.groupAnagrams(a);
	ip.fractionToDecimal(1,7);
	int []nums={1,2,0};
	//int num=ip.firstMissingPositive(nums);
	//System.out.println(ip.canMeasureWater(5,3,4));
}
}
