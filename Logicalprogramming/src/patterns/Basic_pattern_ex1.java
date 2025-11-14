package patterns;

public class Basic_pattern_ex1 
{
	public static void pattern2(int row ,int column)
	{
		for(int i=1;i<=row;i++)				//output:-
		{										//1 1 1
			for(int j=1;j<=column;j++)			//2 2 2
			{									//3 3 3
				System.out.print(i+" ");		//4 4 4
			}
			System.out.println();
		}
	}
	public static void pattern3(int row ,int column)
	{
		
		for(int i=1;i<=row;i++)				//output:-
		{		//int x=1;							//1 2 3 4									//1 2 3 4 
			for(int j=1;j<=column;j++)				//1 2 3 4
			{										// 1 2 3 4
				//System.out.print(x+" ");
				System.out.print(j+" ");
				//x++;
			}
			System.out.println();
		}
	}
	public static void pattern4(int row ,int column)
	{
		int x=1;
		for(int i=1;i<=row;i++)				//output:-
		{											//1 2 3 									//1 2 3 4 
			for(int j=1;j<=column;j++)				//4 5 6
			{										//7 8 9
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		pattern2(4,3);
		System.out.println("--------");
		pattern3(3,4);
		System.out.println("--------");
		pattern4(3,3);

	}
	

}
