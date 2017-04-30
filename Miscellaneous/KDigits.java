import java.util.*;
public class KDigits {

	Hashtable ht=new Hashtable();
	ArrayList<int[]> al=new ArrayList<>();

	 public int eraseOverlapIntervals(int[][] intervals) {
		 Arrays.sort(intervals,(a, b) -> a[0] - b[0]); 
		 for(int i=0;i<intervals.length;i++)
		 {
			 al.add(intervals[i]);
		 }
		 int initi=al.size();
		 int[] temp=new int[1];
		 int[] temp1=new int[1];
		 for(int i=0;i<al.size()-1;i++)
		 {
			 temp=al.get(i);
			 temp1=al.get(i+1);
			 if(temp[1]>temp1[0])
				 {al.remove(i+1);
			 	 i--;}
		 }
		 int later=al.size();
		 return (initi-later);
	 }
	 
	 public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {
		
		StringBuilder bw=new StringBuilder();
		StringBuilder ew=new StringBuilder();
		for(int i=0;i<beginWord.length();i++)
		{
			
			bw.append(beginWord.charAt(i));
		}
		for(int i=0;i<endWord.length();i++)
		{
			
			ew.append(endWord.charAt(i));
			
		}
		List<String> inner=new ArrayList<>();
		List<List<String>> outer=new ArrayList<>();
		ArrayList words=new ArrayList();
		int l_wordlist=wordList.size();
		
		char first=endWord.charAt(0);
		char second=endWord.charAt(1);
		char third=endWord.charAt(2);
		//add words to dictionary
		for(int i=0;i<endWord.length()-1;i++)
		{
			Iterator<String> it=wordList.iterator();
		while(it.hasNext())
		{
			String s=it.next();
			
			words.add(s.substring(i, i+1));
			
			
			
		}
		}
		for(int i=0;i<ew.length();i++)
		{
			
				for(int j=0;j<l_wordlist;j++)
					{
					if(bw.charAt(i)!=ew.charAt(i))
					bw.replace(i, i+1, (String) words.get(j));
					
					System.out.println(bw);
					}
				
			}

		
		
		
		
		
	        return null;
	    }
	 
	public int findMinArrowShots(int[][] points) {
        
	    Arrays.sort(points,(a, b) -> a[0] - b[0]); 
	    int count=0;
	    
	    int min_length=Integer.MAX_VALUE;
	    int temp=min_length;
	    for(int i=0;i<points.length;i++)
	    {
	        
	        if(points[i][0]<temp)
	        {
	        	
	            count++;
	            
	        }
	        else if(points[i][0]>temp)
	        {
	        	count=count+1;
	        }
	        temp=points[i][1];
	    }
	    return count;
	    }
	public void generate(String num)
	{
		char ch[]=num.toCharArray();
		int arr[];
		StringBuilder s=new StringBuilder() ;
		for(int i=ch.length-1;i>=0;i--)
		{
			s.append(ch[i]);
			
		}
		for(int i=0;i<s.length();i++)
		{
			
		}
		
		
	}
	public static void main(String args[])
	{
		KDigits kd=new KDigits();
		//kd.generate("1432219");
		int points[][]={{1,2},{2,3},{3,4},{1,3}};
		//System.out.println(kd.findMinArrowShots(points));
		//System.out.println(kd.eraseOverlapIntervals(points));
		HashSet<String> wordList=new HashSet();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		kd.findLadders("hit", "cog", wordList);
}
}
