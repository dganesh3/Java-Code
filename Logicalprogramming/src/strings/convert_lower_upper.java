package strings;

public class convert_lower_upper 
{
	public static void convertlower(char ch)
	{
		if(ch>=65&&ch<=90)
		{
			ch=(char)(ch+32);
		}
		System.out.println(ch);
		
	}
	public static void convertupper(char ch)
	{
		if(ch>=97&&ch<=122)
		{
			ch=(char)(ch-32);
		}
		System.out.println(ch);
		
	}
public static void main(String[] args) 
{
	convertlower('D');
	convertupper('a');
	
}
}
