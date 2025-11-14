package com.whileloop.number;

import java.util.Scanner;

public class Print_Palindrome 
{
	public static void palindrome(int start,int end)
	{
		for(int i=start;i<=end;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static boolean check(int n)//log n
	{
		int t=n;
		int rev=0;
		while(t>0)
		{
			int rem=t%10;
			rev=rev*10+rem;
			t=t/10;
		}
		//System.out.println("given number is:"+n);
		//System.out.println("reverse number is:"+rev);
		if(rev==n)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting number");
		int a=sc.nextInt();
		System.out.println("enter ending number");
		int b=sc.nextInt();
		palindrome(a,b);
		
	}

}
