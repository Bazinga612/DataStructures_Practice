import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2
{
	public static void main(String args[])
{
	 Scanner scan = new Scanner(System.in);
     int n = Integer.parseInt(scan.nextLine());
     String[] array = scan.nextLine().split("");
     String temp=null;
		int count=array.length-1;
		for(int i=0;i<(array.length/2);i++)
		{
			
			temp=array[i];
			array[i]=array[count-i];
			
			array[count-i]=temp;
		}        
        for(String t :array)
	{
	System.out.println(t);
	}
}
}