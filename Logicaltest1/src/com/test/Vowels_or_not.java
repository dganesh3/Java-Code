package com.test;

import java.util.Scanner;

public class Vowels_or_not 
{
	public static boolean vowel(char q)
	{
		if(q=='a'||q=='e'||q=='i'||q=='o'||q=='u'||q=='A'||q=='E'||q=='I'||q=='O'||q=='U')
		{
			System.out.println("given char is vowel:"+q);
			return true;

		}
		else
		{
			System.out.println("given char is consonant:"+q);
			return false;
		}
		
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter character");
			char q=sc.nextLine().charAt(0);
			System.out.println(vowel(q));
		}
		
	}
}

