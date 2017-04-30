package Linkedlist;

import java.util.Scanner;

import Linkedlist.Implementation.Node;

public class InsertionDeletion {
	

		static Node head;
		static class Node
		{
			public Node(int i) {
				// TODO Auto-generated constructor stub
				data=i;
			}
			int data;
			Node next;
			
			
			
		}
		public void insertAtPosition(int position)
		{
			
			Node new_node=new Node(5);
			Node temp=head;
			
			int new_p=position-1;
			while(new_p!=0)
			{
				System.out.println(temp.data);
				temp=temp.next;
				new_p--;
				
			}
			new_node.next=temp;
			
			System.out.println(new_node.data);
			System.out.println(new_node.next.data);
			
			
				
			}
		public void insert(int position)
		{
			switch(position)
			{
			case 1:
			{
				Node new_node=new Node(1);
				new_node.next=head;
				head=new_node;
				System.out.println(head.data);
				
			
				break;
			}
			case 2:
			{
				Node new_node=new Node(5);
				Node temp=head;
				System.out.println(head.data);
				int new_p=position-2;
				while(new_p!=0)
				{
					temp=temp.next;
					new_p--;
					System.out.println(temp.data);
				}
				new_node.next=temp;
				
				System.out.println(new_node.data);
				
				
			
				break;
			}
			case 3:
			{
				Node last=head;
				System.out.println(head.data);
				while(last.next!=null)
				{
				last=last.next;
				System.out.println(last.data);
				}
				last.data=4;
				System.out.println(last.data);
				
				break;
			}
			
			}
		}
		public void deleteAtPosition(int position)
		{
			Node temp=head;
			int new_p=position-1;
			while(new_p!=0)
			{
				System.out.println(temp.data);
				temp=temp.next;
				new_p--;
				
			}
			new_node.next=temp;
			
			System.out.println(new_node.data);
			System.out.println(new_node.next.data); 
		}
		public void delete(int position)
		{
			switch(position)
			{
			case 1:
				break;
			case 2:
			{
				
				break;
			}
			case 3:
				break;
			}
		}
		public static void main(String args[])
		{
			InsertionDeletion i=new InsertionDeletion();
			InsertionDeletion.head=new Node(1);
			
			Node second=new Node(2);
			Node third=new Node(3);
			second.next=third;
			i.head.next=second;
			Scanner scan=new Scanner(System.in);
			String position=scan.nextLine();
	i.insertAtPosition(Integer.parseInt(position));
	i.deleteAtPosition(Integer.parseInt(position));		
			
}
	}
