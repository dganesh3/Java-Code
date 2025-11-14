package strings;

import java.util.Scanner;

public class STring_Lower_Upper_reverse 
{

	public static String upperLowerReverse(String str)
	{
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)//upper----->lower
			{
				res=res+(char)(str.charAt(i)+32);
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)//lower --->upper
			{
				res=res+(char)(str.charAt(i)-32);
			}
			else //numuric and special
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
		System.out.println(upperLowerReverse(str));
		}
	}

}
