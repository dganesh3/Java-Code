package com.forloops.numbers;
import java.util.*;
public class caughtSpeeding
{
	public  static int caughtSpeeding(int speed, boolean isBirthday) 
	{
		if(isBirthday==true)
		{
			if(speed<=60+5)
			{
				return 0;
			}
			else if(speed>=61+5 && speed<=80+5)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		} 
		else
		{
			if(speed<=60)
			{
				return 0;
			}
			else if(speed>=61 && speed<=80)
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Values");
		int a= sc.nextInt();
		boolean b= sc.nextBoolean();
		int	x =	caughtSpeeding(a,b);
		System.out.println(x);
		sc.close();

	}
}
