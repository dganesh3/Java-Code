package com.Array.programs;

public class Prime_NUmbers_Shift 
{
	public static int[] primefront(int[] num)
	{
		int[] res=new int[num.length];
		int j=0;
		for(int i=0;i<=num.length-1;i++)
		{
			if(checkprime2(num[i])==true)
			{
				res[j]=num[i];
				j++;
			}
		}
		for(int i=0;i<=num.length-1;i++)
		{
			if(checkprime2(num[i])==false)
			{
				res[j]=num[i];
				j++;
			}

		}
		print(num);
		print(res);
		return res;
	}public static void print(int[] n)
	{
		for(int i=0;i<=n.length-1;i++)
		{
			System.out.print(n[i]+" ");
		}
		System.out.println();
	}
	public static boolean checkprime2(int n)
	{
		if(n<=1)
		{
			return false;
		}
		else if(n==2||n==3)
		{
			return true;
		}
		else if(n%2==0||n%3==0)
		{
			return false;
		}
		for(int i=5;i<=Math.sqrt(n);i=i+2)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int[] num= {2,3,4,5,6,7,8,11};
		primefront(num);

	}


}
