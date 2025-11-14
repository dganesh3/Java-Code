package com.loops.numbers;

public class Math_power 
{
	public static double power(double b,double p)
	{
	
		double res=1;
		for(int i=1;i<=p;i++)
		{
			res=res*b;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int res=(int)power(2,4);
		System.out.println(res);
	}

}
