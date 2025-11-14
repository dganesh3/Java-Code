package arrays;

import java.util.Arrays;

public class MERGE_TWO_ARRAYS_SOrted 
{
	public static int[] merge(int[] n1, int[] n2) 
	{
		int res[] = new int[n1.length + n2.length];
		int i=0,j=0,k=0;
		while(i<n1.length)
		{
			res[k++]=n1[i++];
		}
		while(j<n2.length)
		{
			res[k++]=n2[j++];
		}
		for(int l=0;l<res.length;l++)
		{
			for(int m=0;m<res.length;m++)
			{
				if(res[l]<res[m])
				{
					int temp=res[l];
					res[l]=res[m];
					res[m]=temp;
				}
			}
		}
		return res;
		
	}

	
	public static void main(String[] args) {
		int[] num1 = { 1, -7, 3 };
		int[] num2 = { -4, -5, -6 };
		int[] res=merge(num1, num2);
		for (int i : res) {
			System.out.print(i+" ");
		}
		
	}

}
