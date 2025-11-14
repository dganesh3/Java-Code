package com.loops.numbers;

import java.util.Scanner;

public class Circularprime 
{
	public static String checkcircular(int n)
	{
		int t1=n;
		int c=0;
		int res=1;
		while(t1>0)
		{
			c++;
		res=res*10;
			t1=t1/10;
		}
		for(int i=1;i<=c-1;i++)
		{
			if(checkprime(n))
			{
				int first=n/10;
				int last=n%10;
				n=last*res+first;
			//n=last*pow(10,(c-1))+first;			
			}
			else
			{
				return "it's not circular prime";
			}
		}
		return "it's circular prime";
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
		System.out.println(checkcircular(a));
		
	}
}
