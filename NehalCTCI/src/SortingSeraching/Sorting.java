
package SortingSeraching;

public class Sorting {

	public int[] QuickSort(int a[],int p,int r)
	{
		if(p<r)
		{
		int q=Partition(a,p,r);
		QuickSort(a,p,q-1);
		QuickSort(a,q+1,r);
		
		}
		return a;
		
	}
	public int Partition(int a[],int p,int r)
	{
		int i=p-1;
		int temp;
		int pivot=a[r];
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
			
		}
		temp=a[r];
		a[r]=a[i+1];
		a[i+1]=temp;
		return i+1;
	}
	int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
	public int[] MergeSort(int a[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
		MergeSort(a,start,mid);
		MergeSort(a,mid+1,end);
		merge2(a,start,mid,end);
		
		}
		return a;
	}
	void merge2(int a[],int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i]=a[p+i];
		}
		for(int j=0;j<n2;j++)
		{
			R[j]=a[q+j+1];
		}
		int i=0;int j=0;
		int k=p;
		while(i<n1 && j<n2)
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
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}
	}
	void merge1(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
	public void merge(int a[],int p,int q,int r)
	{
		int l1=q-p+1;
		int l2=r-q;
		int a1[]=new int[l1+1];
		int a2[]=new int[l2+1];
		a1[l1]=Integer.MAX_VALUE;
		a2[l2]=Integer.MAX_VALUE;
		int b[]=new int[a.length];
		for(int i=0;i<l1;i++)
		{
			a1[i]=a[p+i];
		}
		for(int i=0;i<l2;i++)
		{
			a2[i]=a[q+i+1];
		}
		int i=0;int j=0;
		for(int k=0;k<r;k++)
		{
			if(a1[i]<=a2[j])
			{
				b[k]=a1[i];
				i=i+1;
			}
			else
				b[k]=a2[i];
			j=j+1;
		}
		for(int m=0;i<b.length;i++)
		{
			System.out.println(b[m]);
		}
		
	}
	
	public int[] merge3(int a[],int start,int end)
	{
		if(start<end)
		{
			int mid=(start+end)/2;
			merge3(a,start,mid);
			merge3(a,mid+1,end);
			mergeSort(a,start,mid,end);
		}
		return a;
	}
	public void mergeSort(int a[],int start,int mid,int end)
	{
		int n1[]=new int[mid-start+1];
		int n2[]=new int[end-mid];
		int ans[]=new int[a.length];
		for(int i=0;i<n1.length;i++)
		{
			n1[i]=a[start+i];
			
		}
		for(int i=0;i<n2.length;i++)
		{
			n2[i]=a[mid+i+1];
			
		}
		int k=start;
		int i=0;int j=0;
		while(i<n1.length && j<n2.length)
			{if(n1[i]<=n2[j])
			{
				a[k]=n1[i];
				i++;
			}
			else
			{
				a[k]=n2[j];
				j++;
			}
			k++;
		}
	while(i<n1.length)
	{
		a[k]=n1[i];
		i++;
		k++;
	}
	while(j<n2.length)
	{
		a[k]=n2[j];
		j++;
		k++;
	}
	}
	
	public int[] quick3(int a[],int p,int r)
	{
		if(p<r)
		{
			int q=partition3(a,p,r);
			quick3(a,p,q-1);
			quick3(a,q+1,r);
		}
		return a;
	}
	public int partition3(int a[],int p,int r)
	{
		int pivot=a[r];
		int i=p-1;
		int temp;
		for(int j=p;j<=r-1;j++)
		{
			if(a[j]<=pivot)
			{
				i++;
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
		}
		temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
	}
	public static void main(String args[])
	{
		Sorting s=new Sorting();
		int a[]={10,9,8,7,6,5,4};
		int b[]=s.quick3(a,0,a.length-1);
		for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);
			}
			}
}
