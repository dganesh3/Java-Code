package org.jsp.example;
class Exam
{
	public void food()
	{
		System.out.println("foodddd");
	}
}
public class OverirideExample extends Exam
{
	
	public static void main(String[] args) {
		OverirideExample example=new OverirideExample();
		example.food();
	}

}
