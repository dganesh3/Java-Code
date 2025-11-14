package com.forloops.PrimeNumber;

import java.util.Scanner;

public class Prime_or_not
{
	public static boolean prime(int n) //O(N) O means worst case/maximum cases
	{
		int count=0;//1
		for(int i=2;i<=n-1;i++)//N  (n*1*1*1) time complexcity=(check no.of times)
		{
			if(n%i==0)//1
			{
				count++;//1
				System.out.println(i);//1
			}
		}
		System.out.println("total count is:"+count);
		if(count==0)
		{
			System.out.println("it is prime number");
			return true;
		}
		else
		{
			System.out.println("it is not prime number");
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();	
		System.out.println(prime(a));
		sc.close();
	}
}
