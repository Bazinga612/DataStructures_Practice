package OnePoint;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MissingNumber {
	
	public  ArrayList find(int a[]){		
		int value=0;
		int length=a.length;
		sort(a);
		ArrayList output11 = new ArrayList(Arrays.asList(a)); 
		ArrayList output12 = new ArrayList(); 
		int output1[]={};
		int value1=a[a.length-1];
		for(int i=0; i < a.length - 1;i++)
		{		
			if(a[i+1]!=a[i]+1)
			{
				for(int j = a[i] + 1; j < a[i+1]; j++){
					output12.add(j);					
				}				
			}
		}
		return output12;
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
	
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		MissingNumber ms=new MissingNumber();
		
		FileInputStream fis = new FileInputStream("C:/Users/Varsha/Desktop/PracticeInputInt3.txt");
		 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		int m = Integer.parseInt(br.readLine());
		
		String[] outputp = new String[m];
		int z = 0;
		
		for(int i = 0; i < m; i++){
			StringBuffer op = new StringBuffer();
			String line = br.readLine();
			String[] inputLineString = line.split("\\s+");
			int[] inputLine = new int[inputLineString.length];
			for(int j = 0; j < inputLineString.length; j++){
				inputLine[j] = Integer.parseInt(inputLineString[j]);
			}
			ArrayList answer = (ArrayList)ms.find(inputLine);
			Iterator itr = answer.iterator();
			
		    while (itr.hasNext()) {
		    	op.append(itr.next());
		    	op.append(" ");
		    }
		    outputp[z++] = op.toString(); 
		}
		
		for(int g = 0; g < m; g++)
			System.out.println(outputp[g]);
		System.out.println();
		
	}

}
