package com.TwoDarray.Basicprograms;

public class Even_Count_sum 
{
	public static void PrintArray(int[][] num)
	{
		int sum=0;
		int c=0;
		for(int i=0;i<=num.length-1;i++)
		{
			for(int j=0;j<=num[i].length-1;j++)
			{
				if(num[i][j]%2==0)
				{
				sum=sum+num[i][j];
				System.out.print(num[i][j]+" ");
				c++;
				}
			}
	//	System.out.println();
		}
		System.out.println();
		System.out.println("count of even elements: "+c);
		System.out.println("sum of even elements is: "+sum);
	}
	public static void main(String[] args) 
	{
		int[][] num= {{1,2,3},{4,5,6},{7,8,9}};
		PrintArray(num);

	}

}
