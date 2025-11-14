package com.Array.sort;

public class Remove_duplicates 
{
	public static void printarray(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			
			for(int j=i+1;j<=n.length-1;j++)
			{
				if(n[i]==n[j])
				{
					
					n[j]=-1;
				}
			}
			if(n[i]!=-1)
			{
				System.out.print(n[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] n= {1,2,1,3,5,6,2,1,1};
		printarray(n);

	}


}
