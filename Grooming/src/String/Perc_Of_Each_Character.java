package String;

import java.util.Scanner;

public class Perc_Of_Each_Character
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			char c=ch[i];
		
			while(i<ch.length&&c==ch[i])
			{
				count++;
				i++;
			}
			System.out.println(c+" --> "+count);
			i-=1;
		}
	}

}
