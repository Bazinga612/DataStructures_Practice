
public class StringtoInt {

	String unit[]={"one","two","three","Four","five","six","seven","eight","nine"};
	String tens1[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"
			};
	String tens2[]={"ten","eleven","twelve","thirteen","fourteen","fiteen","sixteen","seventeen","eighteen","nineteen","twenty"
	};

	
	String finalwords[];
	public int calculate(String s)
	{int unitvalue=0;
		int tensvalue=0;
		int finalvalue=0;
		System.out.println(s.split("\\s+").length);
		String words[]=s.split("\\s+");
		for(int i=0;i<unit.length;i++)
		{
			
			if(words[words.length-2].equals(tens2[i]))
			{
				tensvalue=i+1;
			}
			
		}
		if(tensvalue!=0)
		{
		for(int i=0;i<unit.length;i++)
		{
			
			if(words[words.length-1].equals(unit[i]))
			{
				unitvalue=i+1;
			}
		}
		}
		return tensvalue;
	}
	public static void main(String args[])
	{
		StringtoInt mw=new StringtoInt ();
		System.out.println(mw.calculate("One hundred thirty five"));
		
		
	}
}
