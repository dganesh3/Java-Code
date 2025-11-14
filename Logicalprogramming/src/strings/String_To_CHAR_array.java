package strings;

import java.util.Arrays;

public class String_To_CHAR_array 
{
	public static char[] tochararray(String str)
	{
		char[] res=new char[str.length()];
		for(int i=0;i<=str.length()-1;i++)
		{
			res[i]=str.charAt(i);
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
public static void main(String[] args) 
{
	System.out.println(tochararray("hello"));
	System.out.println("-----special function-----");
	String s="ganesh";
	char[] ch=s.toCharArray();
	System.out.println(ch);
}
}
