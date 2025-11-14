package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Nearestprime
{
	public static int nearprime(int m)
	{
		if(checkprime2(m))
		{
			return m;
		}
		int afterN=0;
		int beforeN=0;
		for(int i=m+1;;i++)
		{
			if(checkprime2(i))
			{
				afterN=i;
				break;
			}
		}
		for(int i=m-1;;i--)
		{
			if(checkprime2(i))
			{
				beforeN=i;
				break;
			}
		}
		if(m-beforeN<=afterN-m)
		{
			return beforeN;
		}
		else
		{
			return afterN;
		}
	}
	public static boolean checkprime2(int n)
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
			System.out.println(nearprime(b));
			sc.close();

		}
	}
}
