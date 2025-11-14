package com.loops.numbers;

import java.util.Scanner;

public class Check_circularprime_or_not 
{
	public static void checkcircular(int n)
	{
		int t1=n;
		int c=0;
		int p=0;
	
		while(t1>0)
		{
			c++;
			t1=t1/10;
		}
		for(int i=1;i<=c;i++)
		{
			if(checkprime(n))
			{
				p++;
				System.out.println(n+" it is prime number");
				int first=n/10;
				int last=n%10;
			n=last*pow(10,(c-1))+first;
			}
			else
			{
				System.out.println(n+" it is  not prime number");
				int first=n/10;
				int last=n%10;
				n=last*pow(10,(c-1))+first;
			}
		}
		System.out.println("no of digits--->"+c);
		System.out.println("no of prime--->"+p);
		if(c==p)
		{
			System.out.println("it is circular prime");
		}
		else
		{
			System.out.println("its not circularprime");
		}
	}
	public static int pow(int b,int p)
	{
		int res =1;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		return res;
	}
	public static boolean checkprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if(n==2||n==3)
		{
			
			return true;
		}
		else if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter number");
		int a=sc.nextInt();
		checkcircular(a);
	}


}
