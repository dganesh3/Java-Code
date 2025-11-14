
public class word 
{
	public static void word(char vowel)
	{
		switch(vowel)
		{
		case 'a':System.out.println("given letter is vowel");break;
		case 'e':System.out.println("given letter is vowel");break;
		case 'i':System.out.println("given letter is vowel");break;
		case 'o':System.out.println("given letter is vowel");break;
		case 'u':System.out.println("given letter is vowel");break;
		case 'A':System.out.println("given letter is vowel");break;
		case 'E':System.out.println("given letter is vowel");break;
		case 'I':System.out.println("given letter is vowel");break;
		case 'O':System.out.println("given letter is vowel");break;
		case 'U':System.out.println("given letter is vowel");break;
		default: System.out.println("given letter is not vowel");
		}
		}
	public static void main(String[] args) {
		word('a');
		word('s');
	}

}
