package com.lib.exception;

class InvalidPinException extends Exception
{
	public InvalidPinException(String msg)
	{
		super(msg);
	}
}
public class Atm_Exception 
{
	
	public static void Atmpin(int pin)
	{
		if(pin==1245)
		{
			System.out.println("successfully completed");
		}
		else
		{
			try 
			{
			throw new InvalidPinException("pin");
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
	
	Atmpin(1245);
	Atmpin(1235);
	
}
}
