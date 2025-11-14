package String;

public class LongestPalindrome_String {
	static boolean isPall(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	static void palindrome(String s)
	{
		String res="";
		for(int i=0;i<=s.length()-1;i++)
		{
			res=s.charAt(i)+res;
		}
		System.out.println(res);
		if(res.equals(s))
			System.out.println("palindrome");
		else
			System.out.println("not");
			
	}

	public static void main(String[] args)
	{
		palindrome("madam");
		String s = "abbaaab";
		String longest = "";
		int length = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				if (isPall(sub)) {
					if (sub.length() > length) {
						longest = sub;
						length = sub.length();
					}
				}
			}

		}
		System.out.println(longest);
	}
}
