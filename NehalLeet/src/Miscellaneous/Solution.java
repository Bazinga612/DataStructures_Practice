package Miscellaneous;

import java.util.ArrayList;
import java.util.List;
public class Solution {
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


public List<List<String>> groupAnagrams(String[] strs) {
int[] stringarraylength=new int[strs.length];
List<String>inner;
List<List<String>> outer=new ArrayList<List<String>>();
for(int i=0;i<strs.length;i++)
{
    stringarraylength[i]=strs[i].length();
}
if(strs.length==0)
{
    inner=new ArrayList<String>();
    
    //outer.add(inner);
    return outer;
}
else
{
for(int i=0;i<stringarraylength.length;i++)
{
    for(int j=0;i<stringarraylength.length;i++)
{
    if(i!=j)
    {
        if(isAnagram(strs[i],strs[j]))
        {
            inner=new ArrayList<String>();
            inner.add(strs[i]);
            inner.add(strs[j]);
            outer.add(inner);
            
        }
        
}
}
}

return outer;
}
}
public static void main(String args[])
{
	Solution s=new Solution();
	String[] strs={"cat","dog","tac","god"};
	s.groupAnagrams(strs);
}
}