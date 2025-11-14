package Array;

public class Guist_cruise 
{
	public static void party(int[] e,int []l)
	{
		int cr=0;
		int max=0;
		for(int i=0;i<=e.length-1;i++)
		{
			cr=cr+e[i]-l[i];
			if(max<cr)
			{
				max=cr;
			}
		}
		System.out.println(max);

	}
	public static void main(String[] args) {
		int[] e= {7,0,5,1,3};
		int []l= {1,2,1,3,4};
		party(e,l);
	}
}
