package com.loops.numbers;

import java.util.Scanner;

public class Armstrong_Number
{
	public static String check(int n)
	{
		int t1=n;
		int t2=n;
		int c=0;
		while(t1>0)
		{
			c++;
			t1=t1/10;
		}
		int sum=0;
		while(t2>0)
		{
			int rem=t2%10;
			int res=1;
			for(int i=1;i<=c;i++)
			{
				res=res*rem;
			}
			sum=sum+res;
			t2=t2/10;
		}
		if(n==sum)
		{
			return "Armstrong number";
		}
		return "not Armstrong number";
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter number");
			int a=sc.nextInt();
			System.out.println(check(a));
		}
	}
}
