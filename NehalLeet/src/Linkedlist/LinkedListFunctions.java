package Linkedlist;

import java.util.Stack;

public class LinkedListFunctions {
	static Node head;
	
	static class Node
	{
		Node next;
		int data;
		Node(int position)
		{
			data=position;
			next=null;
		}
		public int countOfLinkedlist()
		{
			int count=1;
			Node temp=head;
			while(temp.next!=null)
			{
				count++;
				temp=temp.next;
				
			}
			return count;
		}
		public void swap(int a,int b)
		{
			Node temp=head;
			if((head.data==a)||(head.data==b))
			{
				if(head.data==a)
				{
					Node new1=temp;
					int data=new1.data;
					Node next=new1.next;
					while(temp.next!=null)
					{
						if(temp.data==b)
						{
							Node new2=temp;
							
							new1.next=new2.next;
							
							new2.next=next;
							new2.data=data;
							
							
						}
						temp=temp.next;
						
				}
					
			}
				
			
		}
			System.out.println(head.data);
			print();
		}
		public void print()
		{
			Node temp=head;
			while(temp.next!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}
	public Node addTwoNumbers(Node l1, Node l2) {
        Stack s=new Stack();
        Node node=null;
        int value=0;
        int temp=0;
        while(l1!=null || l2!=null)                  
        {
            if(l1==null && l2!=null)
            { temp=l2.data;
            
        	
        	temp=temp+value;
        	if(value!=0)
            s.push((temp)%10);  
                else
                s.push(temp%10);
        	value=temp/10;
        	
                                          
            l2=l2.next;  }
            else if (l1!=null && l2==null)
           { temp=l1.data;
          
        	
           temp=temp+value;
        	if(value!=0)
            s.push((temp)%10);  
                else
                s.push(temp%10);
        	value=temp/10;
        	
            l1=l1.next;                              
           }
        	else if(l1!=null && l2!=null) 
        	{temp=l1.data+l2.data;  
        	
        	temp=temp+value;
        	if(value!=0)
            s.push((temp)%10);  
                else
                s.push(temp%10);
        	value=temp/10;
        	
            l1=l1.next;                              
            l2=l2.next;   }                           
        }                                            
               if(value!=0)
               s.push(1);
        while(!s.isEmpty())                          
        {                                            
        	node=new Node((int)s.pop());             
              node.next=head;                        
              head=node;                             
                                                     
        }                                            
                                                       
        
        while(!s.isEmpty())
        {
        	node=new Node((int)s.pop());
              node.next=head;
              head=node;
             
        }
       return node;
	}
public Node oddEvenList(Node head) {
        Node odd=head;
        Node even=null;
        Node temp=head;
        while(odd.next.next!=null && odd.next!=null)
        {
        	if(even==null)
        		even=head;
        	temp=odd.next;
        	odd.next=even.next.next;
        	
        }
        return odd;
    }
public Node swapPairs(Node head) {
	Node dummy=new Node(0);
	dummy.next=head;
    if(head==null)
    return null;
    Node current=dummy;
    boolean result=false;
    while (current.next != null && current.next.next != null) {
        Node first = current.next;
        Node second = current.next.next;
        first.next = second.next;
        current.next = second;
        current.next.next = first;
        current = current.next.next;
    }
    
    return dummy.next;
}
public Node reverseList(Node head) {
    Node dummy=new Node(0);
    dummy.next=head;
    Node current=dummy;
    Node prev=null;
    Node next=head;
    while(current.next!=null && current.next.next!=null)
    {
    	prev=current.next.next;
    	
    }
    return dummy.next;
}
Node reverse(Node head) {
    Node previous = null;
    Node current = head;
    Node forward;
 
    while (current != null) {
        forward = current.next;
        current.next = previous;
        previous = current;
        current = forward;
    }
 
    return previous;
}
	public static void main(String args[])
	{
		LinkedListFunctions i=new LinkedListFunctions();
		
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		i.head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		//Node head1=i.swapPairs(node1);
		Node head1=i.reverse(i.head);
		//i.head.print();

		
		
		/*Node node2=new Node(9);
		Node node3=new Node(4);
		Node node4=new Node(1);
		node2.next=node3;
		node3.next=node4;
		node4.next=null;
		//i.head.print();

		
		Node node5=new Node(9);
		Node node6=new Node(9);
		Node node7=new Node(4);
		node5.next=node6;
		node6.next=null;
		node7.next=null;*/
		Node result=i.oddEvenList(i.head);
      //i.addTwoNumbers(node4, node5);		
	}
}

