package recursion1;

public class Sum_of_n_Numbers 
{
	public static int print(int n)
	{
		if(n<=0)
		{
			return 0;
		}
		return n+print(n-1);
	}
public static void main(String[] args) 
{
	System.out.println(print(10));
	
}
}
