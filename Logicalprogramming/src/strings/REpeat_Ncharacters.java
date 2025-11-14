package strings;

import java.util.Scanner;

public class REpeat_Ncharacters 
{
	public static String repeat(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>='1'&&str.charAt(i)<='9')
			{
				res=res+concat(str.charAt(i-1),(str.charAt(i)-48)-1);
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		return res;
	}
	public static String concat(char ch,int n)
	{
		String res="";
		for(int i=1;i<=n;i++) 
		{
			res=res+ch;

		}
		return res;
	}
	public static void main(String[] args) 
	{
		//	System.out.println(concat('*',5));
		System.out.println(repeat("p2h3a4n5i6"));
//		Scanner sc=new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("enter string");
//			String str=sc.nextLine();
//			System.out.println(repeat(str));
//		}

	}
}
