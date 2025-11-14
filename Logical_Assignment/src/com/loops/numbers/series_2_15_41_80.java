package com.loops.numbers;

import java.util.Scanner;

public class series_2_15_41_80 
{
	public static void series(int n)
	{
		int start=2;
		int difference=13;
		for(int i=1;i<=n;i++)
		{
			System.out.print(start+" ");
			start=start+difference*i;
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	series(a);
}
}
