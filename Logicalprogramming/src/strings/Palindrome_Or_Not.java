package strings;

import java.util.Scanner;

public class Palindrome_Or_Not 
{
	public static boolean palindrome(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}

		return str.equals(res);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter string");
			String str=sc.nextLine();
			System.out.println(palindrome(str));
		}


	}
}
