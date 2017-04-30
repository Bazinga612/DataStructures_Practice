

public class LinkedListRecursion {

	
	Node head;
	static class Node
	{
		public Node(int i) {
			data=i;
			next=null;
			// TODO Auto-generated constructor stub
		}
		int data;
		Node next;
	}
	
	public Node reverse(Node n)
	{
		if(n.next==null)
		{
			return n;
		}
		else
		{
		
		reverse(n.next);
		System.out.println(n.data);
		return n;
		}
	}
	public static void main(String srgs[])
	{
		LinkedListRecursion lr=new LinkedListRecursion();
		Node head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		Node fourth=new Node(400);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		lr.reverse(head);
	}
	}

