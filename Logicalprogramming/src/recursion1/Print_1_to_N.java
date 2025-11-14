package recursion1;

public class Print_1_to_N 
{
	public static void print(int n)
	{
		if(n==0)
		{
			return;
		}
	//	System.out.println(n);//(N-1)entry reverse order
		print(n-1);
		System.out.println(n);//(1-N) exit LIFO--->normal order
	}

	public static void main(String[] args) 
	{
		print(5);

	}


}
