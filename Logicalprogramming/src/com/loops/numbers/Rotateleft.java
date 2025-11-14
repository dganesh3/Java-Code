package com.loops.numbers;

import java.util.Scanner;

public class Rotateleft 
{
	public static long rotate(int n)
	{
		int c=0;
		long t=n;
		while(t>0)
		{
			c++;
			t=t/10;
		}
		long res =1l;
		for(int i=1;i<=(c-1);i++)
		{
			res=res*10;
		}
		long first=n/res;
		long last=n%res;
		
		return last*10+first;
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	System.out.println(rotate(a));
}
}
