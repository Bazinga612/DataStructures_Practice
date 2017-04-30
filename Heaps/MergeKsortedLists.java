package Heaps;
import java.util.*;
public class MergeKsortedLists {
	ArrayList<ListNode> a;
	static class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x)
		 { 
			 val = x; next = null; 
		 }
		 }
	
	public void mergeKLists(ArrayList<ListNode> a) 
	{
		Comparator<Integer> comp=new SortComparator();
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>(a.size(),comp);
		ArrayList<Integer> c=new ArrayList<>();
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			
			
			ListNode l=(ListNode) it.next();
			while(l!=null)
			{
				pq.add(l.val);
				l=l.next;
			}
			//System.out.println(l.val);
			
			/*c.add(l.val);
			while(l.next!=null)
			{
				
				l=l.next;
				pq.add(l);
				c.add(l.val);
				//System.out.println(l.val);
				
			}*/
			
		}
	/*	Iterator<Integer> it1=c.iterator();
		while(it1.hasNext())
		{
			pq.add(it1.next());
			//System.out.println(it1.next());
		}*/
		
		int at[]=new int[pq.size()];
		for(int i=0;i<at.length;i++)
		{
			at[i]=pq.poll();
			System.out.println(at[i]);
		}
		
	}
	public ListNode mergeKLists(ListNode[] lists) {
	    if(lists==null||lists.length==0)
	        return null;
	 
	    PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
	        public int compare(ListNode l1, ListNode l2){
	            return l1.val - l2.val;
	        }
	    });
	 
	    ListNode head = new ListNode(0);
	    ListNode p = head;
	 
	    for(ListNode list: lists){
	        if(list!=null)
	            queue.offer(list);
	    }    
	 
	    while(!queue.isEmpty()){
	        ListNode n = queue.poll();
	        p.next = n;
	        p=p.next;
	 
	        if(n.next!=null)
	            queue.offer(n.next);
	    }    
	 
	    return head.next;
	 
	}
	
	public int minMeetingRooms(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for(int i=0; i<starts.length; i++) {
            if(starts[i]<ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }
	public void mergeKLists(int a[][]) 
	{
		Comparator<Integer> comp=new SortComparator();
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>(a.length);
		
		
	/*	Iterator<Integer> it1=c.iterator();
		while(it1.hasNext())
		{
			pq.add(it1.next());
			//System.out.println(it1.next());
		}*/
		
		int at[]=new int[pq.size()];
		for(int i=0;i<at.length;i++)
		{
			at[i]=pq.poll();
			System.out.println(at[i]);
		}
		
	}
	public class SortComparator implements Comparator<Integer>
	{

		
		public int compare(Integer o1,Integer o2) {
			if(o1<o2)
				return -1;
			else if(o1>o2)
				return 1;
			else
			return 0;
		}
		
	}
	public static void main(String args[])
	{
		MergeKsortedLists m=new MergeKsortedLists();
		ListNode listNode1=new ListNode(1);
		
		ListNode listNode2=new ListNode(10);
		ListNode listNode3=new ListNode(20);
		ListNode listNode4=new ListNode(4);
		ListNode listNode5=new ListNode(11);
		ListNode listNode6=new ListNode(13);
		ListNode listNode7=new ListNode(3);
		ListNode listNode8=new ListNode(8);
		ListNode listNode9=new ListNode(9);
		listNode1.next=listNode2;
		listNode2.next=listNode3;
		listNode4.next=listNode5;
		listNode5.next=listNode6;
		listNode7.next=listNode8;
		listNode8.next=listNode9;
		ArrayList a=new ArrayList<>();
		a.add(listNode1);
		a.add(listNode4);
		a.add(listNode7);
		int one[]={1,3,5,7};
		int two[]={2,4,6,8};
		int three[]={0,9,10,11};
		
		m.mergeKLists(new ListNode[]{listNode1,listNode4,listNode7});
		//m.mergeKLists(a);
		//m.mergeKLists(new int [][]{one,two,three});
		
	}
}
