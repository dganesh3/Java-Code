package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Largest_prime 
{
	
	public static void largeprime(int start,int end)
	{
		
		for(int i=end;i>=start;i--)
		{
			if(checkprime3(i))
			{
				System.out.print(i);
				break;
			}
		}
		System.out.println();
	}
	public static boolean checkprime3(int n)
	{

		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter starting number");
		int a=sc.nextInt();
		System.out.println("enter end number");
		int b=sc.nextInt();
		largeprime(a,b);
		sc.close();

		}
	}

}
