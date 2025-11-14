package strings;

import java.util.Scanner;

public class String_Upper 
{
	public static String toUpperCase(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				res=res+(char)(str.charAt(i)-32);
			}
			else 
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		while(true)
		{
		System.out.println("enter string");
		String str=sc.nextLine();
		System.out.println(toUpperCase(str));
		}
	}
}
