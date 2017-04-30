public class Solution {
    
    public static int[] twoSum(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                	int a[]={i,j};
                   
                    return a;
                    
                }
            }
        }
		return null;
    }
    
    public static void main(String args[])
    {
    	int [] nums={3,2,4};
    	int[] answer=twoSum(nums,6);
    	System.out.println();
    }
}