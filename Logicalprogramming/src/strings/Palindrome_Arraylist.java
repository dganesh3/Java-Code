package strings;

import java.util.*;

public class Palindrome_Arraylist 
{	
	public static List<String> check(String[] str)
	{
		ArrayList<String> res=new ArrayList<String>();
		for(int i=0;i<=str.length-1;i++)
		{
			if(palindrome(str[i])==true)
			{
				res.add(str[i]);
			}
		}
		return res;
	}
	
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
		String[] res= {"hello","aba","madam","abc"};
	System.out.println(check(res));
		
	}
}
