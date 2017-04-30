import java.util.Arrays;
import java.util.Scanner;
/*scan the array from right-to-left
if the current element is less than its right-hand neighbor
call the current element the pivot
stop scanning
if the left end was reached without finding a pivot
reverse the array (permutation was lexicographically last, so start over)
return
scan the array from right-to-left again
if the current element is larger than the pivot
call the current element the successor
stop scanning
swap the pivot and the successor
reverse the portion of the array to the right of where the pivot was found
return*/
public class NQueens {

	static void nextPermutation(int[] A)
	{
		
		int pivot_index = Integer.MAX_VALUE;
		int successor_index=0;
		
		
		/*for(int i=A.length-2;i>=0;i--)
		{
			if(i!=A.length-1 && A[i]<A[i+1])
				{;
			pivot_index=i;
			continue;
			}
			if(pivot_index==Integer.MAX_VALUE)
			{
				for(int j=0;i<A.length/2;j++)
				{
					int temp=A[j];
					A[i]=A[(A.length/2)-j];
					A[(A.length/2)-i]=temp;
				}
			}
		}*/
		
		for(int i=A.length-2;i>=0;i--)

		{
			if(A[i]<A[i+1])
			{
	pivot_index=i;break;}}
		
	for(int j=A.length-1;j>0;j--)
	{
		if(A[j]>A[pivot_index])
			{successor_index=j;
		break;}
	}
	
	swap(A,pivot_index,successor_index);
	reverse(A,pivot_index);
	
	print(A);
	

	}			
		
		
	static void reverse(int A[],int pivot_index)
	{
		int l=A.length-1;
		int m=(l-pivot_index)/2;
		for(int k=pivot_index;k<=m;k++)
		{
			int temp1=A[k]+1;
			A[k+1]=A[l-k];
			A[l-k]=temp1;
		}
	}
	
	static void swap(int A[],int pivot_index,int successor_index)
	{
		int temp=A[pivot_index];
		A[pivot_index]=A[successor_index];
		A[successor_index]=temp;
	}
	static void print(int []A)
	{
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]);
		}
		System.out.println();
	}
	/*static boolean isSolution(int[] A)
	{
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				if(i!=j)
				{
					if(Math.abs(A[i]-A[j])==Math.abs(i-j))
						return false;
				}
			}
		}
				return true;
	}*/
	public static void main(String args[])
	{
		/*System.out.println("Enter number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();*/
		int A[]={1,2,3,4};
		int count=0;
		int C[]=new int[A.length];
		for(int i=0;i<A.length;i++)
		{
			C[i]=A[i];
		}
		//nextPermutation(A);
		//print(C);
		//while(!Arrays.equals(A, C))
		//{
		//nextPermutation(A);
		//}
		for(int i=0;i<args.length;i++)
		{
			if(args[i].equals("-v"))
			{
				System.out.println("yes");
				break;
			}
		}
		/*for(int j=0;j<A.length;j++)
		{
			nextPermutation(A);
			if(isSolution(A)==true)
			{	count++;
			System.out.println();}
		}*/
		//System.out.println(count);
		
		int B[]={1,3,5,2,4};
		//System.out.println(isSolution(B));
	}
}
