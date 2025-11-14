package com.forloops.numbers;

import java.util.Scanner;

public class CheckLeapyear 
{
	public static boolean leapyearornot(int year)
	{
		if(year%100==0&&year%400==0)
		{
			System.out.println("it is leap year");
			return true;
		}
		else if(year%100!=0&&year%4==0)
		{
			System.out.println("it is leap year");
			return true;	
		}
		else 
		{
			System.out.println("it is not leap year");
			return false;
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		boolean b=leapyearornot(a);
		System.out.println(b);
		sc.close();

	}
}

