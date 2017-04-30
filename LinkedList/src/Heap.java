import java.util.Comparator;
import java.util.PriorityQueue;



public class Heap {

	public int findKthLargest(int[] nums, int k) {
		Comparator<Integer>queue=new MaxComparator();
	    PriorityQueue<Integer> q = new PriorityQueue<>(k, queue);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}
	public class MaxComparator implements Comparator<Integer>
	{

		@Override
		public int compare(Integer o1, Integer o2) {
		if(o1>o2)
			return -1;
		else if(o1<o2)
			return 1;
			else
			return 0;
		}
		
	}
	public static void main(String arg[])
	{
	Heap h=new Heap();
	int a[]={10,1,6,7,8,52};
	int result=h.findKthLargest(a, 3);
	}
}
