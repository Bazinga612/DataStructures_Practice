import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
import java.nio.charset.StandardCharsets;
import java.util.regex.*;
public class Anagaram {

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
    public boolean isAnagram(String s, String t) {
        int s1[]=new int[s.length()];
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        int t1[]=new int[t.length()];
        if(t.length()==s.length())
        {
        for(int i=0;i<s.length();i++)
        {
            s1[i]=(int)ch[i];
        }
        for(int i=0;i<t.length();i++)
        {
            t1[i]=(int)ch1[i];
        }
        sort(s1);
        sort(t1);
        for(int i=0;i<s.length();i++)
        {
            if(s1[i]!=t1[i])
            return false;
            
        }
        return true;
    }
    
    else
    return false;
    }


	
		public static void main(String args[])
	{
			String ar[]={"cat","god","dog","tca"};
			HashMap hm=new HashMap();
			
			for(int i=0;i<ar.length;i++)
			{
				int value=0;
				for(int j=0;j<ar[i].length();j++)
				{
					
					int ch=(int)ar[i].charAt(j);
					value=value+ch;
					System.out.println(value+""+ar[i].charAt(j));
					
				}
				if(hm.get(value)==null)
				{
				hm.put(value, i);
				}
				else
				{
					System.out.println("anagram exists,"+i+"and"+hm.get(value));
				}
			}
			
	}
	}