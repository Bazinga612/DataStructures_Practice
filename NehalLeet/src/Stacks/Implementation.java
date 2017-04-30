package Stacks;

public class Implementation {
	
	int top=-1;
	int size=10;
	int arr[]=new int[size];
	public void push(int n)
	{
		if(top!=size-1)
		{
			
			int count=arr.length;
			arr[++top]=n;
			System.out.println(n+"added");
		}
		else
		{
			System.out.println("overflow");
		}
	}
	public int pop()
	{int ar=0;
	if(arr.length!=0)
	{
		System.out.println("underflow");
		int count=arr.length;
		ar=arr[top--];
		
	}
	
		return ar;
	}
	
	public int peek()
	{
		int n=arr[top];
		System.out.println(n);
		return n;
		
	}

	public void display()
	{
		for(int ar:arr)
		{
			System.out.println(ar);
		}
		
	}
	public static void main(String args[])

		{Implementation i=new Implementation();
		i.push(1);
		i.push(2);
		i.pop();
		i.push(3);
		i.push(4);
		i.pop();
		i.peek();
		
		
	}
}
