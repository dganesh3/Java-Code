package com.Array.programs;

public class Sum_of_array_element 
{
	public static void print(int[] num)
	{
		int sum=0;
		for(int i=0;i<=num.length-1;i++)
		{
			
			sum=sum+num[i];
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args)
	{
		int [] num= {1,2,3,4,5};
		print(num);
		
	}

}
