
public class test1 
{
	static int total(int p,int c,int m,int o)
	{
		return p+c+m+o;
	}
	static void percentage(int total)
	{
		float perc=(total/400.0f)*100;
		System.out.println(perc);
	}
	public static void main(String[] args) {
		int x=total(55,55,65,76);
		percentage(x);
	}

}
