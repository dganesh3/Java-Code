package strings;

public class Print_palindrome 
{	
	public static void print(String[] s)
	{
		for(int i=0;i<=s.length-1;i++)
		{
			if(palindrome(s[i])==true)
			{
				System.out.println(s[i]+" ");
			}
		}
		
	}
	public static boolean palindrome(String str)
	{
		String res="";
		for(int i=str.length()-1;i>=0;i--)
		{
			res=res+str.charAt(i);
		}

		return str.equals(res);	
	}
	public static void main(String[] args) 
	{
		String[] res= {"hello","aba","madam","abc"};
		print(res);

	}
}
