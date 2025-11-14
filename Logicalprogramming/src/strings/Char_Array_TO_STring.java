package strings;

public class Char_Array_TO_STring 
{
	public static String toString(char[] ch)
	{
		String res="";
		for(int i=0;i<=ch.length-1;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
public static void main(String[] args) 
{
	char[] ch= {'a','b','c','d'};
	System.out.println(toString(ch));
	
}
}
