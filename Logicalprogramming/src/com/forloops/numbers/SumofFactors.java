package com.forloops.numbers;

import java.util.Scanner;

public class SumofFactors 
{
	public static void factor(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("total sum is:"+sum);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 int a=sc.nextInt();
		factor(a);
		sc.close();

	}
}
