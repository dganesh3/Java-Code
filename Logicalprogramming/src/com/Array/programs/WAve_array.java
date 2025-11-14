package com.Array.programs;

import java.util.Arrays;

public class WAve_array 
{
	public static void convert(int[] num)
	{
		
		for(int i=0;i<=num.length-1;i++)
		{
			if(i+1<=num.length-1)
			{
				int temp=num[i];
				num[i]=num[i+1];
				num[i+1]=temp;
			}
			i++;
		}
	
		System.out.println(Arrays.toString(num));
		//return num;
	}
public static void main(String[] args) 
{
	int[] num= {1,2,3,4,5};
	convert(num);
	
}
}
