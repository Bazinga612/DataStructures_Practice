package DynamicProgramming;

public class Rob {

	public int findMaxForm(String[] strs, int m, int n) {
	    int[][] dp = new int[m+1][n+1];
	    for (String s : strs) {
	        int[] count = count(s);
	        for (int i=m;i>=count[0];i--) 
	            for (int j=n;j>=count[1];j--) 
	                dp[i][j] = Math.max(1 + dp[i-count[0]][j-count[1]], dp[i][j]);
	    }
	    return dp[m][n];
	}
	    
	public int[] count(String str) {
	    int[] res = new int[2];
	    for (int i=0;i<str.length();i++)
	        res[str.charAt(i) - '0']++;
	    return res;
	 }
	
	public int rob(int[] num) {
	   int [][]dp=new int[num.length+1][2];
	   for(int i=1;i<=num.length;i++)
	   {
		   dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1]);
		   dp[i][1]=dp[i-1][0]+num[i-1];
	   }
	   return Math.max(dp[num.length][0],dp[num.length][1]);
	}
	public int minPathSum(int[][] grid) {
	    if(grid == null || grid.length==0)
	        return 0;
	 
	    int m = grid.length;
	    int n = grid[0].length;
	 
	    int[][] dp = new int[m][n];
	    dp[0][0] = grid[0][0];    
	 
	    // initialize top row
	    for(int i=1; i<n; i++){
	        dp[0][i] = dp[0][i-1] + grid[0][i];
	    }
	 
	    // initialize left column
	    for(int j=1; j<m; j++){
	        dp[j][0] = dp[j-1][0] + grid[j][0];
	    }
	 
	    // fill up the dp table
	    for(int i=1; i<m; i++){
	        for(int j=1; j<n; j++){
	            if(dp[i-1][j] > dp[i][j-1]){
	                dp[i][j] = dp[i][j-1] + grid[i][j];
	            }else{
	                dp[i][j] = dp[i-1][j] + grid[i][j];
	            }
	        }
	    }
	 
	    return dp[m-1][n-1];
	}
	public int climbStairs(int n) {
        int [][]stairs=new int[2][n+1];
        stairs[0][0]=0;
        stairs[1][0]=0;
        for(int i=1;i<=n;i++)
        {
            stairs[0][i]=1;
        }
        for(int i=0;i<=n;i++)
        {
            if(i<2)
            stairs[1][i]=1;
            
            else
            stairs[1][i]=stairs[1][i-1]+stairs[1][i-2];
        }
        return stairs[1][n];
    }
	 public int numDecodings(String s) {
	        
	        if(s.length()==0)
		        return 0;
	        int[] decode=new int[s.length()];
	        if(s.charAt(0)!='0')
		        decode[0]=1;
		        else
		        decode[0]=0;
	        
	        for(int i=1;i<s.length();i++)
	        {
	        	 if(Integer.parseInt(s.substring(i-1,i+1))>=01 && Integer.parseInt(s.substring(i-1,i+1))<27 &&s.charAt(i)!='0')
	            decode[i]=decode[i-1]+1;
	            else
	            decode[i]=decode[i-1];
	        }
	        return decode[s.length()-1];
	    }
	public static void main(String args[])
	{
		
			//d.countHi("xxhixx");
			
		Rob r=new Rob();
		String s="sa@pa@u";
		String u="GOOGLE";
		String t="Yahoo";
		int num[]={3,5,1,4,6,3};
		//System.out.println(r.rob(num));
		//System.out.println(r.climbStairs(5));
		//System.out.println(r.numDecodings("10"));
		//System.out.println(s.split("@"));
		String ab[]=s.split("@");
		int [][] grid={{4,3,2,6},{7,4,3,2}};
		//r.minPathSum(grid);
		String a[]={"10", "0001", "111001", "1", "0"};
		System.out.println(r.findMaxForm(a, 5, 4));
	
	}
}
