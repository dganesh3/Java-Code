package com.dsa.stack;

public class MyStack
{
	final int MAX=5;
	private int[] arr;
	private int top=-1;
	public MyStack()
	{
		this.arr=new int[MAX];
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==MAX-1;
	}
	public int push(int data)
	{
		//top++;
		if(top==MAX-1)
		{
			throw new StackOverflowError();
		}
		else
		{
			arr[++top]=data;
		}
		return arr[top];
	}
}
