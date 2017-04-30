package dp;

public class CoinChange {

	public int count(int []ar,int m,int n)
	{
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if (m <=0 && n >= 1)
	        return 0;
		System.out.println(m+","+n);
		return count( ar, m - 1, n ) + count( ar, m, n-ar[m-1] );
		
	}

	public static void main(String args[]){
		CoinChange c =new CoinChange();
		int ar[]={1,2,3};
		System.out.println(c.count(ar, 3,4));
		
	}
}
