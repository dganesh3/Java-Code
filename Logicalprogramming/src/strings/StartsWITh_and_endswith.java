package strings;

public class StartsWITh_and_endswith 
{
	public static boolean startsWith(String str,String key)
	{
		if(key.length()<=str.length()&&str.substring(0, key.length()).equals(key))
		{
			return true;
		}
		return false;
	}
	public static boolean endsWith(String str,String key)
	{
		if(key.length()<=str.length()&&str.substring(str.length()-key.length()).equals(key))
		{
			return true;
		}
		return false;
	}
public static void main(String[] args) 
{
	String str="hello world hi";
	System.out.println(str.startsWith("hel"));//special function
	System.out.println(startsWith(str, "he"));//user defined function
	System.out.println("---------endswith--------");
	String s="radhakrishna";
	System.out.println(s.endsWith("ha"));//special functon
	System.out.println(endsWith(s, "krishna"));//user -defined function
	
}
}
