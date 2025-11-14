package com.loops.numbers;

import java.util.Scanner;

public class Merge_Two_numbers 
{
	public static long merge(int n1,int n2)
	{
		int t1=n2;
		int c=0;
		while(t1>0)
		{
			c++;
			t1=t1/10;
		}
		long res=1;
		for(int i=1;i<=c;i++)
		{
			res=res*10;
		}
		return n1*res+n2;		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number n1");
		int a=sc.nextInt();
		System.out.println("enter number n2");
		int b=sc.nextInt();
		System.out.println(merge(a,b));
	}
}
