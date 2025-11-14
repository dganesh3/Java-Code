package com.loops.numbers;

import java.util.Scanner;

public class Arthimetic_sum_q6 
{
	public static void printsum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.print(sum+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		printsum(a);
	}
}
