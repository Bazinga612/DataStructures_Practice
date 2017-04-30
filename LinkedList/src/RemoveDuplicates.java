import java.util.ArrayList;

public class RemoveDuplicates {

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
	}
	public Node reverse(Node node)
	{
		if(node==null ||node.next==null)
			return node;
		Node temp=head;
		Node p1=temp.next;
		head.next=null;
		while(temp!=null && p1!=null)
		{
			Node t=p1.next;
			p1.next=temp;
			temp=p1;
			p1=t;
		}
	
	return temp;
	}
	
	public Node reverse(Node node,int m,int n)
	{
		if(n<m)
			return null ;
		int count=1;
		Node initial=node;
		while(node.next!=null && count!=m)
		{
			node=node.next;
			count++;
		}
		Node p1=node;
		Node p2=p1.next;
		p1.next=null;
		while(p1!=null && p2!=null && count!=n)
		{
			Node t=p2.next;
			
			p2.next=p1;
			p1=p2;
			p2=t;
			count++;
		}
		Node temp=initial;
		while(initial.next!=null)
		{
			initial=initial.next;
		}
		initial=p1;
		
		
			return temp;
	}
	public Node remove(Node head)
	{
		Node current=head;
		Node p=head.next;
		while( p!=null)
		{
			if(current.data==p.data)
			{
				current.next=p.next;
				p=p.next.next;
			}
			else
			{
			current=p;
			p=p.next;
			}
		}
		return head;
	}
	public Node removeSorted2(Node head)
	{
		Node current=head;
		Node p=head.next;
		while( p!=null)
		{
			if(current.data==p.data)
			{
				int data=p.next.data;
				current.data=data;
				
				p=p.next.next;
			}
			else
			{
			current=p;
			p=p.next;
			}
		}
		return head;
	}
	public int count(Node head)
	{
		int count=1;
		while(head.next!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	public boolean hasCycle2(Node head)
	{
		ArrayList cycle=new ArrayList();
		while(head.next!=null)
		{
			if(cycle.contains(head.next.data))
				return true;
			else
				cycle.add(head.next.data);
		head=head.next;
		}
		return false;
	}
public Node getIntersectionNode(Node headA, Node headB) {
	Node firstrunner=headA;
	Node secondrunner=headB;
	while(firstrunner!=secondrunner)
	{
		while(firstrunner!=null || secondrunner!=null)
		{
		while(firstrunner==null
				
				)
		{
		firstrunner=firstrunner.next;
		
		}
		firstrunner=headB;
		while(secondrunner!=null)
		{
		secondrunner=secondrunner.next;
		
		}
		secondrunner=headA;
		}
		
		
		
	}
	if(firstrunner==secondrunner)
		return firstrunner;
	
	
	return null;
        
    }
public Node removeNthFromEnd(Node head, int n) {
        int count=count(head);
        count=count-n;
        Node current=head;
        while(count>1)
        {
        	current=current.next;
        	count--;
        }
        current.next=current.next.next;
        return head;
    }
	public boolean hasCycle(Node head) {
		Node one=head;
		Node two=head;
		while(two.next!=null && two.next.next!=null)
		{
			one=one.next;
			two=two.next.next;
			if(one==two.next)
				return true;
			
	}
		return false;
	}
	public boolean hasCycle3(Node head) {
       Node fast = head;
        Node slow = head;
 
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                return true;
        }
 
        return false;
    }
	public Node OddEvenList(Node node)
	{
		if(node==null|| node.next==null)
			return node;
		Node initial=node;
		Node p1=node;
		Node p2=node.next;
		Node connect=node.next;
		while(p1!=null && p2!=null)
		{
			Node t=p2.next;
			if(t==null)
				break;
			p1.next=p2.next;
			p1=p1.next;
			p2.next=p1.next;
			p2=p2.next;
		}
		p1.next=connect;
		return initial;
	}
	public Node merge(Node n1,Node n2)
	{
		if(n1==null && n2==null)
			return null;
		Node p1=new Node(0);
		Node p=p1;
		while(n1!=null && n2!=null)
		{
			if(n1.data<n2.data)
				
				{
				p.next=n1;
				n1=n1.next;
				}
				
			else
			{
				p.next=n2;
				n2=n2.next;
			}
			p=p.next;
		}
		while(n1!=null)
		{
			p.next=n1;
			n1=n1.next;
		}
		while(n2!=null)
		{
			p.next=n2;
			n2=n2.next;
			p=p.next;
		}
		return p1.next;
	}
	public Node removeAllDuplicates(Node node)
	{
		if(node==null || node.next==null)
			return node;
		Node f=new Node(0);
		f.next=node;
		Node p=f;
		while(f.next!=null && f.next.next!=null){
			if(f.next.data==f.next.next.data)
			{
				int temp=f.next.data;
				while(f.next!=null && f.next.data==temp)
				{
					f.next=f.next.next;
				}
				
			}
			else
			f=f.next;
		}
		return p.next;
		
	}
	public Node removeDuplicates(Node node)
	{
		if(node==null || node.next==null)
			return node;
		ArrayList a=new ArrayList();
		Node p=node;
		while(node.next!=null && node.next.next!=null)
		{
			
			if(a.contains(node.next.data))
			{
				node.next=node.next.next;
				node=node.next;
			}
			else
			{
				a.add(node.next.data);
				node=node.next;
			}
		}
		return p;
	}
	public static void main(String args[])
	{
		RemoveDuplicates i=new RemoveDuplicates();
	
		i.head=new Node(1);
		
		Node node2=new Node(2);
		Node node3=new Node(2);
		
		i.head.next=node2;
		node2.next=node3;
		

		
		Node node6=new Node(3);
		node3.next=node6;
		Node node7=new Node(4);
		Node node8=new Node(6);
		Node node9=new Node(7);
		
		node6.next=node7;
		node7.next=node8;
		node8.next=node9;
		//Node result=i.merge(i.head, node6);
		Node result=i.removeAllDuplicates(i.head);
		//i.hasCycle3(i.head);

		
		
				
		node7.next=node8;
		node8.next=node9;
		node9.next=null;
		
		//Node result=i.reverse(i.head);
		//Node result=i.reverse(i.head, 3, 5);
		//i.getIntersectionNode(i.head, node7);
		//i.head.print();
		//Node head=i.remove(i.head);
		//System.out.println(i.hasCycle2(i.head));
		//System.out.println(i.count(i.head));
		//System.out.println(i.removeNthFromEnd(i.head, 2));
		//Node result=i.OddEvenList(i.head);
	
	}
	}
