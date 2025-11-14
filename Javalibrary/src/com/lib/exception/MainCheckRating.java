package com.lib.exception;
class RemockException extends Exception
{
	public RemockException(String msg)
	{
		super(msg);
	}
}
public class MainCheckRating 
{
	public static void checkrating(int rating)
	{
		if(rating==1)
		{
			System.out.println("pass");
		}
		else
		{
			try
			{
				throw new RemockException("weak in coding");
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("hello");
			}

		}
	}
	public static void main(String[] args) 
	{
		checkrating(1);
		checkrating(2);
		System.out.println("betterluck nexttime");
	
		
	}		
}
