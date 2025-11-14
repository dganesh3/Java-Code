package array;
import java.util.*;
public class ArrayInput
{
	public static void printArray(int [] a1)
	{
		int sum =0;
		for (int i =0;i<=a1.length-1;i++)
		{
			if(a1[i]%2==0)
			{
				sum=sum+a1[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter array size");
		int size =sc.nextInt();
		int [] ar1=new int[size];
		System.out.println("enter array elements");
		sc.close();
		
	}
}