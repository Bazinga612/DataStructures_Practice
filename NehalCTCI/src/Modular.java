import java.util.Scanner;

public class Modular {

	
	
	public static void main(String args[])
	{
		Modular md=new Modular();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x");
		int x=in.nextInt();
		System.out.println("Enter y");
		int y=in.nextInt();
		System.out.println("Enter z");
		int z=in.nextInt();
		int m=1;
		if(x>0)
			x=x%z;
		else
			x=z+x;
			System.out.println(x);
			y=y%z;
			System.out.println(y);
			for(int i=0;i<y;i++)
			{
				m=m*x;
			}
		System.out.println(m);
		System.out.println(m%z);
		
	}
}
