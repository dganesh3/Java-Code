package com.forloops.PrimeNumber;

import java.util.Scanner;

public class NumberOfPrime 
{
	public static void prime(int n)
	{
		int count=0;
		for(int i=1;;i++)
		{

			if(checkprime1(i))
			{
				System.out.print( i+" ");	// no of prime
				count++;
			}
			if(count==n)
			{
				System.out.println();
				System.out.println("nth prime is: "+i+" "); // nth of prime
				break;
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
		//System.out.println("enter starting  number");
		//int a=sc.nextInt();
		System.out.println("enter no of prime");
		int b =sc.nextInt();
		prime(b);
		sc.close();


	}

}
