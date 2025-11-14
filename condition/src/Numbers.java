
public class Numbers 
{
	public static void print(int n)
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(i%7==0)
			{
				if(i%2!=0) 
				{
					c++;
					
				System.out.print(i+" ");
				}
			}
			if(c==10)
			{
				break;
			}
		}
		
	}
public static void main(String[] args) {
	print(200);
}
}
