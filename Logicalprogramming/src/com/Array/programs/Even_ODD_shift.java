package com.Array.programs;

public class Even_ODD_shift 
{
	public static int[] evenfront(int[] num)
	{
		int[] res=new int[num.length];
		int j=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2==0)
			{
				res[j]=num[i];
				j++;
			}
		}
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]%2!=0)
			{
				res[j]=num[i];
				j++;
			}
			
		}
		//print(num);
		print(res);
		return res;
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
	int[] num= {1,2,3,4,5,6,7,8};
	evenfront(num);
	
	
	
	
}
}
