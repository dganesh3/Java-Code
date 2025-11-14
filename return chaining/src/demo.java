
public class demo 
{
	static String fname(String fn)
	{
		return"$"+fn;
		}
	static String lname(String ln)
	{
		return ln+"$";
	}
	static String  fullName(String f,String l)
	{
		String x=fname(f);
		String y=lname(l);
		String fullName=x+""+y;
		System.out.println(fullName);
		return fullName;
	}
public static void main(String[] args) {
	fullName("rahul","dravid");
}
}
