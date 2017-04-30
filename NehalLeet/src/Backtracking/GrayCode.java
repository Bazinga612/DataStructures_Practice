package Backtracking;

import java.util.ArrayList;

public class GrayCode {

public void calculateGrayCode(int n)
{
	ArrayList<String>a1=new ArrayList<String>();
	int zero[]={0,1,2,3};
	int ones[]={0,1,2,3};
	calculatenewGrayCode(n,0,0,a1,zero,ones);
}
public ArrayList<String> calculatenewGrayCode(int n,int count_0,int count_1,ArrayList<String>a1,int x[],int y[])
{
	ArrayList<String>a11=a1;
	int x1[]=x;
	int y1[]=y;
	
	
	if(count_0==n)
	{
		return a1;
	}
	if(count_0+count_1==3)
	{String s="";
		while(x1[count_0]!=0)
		{
			s=s+0;
		}
		while(y1[count_1]!=0)
			
		{
			
			s=s+1;
			count_1--;
		}
	a11.add(s);
	}
	if(count_1==n)
	{
		count_0=count_0+1;
	}
	calculatenewGrayCode(n,count_0,count_1+1,a11,x1,y1);
	return a1;
	
}
	public static void main(String args[]){
		GrayCode gc=new GrayCode();
		gc.calculateGrayCode(3);
	}
}
