package patterns;

public class Basic_pattern1 
{
	public static void pattern1(int row ,int column)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		pattern1(3,3);

	}
}
