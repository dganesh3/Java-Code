package functionalinterface;
interface Abc
{
	int large(int a,int b);
}
public class Largest_TWo_Numbers {

	public static void main(String[] args) 
	{
		//using annonymous class
		Abc a1=new Abc()
				{

					@Override
					public int large(int a, int b) {
						if(a>b)
						{
						return a;	
						}
						return b;
					}
			
				};
				System.out.println(a1.large(9, 89));
				//using lamda function
				System.out.println("---------------------");
		Abc a=(int n,int m)->
		{
			if(n>m)
			{
				return n;
			}
			return m;
		};
		System.out.println(a.large(8, 9));
	}

}
