package com.lib.threads;

class Threadtaskone extends Thread
{
	String s1=null;
	String s2=null;
	public Threadtaskone(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t1 starts s1");
		System.out.println("t1 waiting to lock s1");
		synchronized (s1) 
		{
			System.out.println("t1 locks s1");
			try
			{
				s1.wait(4000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("t1 waiting to lock s2");
			synchronized (s2) 
			{
				System.out.println("t1 locks s2");	
			}
			System.out.println("t1 locks s1");
			System.out.println("t1 locks s2");
			
		}
	}
}
class Threadtasktwo extends Thread
{
	String s1=null;
	String s2=null;
	public Threadtasktwo(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run()
	{
		System.out.println("t2 starts s2");
		System.out.println("t2 waiting to lock s2");
		synchronized (s2) 
		{
			System.out.println("t2 locks s2");
			System.out.println("t2 waiting to lock s2");
			synchronized (s1) 
			{
				System.out.println("t2 locks s1");
				s1.notify();
			}
			System.out.println("t2 unlocks s1");
			System.out.println("t2 unlocks s2");
			
		}
	}
}
public class Dead_lock 
{
	public static void main(String[] args) 
	{
		String str1=new String("hello");
		String str2=new String("hi");
		Threadtaskone t1=new Threadtaskone(str1, str2);
		Threadtasktwo t2=new Threadtasktwo(str1, str2);
		t1.start();
		t2.start();	
	}

}
