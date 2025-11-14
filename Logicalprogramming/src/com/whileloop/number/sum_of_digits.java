package com.whileloop.number;

import java.util.Scanner;

public class sum_of_digits 
{
	public static void digit(int n)
	{
		int p=1;
		int sum =0;
		int count=0;
		while(n>0)
		{

			int rem=n%10;
			p=p*rem;
			sum=sum+rem;
			count++;
			n=n/10;
		}
		System.out.println("product of digit is="+p);
		System.out.println("sum of digit is="+sum);
		System.out.println("count of digit is="+count);
		if(p==sum)
		{
			System.out.println("its spy number");
		}
		else
		{
			System.out.println("its not spy number");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		digit(a);	
	}
}
