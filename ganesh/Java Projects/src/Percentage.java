
public class Percentage {
	static void perc(int p,int c, int m,int o)
	{
	int total=p+c+m+o;
	float perc = (total/400.0f)*100;
	System.out.println(perc);
	}
	public static void main(String[] args) {
		perc(12,56,89,76);

	}

}
