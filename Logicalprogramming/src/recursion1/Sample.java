package recursion1;

public class Sample 
{
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		print(n-1);
		System.out.println("hello");
	}

	public static void main(String[] args) 
	{
		print(5);

	}

}
