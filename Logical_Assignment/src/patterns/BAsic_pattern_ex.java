package patterns;

public class BAsic_pattern_ex 
{
	public static void pattern1(int row ,int column)
	{
		int x=0;
		for(int i=1;i<=row;i++)				
		{													
			for(int j=1;j<=column;j++)		
			{							
				System.out.print(x+" ");
				x++;
			}
		System.out.println();	
		}
		
	}
public static void main(String[] args) 
{
	pattern1(4,3);
	
}
}
