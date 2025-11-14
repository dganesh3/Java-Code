package com.forloops.numbers;

import java.util.Scanner;

public class Factorial 
{
	public static long factorialnum(int num)
	{
		long res=1l;
		for(int i=num;i>=1;i--)
		{
			res=res*i;
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();	
		System.out.println(factorialnum(a));
		sc.close();
	}
}

