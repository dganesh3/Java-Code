package strings;

import java.util.Scanner;

public class copy_stirng 
{
	public static String copy(String str)
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
//		String str="hello";
//		String res=copy(str);
//		System.out.println(res);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("enter string");
		String str=sc.nextLine();
		System.out.println(copy(str));
		}
	}
}
