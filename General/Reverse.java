package General;

public class Reverse {

	public String reverse(String s)
	{
		String words[]=s.split(" ");
		int length= words.length-1;
		String result="";
		for(int i=0;i<=length/2;i++)
		{
			String temp=words[length-i];
			words[length-i]=words[i];
			words[i]=temp;
			
		}
		for(int j=0;j<words.length;j++){
			if(j!=words.length-1)
			result=result+words[j]+" ";
			else
				result=result+words[j];
		}
		return result;
	}
	public void reverse(int n)
	{
		int zero=1;
		int num=0;
		int z=0;
		int value=0;
		while(n/zero>=10)
		{
			zero=zero*10;
			z++;
		}
		
		while(n>0)
		{
			int count=z;
			num=(n%10);
			while(count>0)
			{
				num=num*10;
				count--;
			}
			value=value+num;
			n=n/10;
			z--;
		}
		System.out.println(value);
	}
	
	public int[] rotate(int a[],int length,int temp)
	{
		
		if(length==a.length-1)
			
			{
			a[0]=temp;
			return a;
			}
		if(length==0)
		{
			temp=a[length+1];
			a[length+1]=a[length];
		}
		else
			
		{int temp1=temp;
			
			temp=a[length+1];
			a[length+1]=temp1;
		}
			
		rotate(a,length+1,temp);
		
			
		
		return a;
	}
	public int[] rotateArray(int a[],int k)
	{
		while(k!=0)
		{
			rotate(a,0,0);
			k--;
		}
		return a;
	}
	public int[] mergeSort(int a[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge2(a,start,mid,end);
		}
		return a;
	}
	public void merge2(int a[],int start,int mid,int end)
	{
		int p=mid-start+1;
		int q=end-mid;
		int L[]=new int[p];
		int R[]=new int[q];
		for(int i=0;i<p;i++)
		{
			L[i]=a[p+i];
		}
		for(int j=0;j<q;j++)
		{
			R[j]=a[q+j+1];
		}
		int i=0,j=0;
		int k=p;
		while(i<p && j<q)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
			}
			else
			{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<p)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<q)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	public int  merge(int a[],int b[])
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
		if(a.length%2==0)
		{
			return a[(a.length-1)/2];
		}
		else
		{
			System.out.println(a[a.length/2]);
			
			return (a[a.length/2]+a[(a.length-1)/2])/2;
		}
		
	}
	/*public int[] generateGrayCode(int ar[],int k,int a[])
	{
		if(k==0)
			return ar;
		if(a[0]==)
		else
		{
			ar[1]=01;
			a[0]--;
			a[1]--;
			generateGrayCode(ar, k,a);
		}
		
	}*/
	public void generate(int k)
	{
		int a[]=new int[k];
		int ar[]=new int[k];
		ar[0]=00;
		a[0]=2;
		a[1]=4;
		//generateGrayCode(ar, k,a);
	}
	
	public static void main(String args[])
	{
		Reverse r=new Reverse();
		//String result=r.reverse("home is a good");
		//System.out.println(result);
		int a[]={2,4,6,8};
		int b[]={1,3,5,7};
		//System.out.println(r.merge(a, b));
		r.reverse(1234);
		//int result[]=r.rotateArray(a,3);
		int input[]={10,9,8,7,6,5,4,3};
		//int res[]=r.mergeSort(input, 0, input.length-1);
		
	}
}
