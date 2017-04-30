import java.util.Scanner;

public class Array1 {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[3][3];
        for(int arr_i=0; arr_i < 3; arr_i++){
            for(int arr_j=0; arr_j < 3; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int total=0;
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		
        			total=total+arr[i][j];
        		
        	}
        }
    	System.out.print("total"+total);
for(int[] s:arr)
{
	for(int st:s)
	{

	System.out.print(st);
}
}
	}
	

}
