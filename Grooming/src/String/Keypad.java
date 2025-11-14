package String;

public class Keypad 
{
	public static void main(String[] args)
	{
		String[] arr= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String s="56";
		String s1=arr[s.charAt(0)-48];
		String s2=arr[s.charAt(1)-48];
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				System.out.println(s1.charAt(i)+""+s2.charAt(j));
				c++;
			}
		}
		
		System.out.println();
		System.out.println("no of iteration = "+c);
	}

}
