package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Alternative_prime_number 
{
	public static void alternativeprime(int n)
	{
		int count=0;
		for(int i=2;i<=n;i++)
		{
			if(checkprime1(i))
			{
				if(count%2==0)
				{
					System.out.print(i+" ");
				}
				count++;
			}
		}
		System.out.println();
	}
	public static boolean checkprime1(int n)
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
			System.out.println("enter number");
			int a=sc.nextInt();
			alternativeprime(a);
			sc.close();


		}
	}
}
