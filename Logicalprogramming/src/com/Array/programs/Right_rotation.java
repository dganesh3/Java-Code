package com.Array.programs;

public class Right_rotation 
{
	public static int[] right(int[] num)
	{
		//step-1:store last element
		int last=num[num.length-1];
		//step-2:intialize num[i] with num[i-1]
		for(int i=num.length-1;i>=1;i--)
		{
			num[i]=num[i-1];
		}
		//step-3:intialize first element with last element
		num[0]=last;
		print(num);
		return num;
	}
	public static void print(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int []num= {1,2,3,4,5,6,7};
		right(num);
	}
}



