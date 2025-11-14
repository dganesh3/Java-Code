package strings;

public class Separete_characters 
{
	public static void separate(String str)
	{
		String upper="";
		String lower="";
		String numeric="";
		String spl="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65&&str.charAt(i)<=90)
			{
				upper=upper+str.charAt(i);
			}
			else if(str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				lower=lower+str.charAt(i);
			}
			else if(str.charAt(i)>=48&&str.charAt(i)<=57)
			{
				numeric=numeric+str.charAt(i);
			}
			else
			{
				spl=spl+str.charAt(i);
			}
		}
		System.out.println("Upper case :-"+upper);
		System.out.println("lower case :-"+lower);
		System.out.println("numeric num :-"+numeric);
		System.out.println("special char :-"+spl);
	}
	public static void main(String[] args)
	{
		String str="ABced@#1234";
		separate(str);

	}
}
