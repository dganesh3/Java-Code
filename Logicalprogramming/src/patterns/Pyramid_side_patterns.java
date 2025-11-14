package patterns;

public class Pyramid_side_patterns 
{
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern2(int n)
	{
		for(int i=n;i>=1;i--) 			//method---->1
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern3(int n)//pattern2==pattern3 both are same
	{
		for(int i=1;i<=n;i++) 	//method--->2
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern4(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n;j++)
			{
				//System.out.print("# ");
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern5(int n)//pyramid
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern6(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern7(int n)//perfect pyramid
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern8(int n)// reverse perfect pyramid
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern9(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) 			
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern10(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void pattern11(int n)
	{
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();		
		}
	
	}
	public static void main(String[] args) 
	{
		System.out.println("-----triangle-------");
		pattern1(5);
//		System.out.println("----Reverse triangle----");
//			pattern2(5);
//		System.out.println("--------");
//		pattern3(5);
//		System.out.println("--------");
//		pattern4(5);
//		System.out.println("--------");
//	//	pattern5(5);
//		System.out.println("--------");
//	
//		//pattern6(5);
//		System.out.println("--------");
//	//	pattern7(5);
//		System.out.println("--------");
//	//	pattern8(5);
//		System.out.println("--------");
//	//	pattern9(5);
//		System.out.println("--------");
//	//  pattern10(5);
//		System.out.println("--------");
//		pattern11(5);
	}
}
