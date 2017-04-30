import java.util.Stack;

public class Pattern {

	public boolean findPattern(int nums[])
	{
		Stack s=new Stack();
		boolean flag=false;
		for(int i=0;i<nums.length-1;i++)
		{
			s.push(nums[i]);
			if(flag==false && nums[i+1]>(int)s.peek())
			{
				s.push(nums[i+1]);
				flag=true;
				
			}
			
			else if(flag==true && nums[i+1]<(int)s.peek())
			{
				return true;
			}
			
		}
		return false;
	}
	public static void main(String args[])
	{
		Pattern p=new Pattern();
		int nums[]={1,3,2};
		System.out.println(p.findPattern(nums));
	}
}
