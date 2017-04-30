import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;
import java.lang.Math;
public class PossiblePaths {
	
public static void main(String args[])
	{
	int n=3;
	int m=3;
	
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				/*if(i+j==m+n-2)
				{
					
				}*/
				int a=i-j;
				
				if(Math.abs(a)==2)
				System.out.print("("+i+","+j+") >>");
				
			}
		}
			
	}
	}

