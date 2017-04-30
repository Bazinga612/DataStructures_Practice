
import java.util.*;
public class RussianDolls {

	
	
	public static void main(String args[])
	{
		RussianDolls rd=new RussianDolls();
		int [][] envelopes={{5,4},{6,4},{6,7},{2,3}};
		ArrayList ab=new ArrayList<>();
		int count;
        if(envelopes.length==0)
		count=0;
		else
		count=1;
		int temp=0;
		Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
		for(int i=0;i<envelopes.length;i++)
		{
			System.out.println(envelopes[i][1]);
		}
		for(int i=0;i<envelopes.length-1;i++)
		{
			if(envelopes[i][1]<envelopes[i+1][1] && envelopes[i][0]!=envelopes[i+1][0] && envelopes[i][1]!=envelopes[i+1][1])
				{count++;
				ab.add(envelopes[i][1]);
				ab.add(envelopes[i+1][1]);
				temp=envelopes[i+1][1];
				}
				
			else
			{
				
					envelopes[i][1]=temp;
			}
		}
		System.out.println(count);
	}}