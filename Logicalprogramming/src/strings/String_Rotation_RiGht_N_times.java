package strings;

public class String_Rotation_RiGht_N_times 
{
	public static String rotateright(String str,int n)
	{
		n=n%str.length();
		return str.substring(str.length()-n)+str.substring(0,str.length()-n);
	}
	public static void main(String[] args) 
	{
		String str="hello";
		System.out.println(rotateright(str,1));
		
	}
}
