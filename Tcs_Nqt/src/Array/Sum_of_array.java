package Array;

import java.util.Arrays;

public class Sum_of_array 
{
	public static void array(int[] n)
	{
		int target=10;
		Arrays.sort(n);
		int i=0;int j=n.length-1;
		while(i<j )
		{
			if(n[i]+n[j]==target)
			{
				System.out.println(n[i]+" "+n[j]);
				i++;j--;
			}
			else if(n[i]+n[j]>target)
			{
				j--;
			}
			else 
			{
				i++;
			}
		}
	}	
	public static void main(String[] args) {
		int[] n= {5,2,4,5,6,7,8,5};
		array(n);
	}

}
