package com.Array.sort;

public class First_and_Second_max 
{
	public static int max(int[] num)
	{
		int fmax=num[0];
		int smax=-1;
		for(int i=1;i<=num.length-1;i++)
		{
			if(num[i]>fmax)
			{
				fmax=num[i];
			}
		}
		
		System.out.println("first max="+fmax);
		//	return fmax;
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]>smax&&num[i]<fmax)
			{
				smax=num[i];
			}
		}
		System.out.println("second max="+smax);
		return smax;
	}
	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5,6,7};
		System.out.println(max(num));

	}
}
