package strings;

import java.util.Scanner;

public class STring_Rotation_left 
{
	public static String rotateleft(String str,int n)
	{
		n=n%str.length();
		return str.substring(n)+str.substring(0,n);
	}
	public static void main(String[] args) 
	{
		//		String str="hello";
		//		System.out.println(rotateleft(str,1));
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter string");
			String s=sc.nextLine();
			System.out.println("enter rotations");
			int n=sc.nextInt();
			sc.nextLine();
			System.out.println(rotateleft(s,n));
		}
	}

}
