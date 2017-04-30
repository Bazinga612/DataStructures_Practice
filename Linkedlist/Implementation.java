package Linkedlist;

public class Implementation {

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
	public static void main(String args[])
	{
		Implementation i=new Implementation();
		i.head=new Node(1);
		
		Node second=new Node(2);
		second.next=null;
		
		i.head.next=second;
		System.out.println(i.head.data);
		System.out.println(second.data);
		
		
	}
	}

