
public class demo
{
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(x.length-1);
		System.out.println("forward direction");
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
			System.out.println("backward direction");
			for(int i=x.length-1;i>=0;i--)
			{
				System.out.println(x[i]);
			}
		}
	}


