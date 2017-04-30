
public class TopSecret2 {

	public String calculate(String input)
	{
		String finalresult="";
		String output="";
		String tempresult="";
		String driver="";
		String bifurcated[]=input.split("\\|");
		for(int i=0;i<bifurcated[0].length();i++)
		{
			if(((int)bifurcated[0].charAt(i)>=97 && (int)bifurcated[0].charAt(i)<=122)||((int)bifurcated[0].charAt(i)>=65 && (int)bifurcated[0].charAt(i)<=90))
			{
				tempresult=tempresult+bifurcated[0].charAt(i);
			}
		}
		for(int i=0;i<tempresult.length();i++)
		{
			if(i>=bifurcated[1].length())
			{
				driver=driver+String.valueOf(bifurcated[1].charAt(i%bifurcated[1].length()));
				
			}
			else
			{
			driver=driver+String.valueOf(bifurcated[1].charAt(i));
			}
		}
		
		for(int i=0;i<tempresult.length();i++)
		{
			if(tempresult.charAt(i)>=97||tempresult.charAt(i)>=122)
			{
				
				int ab=(char) ((char) ((int)tempresult.charAt(i)+(int)driver.charAt(i))-65);
				if(ab>122)
					ab=ab-26;
				char a=(char)(ab);
				
				finalresult=finalresult+a;
				
			}
			else if(tempresult.charAt(i)>=65||tempresult.charAt(i)>=90)
			{
				
				int ab= ((int)tempresult.charAt(i)-65+(int)driver.charAt(i)-65)+65;
				if(ab>90)
					ab=ab-26;
				char a=(char)(ab);
				finalresult=finalresult+a;
				
			}
			
		}
		
		for(int i=0;i<bifurcated[0].length();i++)
		{
			System.out.println(bifurcated[0].charAt(i));
			if(((int)bifurcated[0].charAt(i)>=97 && (int)bifurcated[0].charAt(i)<=122)||((int)bifurcated[0].charAt(i)>=65 && (int)bifurcated[0].charAt(i)<=90))
			{
				output=output+finalresult.charAt(0);
				finalresult=finalresult.substring(1, finalresult.length());
				
			}
			else
			{
				output=output+bifurcated[0].charAt(i);
			}
			
		}
		
		return output;
	}
	public static void main(String args[])
	{
		TopSecret2 ts=new TopSecret2();
		System.out.println(ts.calculate("GOOD--BYEh|HELLO"));
		System.out.println((int)'-');
	}
}
