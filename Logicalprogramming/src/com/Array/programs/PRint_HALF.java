package com.Array.programs;

public class PRint_HALF 
{
	public static void printfirsthalf(int[] num)
	{
		for(int i=0;i<=(num.length-1)/2;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println();
	}
	public static void printsecondhalf(int[] num)
	{
		for(int i=(num.length-1)/2+1;i<=num.length-1;i++)
		{
			System.out.print(num[i]+" ");
		}

	}

	public static void main(String[] args)
	{
		int [] num= {1,2,3,4,5};
		printfirsthalf(num);
		printsecondhalf(num);

	}

}
