package com.lib.threads;
class Task1
{
	synchronized public void printnum1()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	synchronized public void printnum2()
	{
		for(int i=5;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class ThreadOne1 extends Thread
{
	Task1 t1;

	public ThreadOne1(Task1 t1) 
	{
		this.t1 = t1;
	}
	@Override
	public void run()
	{
		synchronized (t1) 
		{
			t1.printnum1();
		}
	}
}
class ThreadTwo1 extends Thread
{
	Task1 t1;

	public ThreadTwo1(Task1 t1) 
	{
		this.t1 = t1;
	}
	@Override
	public void run()
	{
		synchronized (t1) 
		{
			t1.printnum2();	
		}
	}
}
public class Synchronize_block 
{
	public static void main(String[] args) 
	{
		Task1 task=new Task1();
		ThreadOne1 t1=new ThreadOne1(task);
		t1.start();
		ThreadTwo1 t2=new ThreadTwo1(task);
		t2.start();

	}

}
