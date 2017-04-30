package Heaps;
import java.util.Arrays;
import java.util.*;
public class Heap {

	private int capacity=10;
	int[] items=new int[capacity];
	int size=0;
	
	private int getLeftChildIndex(int parentindex)
	{
		return 2*parentindex+1;
		
	}
	private int getRightChildIndex(int parentindex)
	{
		return 2*parentindex+2;
		
	}
	private int getParentIndex(int childindex)
	{
		return (childindex-1)/2;
		
	}
	private boolean hasLeftChildIndex(int index)
	{
		return getLeftChildIndex(index)<size;
		
	}
	private boolean hasRightChildIndex(int index)
	{
		return getRightChildIndex(index)<size;
		
	}
	private boolean hasParentIndex(int index)
	{
		return getParentIndex(index)>=size;
		
	}
	
	private int leftChild(int index)
	{
		return items[getLeftChildIndex(index)];
	}
	private int rightChild(int index)
	{
		return items[getRightChildIndex(index)];
	}
	private int parent(int index)
	{
		return items[getParentIndex(index)];
	}
	
	private void swap(int index1,int index2)
	{
		int temp=items[index1];
		items[index1]=items[index2];
		items[index2]=temp;
	}
	public int peek()
	{
		if(size==0)
		{System.out.println("empty");
			return -1;
		}
		else
			return items[0];
	}
	public int poll()
	{
		if(size==0)
		{System.out.println("empty");
			return -1;
		}
		else
		{
			int item=items[0];
			items[0]=items[size-1];
			size--;
			heapifyDown();
			return item;
		}
	}
	
	public void ensureExtraCapacity()
	{
		if(size==capacity)
		{
			items=Arrays.copyOf(items, capacity*2);
			capacity=capacity*2;
		}
	}
	public void heapifyDown()
	{
		int index=0;
		while(hasLeftChildIndex(index))
		{
			int smallindex=getLeftChildIndex(index);
			if(hasRightChildIndex(index)&& getRightChildIndex(index)<smallindex)
			{
				smallindex=getRightChildIndex(index);
			}
			if(items[index]>items[smallindex])
			swap(index,smallindex);
			else
				break;
			index=smallindex;
			
		}
	}
	public void heapifyUp()
	{
		int index=size-1;
		while(hasParentIndex(index)&& getParentIndex(index)>index)
		{
			swap(getParentIndex(index),index);
			index=getParentIndex(index);
		}
		
	}
	
	public void add(int item)
	{
		ensureExtraCapacity();
		items[size]=item;
		size++;
		heapifyUp();
	}
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		Heap hp=new Heap();
		System.out.println("Enter 7 operations");
		int i=6;
		while(i>0)
		{
		int num=in.nextInt();
		switch(num)
		{
		case 1:
			{System.out.println("Print number to be added");
				int num2=in.nextInt();
		hp.add(num2);
		break;
			}
		case 2:
		{System.out.println("Print number to be deleted");
			int num2=in.nextInt();
	hp.poll();
	break;
		}
		}
		}
		
	}
}
