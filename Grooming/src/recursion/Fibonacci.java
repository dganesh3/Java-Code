package recursion;

public class Fibonacci 
{
	public static int fibanacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
//		if(n<=1)
//		{
//			return n;
//		}
		return fibanacci(n-1)+fibanacci(n-2);
	}
	public static void main(String[] args) {
		System.out.println(fibanacci(5));
	}

}
