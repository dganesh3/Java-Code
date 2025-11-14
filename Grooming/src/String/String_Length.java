package String;

public class String_Length 
{
	public static int Arraylength(int []num)
	{
		int c=0;
		for(int n:num)
		{
			c++;             
		}
				
		return c;
	}
	static int StringLength(String str)
	{
		
		int c=0;
		for(int i=0;;i++)
		{
			try {
				str.charAt(i);
				c++;
			}
			catch(Exception e)
			{
				break;
			}
		}
		return c;
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		System.out.println("Stringlength : "+StringLength("abc"));
		System.out.println("ArrayLength : "+Arraylength(arr));
	}

}
