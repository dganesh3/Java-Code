package patterns;

public class Shapes_Pattern1 
{
	public static void L_pattern1(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
			for(int j=1;j<=column;j++)		
			{							
				if(i==row||j==1)
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
	public static void u_pattern2(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
			for(int j=1;j<=column;j++)		
			{							
				if(i==row||j==1||j==column)
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
	
	public static void diagonal(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
			for(int j=1;j<=column;j++)		
			{							
				if(i==j)
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
	public static void reverseTriangle(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
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

	public static void diagonal1(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
			for(int j=1;j<=column;j++)		
			{							
				if(i+j==row+1)
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
	public static void diagonal2(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		//1 2 3 4 
			for(int j=1;j<=column;j++)		
			{							
				if(i+j==row+1||i==j)
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
	public static void upwarddirection(int row ,int column)
	{
		for(int i=1;i<=row;i++)				
		{																		
			for(int j=1;j<=column;j++)		
			{							
			if(i==row||j==column||i==j)
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
	public static void main(String[] args) 
	{
		//L_pattern1(4,4);
		//u_pattern2(4,4);
		//Reversepattern1(4,4);
		//	diagonal(5,5);
		//	diagonal1(5,5);
		//diagonal2(5,5);
		upwarddirection(5,5);
	}
}
