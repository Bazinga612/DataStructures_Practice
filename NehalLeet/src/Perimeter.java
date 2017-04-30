
public class Perimeter {
int [][]m;
	Perimeter(int [][] ar)
	{
		m=ar;
	}
	
	public void calculate(int [][] ar)
	{
		int [][]mat=ar;
		int perimeter=0;
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[0].length;j++)
			{
				temp=ar[i][j];
				if(temp==1)
				{
					if(i==0||j==0)
					{
						if(a[i+1][j]==)
					}
				}
			}
		}
	}
	public static void main(String arg[])
	{
		int ar[][]={{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		Perimeter pr=new Perimeter(ar);
	}
}
