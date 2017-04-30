package Miscellaneous;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution1 {
	
	  public int compareVersion(String version1, String version2) {
	        
	        int version11=0;
	        int version12=0;
	        int version21=0;
	        int version22=0;
	        if(version1.contains("."))
	        {
	            String version1_higher=version1.substring(0,version1.indexOf("."));
	            version11=Integer.parseInt(version1_higher);
	            String version1_lower=version1.substring(version1.indexOf(".")+1,version1.length());
	             version12=Integer.parseInt(version1_lower);
	        }
	        else
	        {
	            version11=Integer.parseInt(version1);
	        }
	        if(version2.contains("."))
	        {
	            String version2_higher=version2.substring(0,version2.indexOf("."));
	             version21=Integer.parseInt(version2_higher);
	            String version2_lower=version2.substring(version2.indexOf(".")+1,version2.length());
	             version22=Integer.parseInt(version2_lower);
	        }
	        else
	        {
	            version21=Integer.parseInt(version2);
	        
	        }
	        
	        
	        if((version11!=version21)&&version12!=0 &&version22!=0)
	        {
	            if((version11>version21)&&version12==0 &&version22==0)
	            return 1;
	            if((version11<version21)&&version12==0 &&version22==0)
	            return -1;
	            if((version11==version21)&&(version12!=0||version22!=0))
	            {
	                if(version12>version22)
	                return 1;
	                else if (version12<version22)
	                return -1;
	                else
	                return 0;
	            }
	        }
	        
	        return 0;
	     
	    }
public int[] countBits(int num) {
    int finalarray[]=new int[num+1]; 
    String a[]=new String[num+1];
    int counter=0;
	for(int i=0;i<=num;i++)
        {
        	a[i]=Integer.toBinaryString(i);
        	for(int j=0;j<a[i].length();j++)
    		{
    			if(a[i].charAt(j)=='1')
    			{
    				counter++;
    			}
        }
        	finalarray[i]=counter;
        	counter=0;
	
		
	}
	return finalarray;
    }
    public boolean containsDuplicate(int[] nums1)
    {
        int temp=0;
        int nums[]=nums1;
        int []nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
           nums2[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]==nums2[j])
                    	
                    	{System.out.println("true");
                    return true;}
                }
            
           
            }
        }
        System.out.println("false");
        return false;
    }
    
    public ArrayList<int[]> suminaArray(int a[],int number)
    {
    	ArrayList<int[]> al=new ArrayList();
    	HashMap hm=new HashMap();
    	int a1[]=new int[2];
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]>number)
    		hm.put(a[i], a[i]-number);
    		else
    			hm.put(a[i], number-a[i]);
    	}
    	for(int i=0;i<hm.size();i++)
    	{
    		if(hm.containsValue(a[i]))
    		
    		{a1[0]=(int) hm.get(a[i]);
    		a1[1]=a[i];
    		al.add(a1);
    		}
    	}
    	return al;
    }
    public int[][] rotateArray(int a[][])
    {
    	int b[][]=new int[a[0].length][a.length];
    	for (int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			b[j][i]=a[i][j];
    			System.out.println(b[i][j]);
    		}
    	}
    	for (int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			System.out.println(a[i][j]);
    		}
    	}
    	
    	
    	return b;
    }
    public int[] recur(int a[],int n,int temp)
    {
    	
    	
    	if(a.length-1==n)
    		{
    		a[0]=temp;
    		return a;
    		}
    	if(n==0)
    	{
    		temp=a[n+1];
    		a[n+1]=a[n];
    	}
    	else
    	{
    		a[0]=temp;
    	temp=a[n+1];
    	a[n+1]=a[0];
    	
    	
    	
    	}
    	n=n+1;
    	return recur(a,n,temp);
    }
public int maxRotateFunction(int[] A) {
	int [] answer=A;
	int value[]=new int[A.length];
	int value1=0;
	Solution1 s=new Solution1();
	List<int[]> hm;
	List<List<int[]>> hm1=new ArrayList<>();
	for(int i=0;i<A.length;i++)
	{
		//answer=s.recur(A, 0, 0);
		
		answer=s.recur(A, 0, 0) ;
		for(int j=0;j<answer.length;j++)
		{
			value1=value1+answer[j]*j;
		}
		
		value[i]=value1;
		value1=0;
		
	}
	
	sort(value);
	for(int i=0;i<value.length;i++)
	{
		System.out.println(value[i]);
	}
	return value[value.length-1];
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
    public static void main(String args[])
    {
    	Solution1 s=new Solution1();
    	//int strs[]=
    	//s.countBits(5);
    	int a[]={1,2,3,4,5,6,7,8};
    	int b[][]=new int[][]{{1,2},{3,4}};
   // 	s.compareVersion("1.5", "2.5");
    	s.recur(a, 0, 0);
    	//System.out.println(s.maxRotateFunction(a));
    	//s.rotateArray(b);
    	//s.suminaArray(a,9);
    	//s.containsDuplicate(strs);
    	
    }
}
