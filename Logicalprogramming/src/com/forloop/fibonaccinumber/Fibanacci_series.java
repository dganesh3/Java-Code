package com.forloop.fibonaccinumber;

import java.util.Scanner;

public class Fibanacci_series
{
	public static void series(int n)
	{
		int n1=1;
		int n2=1;
		if(n==1)
		{
			System.out.println(n1);
		}
		else
		{
			System.out.print(n1+" "+n2);
			for(int i=1;i<=n-2;i++)
			{
				int n3=n1+n2;

				System.out.print(" "+n3);
				n1=n2;
				n2=n3;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		series(a);
	}
}
