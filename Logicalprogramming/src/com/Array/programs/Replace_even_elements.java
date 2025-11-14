package com.Array.programs;

public class Replace_even_elements 
{
	public static void print(int[] num)
	{

		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				num[i]=0;
			}
			System.out.print(num[i]+" ");
		}

	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6};
		print(num);
	}

}
