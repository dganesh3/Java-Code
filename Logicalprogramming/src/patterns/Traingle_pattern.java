package patterns;

public class Traingle_pattern 
{
	public static void ReverseTriangle(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																	
			for(int j=1;j<=column;j++)		
			{							
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void Triangle(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		
			for(int j=1;j<=column;j++)		
			{							
				if(i>=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void pyramid(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																	
			for(int j=1;j<=column;j++)		
			{							
				if(i+j>=row+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void reversepyramid(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		
			for(int j=1;j<=column;j++)		
			{							
				if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void bothpyramid(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		
			for(int j=1;j<=column;j++)		
			{	
				if(i+j>=row+1)
				//if(i<=j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=row;i++)				
		{																		
			for(int j=1;j<=column;j++)		
			{	
				if(i<=j)
				//if(i+j>=row+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
public static void main(String[] args) 
{
	//ReverseTriangle(5,5);
	//Triangle(5,5);
	//reversepyramid(6,6);
	bothpyramid(6,6);
	//pyramid(6,6);
}
}
