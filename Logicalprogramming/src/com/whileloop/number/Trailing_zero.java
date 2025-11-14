package com.whileloop.number;

public class Trailing_zero
{
	public static void trail(int n)
	{
		int c=0;
		while(n>0)
		{
			int rem=n%10;
		//	System.out.print(rem+" ");
			n=n/10;
			c++;
		}
		if(c>=1)
		{
		
			System.out.println(c);
			
		}
		else
		{
			System.out.println("its not trailing ");
		}
	}
	public static void main(String[] args) 
	{
	trail(100);	
	}
}
