package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;



public class Solution {
	static class ListNode {
		 public int val;
		 public ListNode next;
		 ListNode(int x)
		 { 
			 val = x; next = null; 
		 }
		 }
	
    public ListNode mergeKLists(List<ListNode> lists) {
        if(lists.size() == 0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(11, new ListNodeComparer());
        for(ListNode node: lists) {
            if(node != null)
                queue.add(node);
        }
        if(queue.isEmpty())
            return null;

        ListNode result = queue.poll();
        if(result.next != null)
            queue.add(result.next);

        ListNode cur = result;

        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            if(node.next != null) {
                queue.add(node.next);
                node.next = null;
            }
            cur.next = node;
            cur = cur.next;
        }

        return result;
    }

    private class ListNodeComparer implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return Integer.compare(o1.val, o2.val);
        }
    }
	public static void main(String args[])
	{
		Solution m=new Solution();
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
		m.mergeKLists(a);
		
	}
}