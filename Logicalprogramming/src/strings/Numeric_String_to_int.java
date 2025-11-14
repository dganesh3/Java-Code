package strings;

import java.util.Scanner;

public class Numeric_String_to_int 
{
	public static long parseInt(String str)
	{
		long res=0l;
		int j=0;
		if(str.charAt(0)=='-')
		{
			j=1;
		}
		for(int i=j;i<=str.length()-1;i++)
		{
			res=res*10+(str.charAt(i)-48);
		}
		if(j==1)
		{
			return -1*res;
		}
		return res;
	}
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter numeric String");
	String s=sc.nextLine();
	System.out.println(parseInt(s));
	
}
}
