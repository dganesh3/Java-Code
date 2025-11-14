 package com.forloop.fibonaccinumber;

public class nthfibanacci 
{
	public static int check(int n)
	{
		int n1=0;
		int n2=1;
		int n3=0;
		if(n==1)
		{
			return n1;
		}
		else if(n==2)
		{
			return n2;
		}
		for(int i=2;i<=n;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			
		}
		return n1;
	}
	public static void main(String[] args) 
	{
		System.out.println(check(6));
	}
}
