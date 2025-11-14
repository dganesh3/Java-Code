package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Primeornot 
{
	public static int prime(int n)
	{
		if(n==1)
		{
			return 0;
		}
		else if(n==2||n==3)
		{
			System.out.println("its prime number");
			return 1;
		}
		else if(n%2==0||n%3==0)
		{
			return 0;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int b=prime(a);
		System.out.println(b);
	}
}
