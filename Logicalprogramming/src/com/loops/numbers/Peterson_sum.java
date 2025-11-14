package com.loops.numbers;

public class Peterson_sum 
{
	public static void check(int n)
	{
			int t=n;
			int c=0;
			int rem=0;
			int sum=0;
			while(t>0)
			{
				c++;
				 rem=t%10;
				 System.out.println(rem+" ");
				t=t/10;
				int res=1;
				for(int i=rem;i>=1;i--)
				{
					res=res*i;
					
				}
				sum=rem+res;
				
			}
		
		
		System.out.println(rem);
	//	System.out.println(res);
		System.out.println(sum);
		//	System.out.println(sum);
		//	if(n==sum)
		//	{
		//		System.out.println("it is peterson");
		//		
		//	}
		//	else
		//	{
		//		System.out.println("its not peterson");
		//	}
	}
	public static void main(String[] args) 
	{
		check(145);

	}
}
