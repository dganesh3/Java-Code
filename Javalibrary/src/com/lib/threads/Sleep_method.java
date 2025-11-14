package com.lib.threads;

public class Sleep_method extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		Sleep_method s1=new Sleep_method();
		s1.start();	
	}
	

}
