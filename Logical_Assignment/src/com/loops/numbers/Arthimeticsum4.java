package com.loops.numbers;

import java.util.Scanner;

public class Arthimeticsum4 
{
	public static void sum(int n)
	{
		int start=1;
		int difference=3;
		for(int i=0;i<n;i++)
		{
			System.out.print(start+" ");
			start=start+difference;
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		sum(a);
	}

}
