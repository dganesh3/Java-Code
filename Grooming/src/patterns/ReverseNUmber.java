package patterns;

public class ReverseNUmber 
{
	public static void pattern4(int n)
	{
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(j+" " );
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern4(5);
	}

}
