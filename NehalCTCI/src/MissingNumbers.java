import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MissingNumbers {
	
	public  ArrayList find(int a[])
	{
		
		int value=0;
		int length=a.length;
		sort(a);
		
		//List output=(List) Arrays.asList(a);
		ArrayList output11 = new ArrayList(Arrays.asList(a)); 
		ArrayList output12 = new ArrayList(); 
		int output1[]={};
		System.out.println(a[a.length-1]);
		int value1=a[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
		
			if(a[i+1]!=a[i]+1)
			{
				for(int j=a[i];j<a[i+1];j++)
				
				{
					output12.add(j+1);
					
				}
				//output1=a[i]+1;
				
			}
		}
		
		return output12;
	}
	void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead               of their current position */
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
		MissingNumbers ms=new MissingNumbers();
		Scanner in=new Scanner(System.in);
		int a1[]={17,5,3,2,1};

		ArrayList answer=(ArrayList)ms.find(a1);
		while(answer.iterator().hasNext())
		{
			System.out.println(answer.iterator().next());
		}
		
		
		
		
		
	}

}
