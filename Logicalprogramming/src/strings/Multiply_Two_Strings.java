package strings;

public class Multiply_Two_Strings 
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
	public static String multiple(String s1,String s2)
	{

		return parseInt(s1)*parseInt(s2)+"";

	}
	public static String addition(String s1,String s2)
	{
		
		return parseInt(s1)+parseInt(s2)+"";
		
	}
	public static String division(String s1,String s2)
	{
		
		return parseInt(s1)/parseInt(s2)+"";
		
	}
	public static String substract(String s1,String s2)
	{
		
		return parseInt(s1)-parseInt(s2)+"";
		
	}
	public static void main(String[] args) 
	{
		System.out.println(multiple("-2","-200"));
		System.out.println(addition("200","-200"));
		System.out.println(division("1000","-10"));
		System.out.println(substract("400","-200"));

	}
}
