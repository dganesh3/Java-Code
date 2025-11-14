public class busticket 
{
	public static void ticket(int km,String gender)
	{
		if(gender == "male")
		{
			int cost=km*2;
			System.out.println(cost);
		}
		if(gender == "female")
		{
			int cost=km*0;
			System.out.println(cost);
		}
	}
	public static void main(String[] args)
	{
		ticket(2,"male");
		ticket(3,"female");
	}

}
