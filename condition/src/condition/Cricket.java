package condition;

public class Cricket 
{
	final int overs=20;
	int total;
	public  int batting(int runs)
	{
		total=runs*overs;
		return total;
	}
public static void main(String[] args) {
	Cricket c=new Cricket();
	System.out.println(c.batting(20));
}
}
