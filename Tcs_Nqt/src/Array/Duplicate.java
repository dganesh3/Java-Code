package Array;

public class Duplicate 
{
	public static void check(String s)
	{
		char[] c=s.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			boolean f=false;
			for(int j=i+1;j<=c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					c[j]='$';
					f=true;
				}
			}
			if(f==true)
			{
				c[i]='$';
			}
		}
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
		}


	}
	public static void main(String[] args) 
	{

		check("welcome");
	}
}
