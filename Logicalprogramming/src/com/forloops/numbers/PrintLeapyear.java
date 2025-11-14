package com.forloops.numbers;

import java.util.Scanner;

public class PrintLeapyear
{
	public static void leapyearornot(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(i%400==0||i%100!=0&&i%4==0)
			{
				System.out.print(i+" ");
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int a=sc.nextInt();
		System.out.println("enter end number");
		int b=sc.nextInt();
		leapyearornot(a,b);
		sc.close();

	}
}
