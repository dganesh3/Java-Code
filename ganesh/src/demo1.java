
public class demo1
{
	static String fname(String fn)
	{
		return"$"+fn;
	}
	static String lname(String ln)
	{
		return ln+"$";
		}
	static void fullName(String f,String l)
	{
		String fullName=f+""+l;
		System.out.println(fullName);
		}
public static void main(String[]args) {
	String x=fname("rahul");
	String y=lname("dravid");
	fullName(x,y);
}

}
