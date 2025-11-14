package strings;

import java.util.Scanner;

public class reverse_String 
{
	public static String reverse(String str)
	{
		String res=new String("");
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}
		return res;
	}
	public static String reverse2(String str)
	{

		String res=new String("");
		for(int i=0;i<=str.length()-1;i++)
		{
			res=res+str.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter string");
			String str=sc.nextLine();
			System.out.println(reverse(str));
		}
	}

}
