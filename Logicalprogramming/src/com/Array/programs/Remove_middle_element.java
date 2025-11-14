package com.Array.programs;

public class Remove_middle_element 
{
	public static void print(int[] num)
	{

		for(int i=0;i<=num.length-1;i++)
		{
			if(i!=(num.length-1)/2)
			{
				System.out.print(num[i]+" ");
			}	
		}

	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6,7,8,9};
		print(num);
	}



}
