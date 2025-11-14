package com.whileloop.number;

import java.util.Scanner;

public class Reverse_number
{
	public static int reverse(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		System.out.println(reverse(a));
		
	}
}
