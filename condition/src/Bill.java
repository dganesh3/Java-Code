
public class Bill 
{
	public static void bill(int units)
	{
		double billAmount;
		if(units>=0 && units<=200)
		{
			billAmount = 0*units;
			System.out.println(billAmount);
		}
		else if(units>=201&&units<=300)
		{
		billAmount=units*6;
		System.out.println(billAmount);
		}
		else if(units>=301)
		{
			billAmount=units*7;
			System.out.println(billAmount);
		}
		else
		{
			System.out.println("current bill is high");
		}
	}
	public static void main(String[] args) 
	{
       bill(150);
       bill(250);
       bill(400);
	}
}