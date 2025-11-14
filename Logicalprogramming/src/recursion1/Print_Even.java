package recursion1;

public class Print_Even 
{
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2==0)
		{
			System.out.println(n);//n to 1 even numbers reverse order
		}
		print(n-1);
//		if(n%2==0)
//		{
//			System.out.println(n);//1 to n even numbers normal order
//		}
	}

	public static void main(String[] args) 
	{
		print(5);

	}


}
