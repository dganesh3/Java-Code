package constructor;

public class Student
{
	String name="rahul";
	int marks;
	Student(String name,int marks)
	{
		System.out.println(name);
		System.out.println(this.name);
		
	}

	public static void main(String[] args) 
	{
		Student s1=new Student("Sai",50);
// System.out.println(s1.name);
	}

}
