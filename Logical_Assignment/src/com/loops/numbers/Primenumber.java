package com.loops.numbers;

import java.util.Scanner;

public class Primenumber 
{
	public static void printprime(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(checkprime1(i))
			{
				System.out.print(i+" ");	
			}
		}
		System.out.println();
	}
	public static boolean checkprime1(int n)
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
			System.out.println("enter number");
			int a=sc.nextInt();
			printprime(a);
		}


	}
}
