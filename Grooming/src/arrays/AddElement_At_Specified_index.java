package arrays;

import java.util.Arrays;

public class AddElement_At_Specified_index 
{
	public static int[] add(int[] num,int elem,int index)
	{
		int []res=new int[num.length+1];
		for(int i=0;i<index;i++)
		{
			res[i]=num[i];
		}
		res[index]=elem;
		for(int i=index;i<num.length;i++)
		{
			res[i+1]=num[i];
		}
		System.out.println(Arrays.toString(res));
		return res;
	}
	public static void main(String[] args) 
	{
		int []arr= {1,2,3};
		add(arr,20,1);
		//print(arr);
	}

}
