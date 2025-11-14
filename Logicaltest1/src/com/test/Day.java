package com.test;

import java.util.Scanner;

public class Day
{
	public static String day(int n,boolean vacation)
	{
		
		if(vacation==false&&n>=1&&n<=5)
		{
			return "7:00";
		}
		else if(vacation==false&&(n==0||n==6))
		{
			return "10:00";
		}
		else if(vacation==true&&n>=1&&n<=5)
		{
			return "10:00";
		}
		else 
		{
			return "off";
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		System.out.println("enter b value");
		boolean b=sc.nextBoolean();
		System.out.println(day(n,true));
		sc.close();
	}
}