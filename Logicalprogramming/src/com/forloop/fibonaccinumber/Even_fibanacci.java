package com.forloop.fibonaccinumber;

public class Even_fibanacci
{
	public static void even(int n)
	{
		int n1=0;
		int n2=1;
		int count=0;
		while(count<n)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			if(n3%2==0)
			{
				System.out.print(n3+" ");
				count++;
			}
		}
	}

	public static void main(String[] args)
	{
		even(10);
	}
}
