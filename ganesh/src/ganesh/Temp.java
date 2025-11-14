package ganesh;

public class Temp 
{
	public int sortaSum(int a, int b) 
	{
	  int sum = a + b;
	  if(sum>10 && sum<19)
	  {
	    return 20;
	  }
	  else 
	  {
	    return sum;
	  }
	}
	public static void main(String[] args) 
	{
		Temp t = new Temp();
		int a = t.sortaSum(10,8);
		System.out.println(a);
	}
}
