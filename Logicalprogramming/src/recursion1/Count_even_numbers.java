package recursion1;

public class Count_even_numbers 
{
	public static int print(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		else if(n%2==0)
		{
			return 1+print(n-1);
		}
		return print(n-1);
	}
public static void main(String[] args) 
{
	System.out.println(print(10));
	
}
}
