package patterns;

public class NumberdPattern1 
{
	public static void pattern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
	}
	public static void printPattern(int n)
    {
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

        int i, j;
        for (i = n-1; i >=1; i--) 
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
	public static void printPattern1(int n)
    {
        int i, j;
        for(i=1;i<=n;i++)
        {
        	for(j=1;j<=n-i;j++)
        	{
        		System.out.print("  ");
        	}
        	
        	for(int k=1;k<=i;k++)
        	{
        		System.out.print(k+" ");
        		
        	}
        	for(int k=i-1;k>=1;k--)
        	{
        		System.out.print(k+" ");
        	}
        	System.out.println(); 
        }
    }
	public static void main(String[] args) {
		printPattern1(4);
		printPattern(4);
		pattern1(4);
	}

}
