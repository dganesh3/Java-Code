package org.jsp.example;

public class ArraySum 
{
	public static int name(int []arr)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				sum=sum+arr[j];
				if(sum>=81)
				{
					return arr[j];
					
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6};
		System.out.println(name(arr));
	}

}
