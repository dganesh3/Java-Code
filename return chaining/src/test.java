
public class test 
{
	static int total(int p,int c,int m,int o)
	{
		return p+c+m+o;
	}
	static void percentage(int phy,int che,int math,int opt)
	{
		int x=total(phy,che,math,opt);
		float perc=x/(400.0f)*100;
		System.out.println(perc);
		}
	public static void main(String[] args) {
		percentage(50,50,80,70);
	}

}
