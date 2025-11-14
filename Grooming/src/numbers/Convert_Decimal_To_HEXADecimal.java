package numbers;

public class Convert_Decimal_To_HEXADecimal 
{
	static void binary(int dec)
	{
		String bin="";
		while(dec>0)
		{
			int rem=dec%2;
			bin=rem+bin;
			dec/=2;
		}
		System.out.println(bin);
	}
	static void hexa(int dec) 
	{
		String hex="";
		while(dec>0)
		{
			int rem=dec%16;
			if(rem>9)
			{
				hex=(char)(rem+55)+hex;

			}
			else
			{
				hex=rem+hex;

			}
			dec=dec/16;
		}
		System.out.println(hex);
	}
	public static void main(String[] args) 
	{
		hexa(31);
		binary(11);
	}
}
