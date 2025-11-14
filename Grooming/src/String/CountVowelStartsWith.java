package String;

import java.util.Scanner;

public class CountVowelStartsWith 
{
	public static int count(String s)
	{
		int c = 0;
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				if (!flag) {
					c++;
					flag = true;
				}
			} else if (ch != ' ') {
				flag = true;
			} else {
				flag = false;
			}
		}

		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a String ");
		String str = sc.nextLine();
		System.out.println(count(str));

	}

}
