package String;

public class ReverseStringWORD 
{
	public static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return  rev;
	}
	public static void main(String[] args) {
		String s="hi hello how are you";
		String[] ans=s.split(" ");
		for (String string : ans)
		{
			System.out.print(reverse(string)+" ");
		}
		
	}

}
