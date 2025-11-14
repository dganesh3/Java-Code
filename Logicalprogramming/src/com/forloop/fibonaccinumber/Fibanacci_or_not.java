package com.forloop.fibonaccinumber;

public class Fibanacci_or_not 
{
	public static int check(int n)
	{
		int n1=0;
		int n2=1;
		if(n==1)
		{
			System.out.println(" fibnoooo");

          return n1;		
		}
		if(n==2)
		{
			System.out.println(" fibnoooo");

			return n2;
		}
		for(int i=3;;i++)
		{
			int n3=n2+n1;
			n1=n2;
			n2=n3;
			if(n3==n)
			{
				System.out.println(" fibnoooo");

				return 1;
				
			}
			if(n3>n)
			{
				System.out.println("not fibnoooo");
				return 0;
			}
		}
	}
public static void main(String[] args) {
	System.out.println(check(3));
}
}
