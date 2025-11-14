package com.forloops.numbers;

import java.util.Scanner;

public class Printleapyear_or_not1 
{
	public static void prime(int year)
	{
		for(int i=0;i<=year;i++)
		{
			if(i%400==0||i%100!=0&&i%4==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter year ");
			int a=sc.nextInt();
			prime(a);
			sc.close();

		}
	}
}
