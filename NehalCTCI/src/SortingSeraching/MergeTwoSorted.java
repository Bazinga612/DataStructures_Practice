package SortingSeraching;

public class MergeTwoSorted {

	public int [] merge(int a[],int b[])
	{
		int n1=a.length;
		int n2=b.length;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			L[i]=a[i];
		}
		for(int i=0;i<n2;i++)
		{
			R[i]=b[i];
		}
		
		int F[]=new int[n1+n2];
		int i=0;int j=0;int k=0;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				F[k]=L[i];
				i++;
			}
			else
			{
				F[k]=R[j];
				j++;
			}
			k++;
		}
			while(i<n1)
			{
				F[k]=L[i];
				i++;
				k++;
			}
			while(j<n2)
			{
				F[k]=R[j];
				j++;
				k++;
			}
		
		return F;
	}
	
	public static void main(String args[])
	{
		MergeTwoSorted mt=new MergeTwoSorted();
		int a[]={2,4,6,8};
		int b[]={1,3,5,7};
		int c[]=mt.merge(a, b);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
	}
}
