package Queues;

public class Implementation {

	int ar[]=new int[4];
	int top=-1;
	int rear=0;
	public void enqueue(int newElement)
	{
		if(top<3)
		{
			top++;
			ar[top]=newElement;
			
			System.out.println("pushed element"+ar[top]);
			if(top==3)
			
				System.out.println("overflow!");
			
		}
		}
		public void dequeue()
		{
			if(top>rear)
			{
				rear++;
				
				System.out.println("ppopped element"+ar[rear-1]);
				if(rear==-1)
				{
					System.out.println("underflow!");
				
				}
			}
			
	}
		public void print()
		{
			for (int i=rear;i<=top;i++)
			{
				System.out.println(ar[rear]);
			}
		}
		
		public static void main(String args[])
		{Implementation i=new Implementation();
		i.enqueue(0);
		i.enqueue(1);
		i.enqueue(2);
		i.enqueue(3);
		i.enqueue(4);
			i.dequeue();
			i.dequeue();
		}
}
