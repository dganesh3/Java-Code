package com.forloops.numbers;

import java.util.Scanner;

public class Factorofnumber_count 
{
	public static void factor(int n)
	{ 
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				count++;
			}
		}

		System.out.println("total count is:"+count);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int b=sc.nextInt();
		factor(b);
		sc.close();
	}
}
