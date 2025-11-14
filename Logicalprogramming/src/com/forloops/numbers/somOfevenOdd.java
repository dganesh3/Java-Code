package com.forloops.numbers;

import java.util.Scanner;

public class somOfevenOdd 
{
	public static void calculate(int s,int e)
	{
		int even=0;
		int odd=0;
		for(int i=s;i<=e;i++)
		{
			if(i%2==0)
			{
				even=even+i;
			}	
			else
			{
				odd=odd+i;
				
			}
		}
		System.out.println("even number of sum is:"+even);
		System.out.println("odd number of sum is:"+odd);
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter start");
	int s=sc.nextInt();
	System.out.println("enter end");
	int e=sc.nextInt();
	calculate(s,e);
	sc.close();
}
}
