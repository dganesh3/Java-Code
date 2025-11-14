package strings;

public class Anagram {
	static String reverse(String s)
	{
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String ans=new String(arr);
		return ans;
	}
	public static void main(String[] args) {
		String s1="hello";
		String s2="elloh";
		String ans1=reverse(s1);
		System.out.println(ans1);
		String ans2=reverse(s2);
		System.out.println(ans2);
		if(ans1.equals(ans2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not a anagram");
		}
	}

}
