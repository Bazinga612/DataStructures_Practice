package Linkedlist;

public class DoublyLinkedList {

	static Node head;
	static class Node
	{
		Node next;
		Node prev;
		int data;
		Node(int value)
		{
			data=value;
			next=null;
			
		}
		 void print()
		{
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
		 void addAtFront(int value)
		 {
			 Node temp=head;
			 Node newvalue=new Node(value);
			 newvalue.next=temp;
			 newvalue.prev=null;
			 temp.prev=newvalue;
			 head=newvalue;
			 
			 //print();
			 
		 }
		 
		 void addAtEnd(int value)
		 {
			 Node temp=head;
			 while(temp.next!=null)
			 {
				 temp=temp.next;
			 }
			 Node newvalue=new Node(value);
			 temp.next=newvalue;
			 newvalue.prev=temp;
			 //print();
		 }
		 
		 void addAtAnywhereElse(int position,int value)
		 {
			 
			 Node temp=head;
			 int finalp=position-1;
			 int i=0;
				 while(i!=finalp)
				 {i++;
					 temp=temp.next;
					
					 
				 }
				 Node newtemp=new Node(value);
				 newtemp.prev=temp;
				 newtemp.next=temp.next;
				 temp.next=newtemp;
				 print();
			 
		 }
	}
	public static void main(String args[])
	{
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.head=new Node(1);
		dll.head.prev=null;
		
		Node second=new Node(2);
		Node third=new Node(3);
		dll.head.next=second;
		second.prev=head;
		
		second.next=third;
		third.prev=second;
		dll.head.addAtFront(4);
	dll.head.addAtEnd(5);
	dll.head.addAtAnywhereElse(3, 6);
		//System.out.println(head.next.data);
		
		
	}
}
