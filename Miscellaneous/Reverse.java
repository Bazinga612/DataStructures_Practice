import java.util.Scanner;

public class Reverse {

	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		int inv=Integer.parseInt(in.nextLine());
		int[] temp = null;
		temp[0]=inv%10;
	
		for(int i=1;inv>1;i++)
	{
		inv=inv/10;
		temp[i]=inv;
	}
	
		
	for(int num:temp)
	{
		System.out.println(num);
	}
		
	
}
}
