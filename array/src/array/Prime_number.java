package array;

public class Prime_number 
{
	public static boolean check(int[] n)
	{
			for(int i=0;i<=n.length-1;i++)
		{
			if(n[i]%2==0)
			{
				return false;
			}
		}
		return true;
	}
public static void print(int[] n)
{
	for(int i=0;i<=n.length-1;i++)
	{
	System.out.println(n[i]+" ");
	}
}
public static void main(String[] args) 
{
	int[] n= {1,2,3,4,5};
	System.out.println(check(n));
	
}
}
