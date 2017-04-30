package Queues;

public class ImplementationLinkedList {

	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int value)
		{
			data=value;
			next=null;
		}
		
		public void enqueue(int node)
		{
			Node temp=head;
			Node newnode=new Node(node);
			while(temp.next!=null)
			{
				
				temp=temp.next;
				
			}
			temp.next=newnode;
			print();
		
			System.out.println("new node added is"+newnode.data);
		}
	}
	public static void print()
	{
		Node temp=head;
		
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
			
		}
	}
	public void dequeue()
	{
		Node temp=head.next;
		head=temp;
		print();
		
	}
	public static void main(String args[])
	{
		ImplementationLinkedList il=new ImplementationLinkedList();
		il.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		il.head.next=second;
		second.next=third;
		il.head.enqueue(4);
		il.dequeue();
	}
}
