package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Prime_Factors 
{
	public static void factors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0&&checkprime(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static boolean checkprime(int n)
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
		System.out.println("enter a number");
		int b=sc.nextInt();
		factors(b);
		}
	}

}
