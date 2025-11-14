package com.loops.numbers;

import java.util.Scanner;

public class Square_of_number 
{
	public static void power(int num)
	{

		for(int i=1;i<=num;i++)
		{
			int pow=i*i;
			System.out.print(pow+" ");
		}

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		power(a);
	}
}
