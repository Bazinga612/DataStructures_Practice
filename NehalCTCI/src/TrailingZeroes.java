
public class TrailingZeroes {

	public int countTrailingZeroes(int number)
	{ int count=0;
	
	while(number>0)
	{
		number=number/5;
		count=count+number;
	}
		return count;
	}
	
	public static void main(String args[])
	{
		TrailingZeroes tz=new TrailingZeroes();
		int result=tz.countTrailingZeroes(100);
		System.out.println(result);
	}
}
