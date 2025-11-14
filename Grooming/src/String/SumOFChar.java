package String;

public class SumOFChar 
{
	public static void main(String[] args) {
		String s="Hi12 bye32 67 hi55";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>'0'&&c<='9') 
			{
				sum=sum+(int)c;
			}
		}
		System.out.println(sum);
	}

}
