package Array;

public class Array_index 
{
	public static void index(int[] n)
	{
		int c1=1;
		int max=n[0];
		for(int i=1;i<=n.length-1;i++)
		{
			if(max<n[i])
			{
				max=n[i];
				c1++;
			}
		}
		System.out.println(c1);
	}
	public static void main(String[] args) 
	{
		int[] n= {7,4,8,2,9,11,5}; 
		index (n);
	}
}
