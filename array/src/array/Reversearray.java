package array;

public class Reversearray 
{
	public static void array(int[] n)
	{
		//int[] res=new int[n.length];
		for(int i=n.length-1;i>=0;i--) {
		//	res[i]=n[i];
			System.out.print(n[i]+" ");
		}
	}
public static void main(String[] args) {
	int[] n= {1,2,3,4,5};
	array(n);
} 
}
