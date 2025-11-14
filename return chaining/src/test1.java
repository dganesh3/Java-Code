
public class test1
{
	static void add(int a,int b)
	{
		int s1=a+b;
	System.out.println(s1+"<-add method-1");
	}
	static void add(int x,int y,int z)
	{
		int s2=x+y+z;
		System.out.println(s2+"<-add method-2");
		}
	public static void main(String[] args) {
		add(2,2);
		add(2,4,3);
	}
}
