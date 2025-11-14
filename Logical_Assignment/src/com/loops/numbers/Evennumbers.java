package com.loops.numbers;

import java.util.Scanner;

public class Evennumbers 
{
	public static void printeven(int n)
	{
		int start=2;
		int diff=2;
		for(int i=1;i<=n;i++)
		{
			System.out.print(start+" ");
			start=start+diff;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter number");
			int a=sc.nextInt();
			printeven(a);
		}
	}
}
