package String;

public class Non_Repeating_Character
{
	public static String print(String str)
	{
	//	String res="";
		int i=0;
		int j=0;
		for( i=0;i<str.length()-1;i++)
		{
			for( j=i+1;j<str.length()-1;j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					//res=""+str.charAt(j);
					break;
				}
			}
		}
		return ""+str.charAt(1);
	}
	public static void check(String s) {
		char[] ch=s.toCharArray();
		String res="";
		int c=0;
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1]) {
				c++;
				res=res+ch[i];
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		//sSystem.out.println(print("swwiss"));
		check("nitin");
	}

}
