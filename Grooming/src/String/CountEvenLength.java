package String;

import java.util.Scanner;

public class CountEvenLength 
{
	public static void wordscount(String str)
	{
		int c=0;
		
		char ch[]=str.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]%2==0&&ch[i]!=' '&&ch[i-1]==' ')
			{
				c++;
			}
		}
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a sentence:");
		        String str = sc.nextLine();
		        int count = 0;
		        int wordLength = 0;
		        for (int i = 0; i < str.length(); i++) 
		        {
		            char ch = str.charAt(i);
		            if (ch != ' ') 
		            {
		                wordLength++;
		            } 
		            else 
		            {
		                if (wordLength > 0 && wordLength % 2 == 0) 
		                {
		                    count++;
		                }
		                wordLength = 0;
		            }
		        }
		        
		       //  Check last word if the sentence does not end with space
		        if (wordLength > 0 && wordLength % 2 == 0) {
		            count++;
		        }
		    
		        System.out.println("Number of even-length words: " + count);
		    }
		
	
}
