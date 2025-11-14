package condition;

public class character 
{
	public static String word(char vowel)
	{
		switch(vowel)
		{
		case 'a':return("given letter is vowel");
		case 'e':return("given letter is vowel");
		case 'i':return("given letter is vowel");
		case 'o':return("given letter is vowel");
		case 'u':return("given letter is vowel");
		case 'A':return("given letter is vowel");
		case 'E':return("given letter is vowel");
		case 'I':return("given letter is vowel");
		case 'O':return("given letter is vowel");
		case 'U':return("given letter is vowel");
		default: return("given letter is not vowel");
		}
		}
	public static void main(String[] args) {
		System.out.println(word('e'));
		System.out.println(word('s'));
	}

}
