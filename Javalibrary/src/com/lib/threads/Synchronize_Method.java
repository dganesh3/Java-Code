package com.lib.threads;

class Task
{
	synchronized public void printnum1()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	synchronized public void printnum2()
	{
		for(int i=3;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class ThreadOne extends Thread
{
	Task t1;

	public ThreadOne(Task t1) 
	{
		this.t1 = t1;
	}
	@Override
	public void run()
	{
		t1.printnum1();
	}
}
class ThreadTwo extends Thread
{
	Task t1;

	public ThreadTwo(Task t1) 
	{
		this.t1 = t1;
	}
	@Override
	public void run()
	{
		t1.printnum2();
	}
}
public class Synchronize_Method 
{
	public static void main(String[] args) 
	{
		Task task=new Task();
		ThreadOne t1=new ThreadOne(task);
		t1.start();
		System.out.println("------------");
		ThreadTwo t2=new ThreadTwo(task);
		t2.start();
		System.out.println("--------------");

	}
	

}
