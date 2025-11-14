package com.lib.threads;

public class Mythread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
	Mythread m1=new Mythread();
	m1.start();
	}

}
