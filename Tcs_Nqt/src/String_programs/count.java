package String_programs;

public class count 
{
	public static void Stringcount(String a)
	{
		int c1=0;
		int c2=0;
		for(int i=0;i<a.length();i++)	
		{
			if(a.charAt(i)=='*')
			{
				c1++;
			}
			else if(a.charAt(i)=='#')
			 {
				c2++;
				
			}
			
		}
		System.out.println(c1-c2);
	}
public static void main(String[] args) 
{
	Stringcount("**###");
}
}
