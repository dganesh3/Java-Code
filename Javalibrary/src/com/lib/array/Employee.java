package com.lib.array;

public class Employee 
{
	String name;
	int id;
	double sal;
	public Employee(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString()
	{
		return "[ Employee Details : name ="+name+" id= "+id+" sal="+sal+" ]";
	}
	

	@Override
	public int hashCode() {
		
		return 300;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee("gana", 101, 50000.0);
		Employee e2=new Employee("phani", 102, 40000.0);
		Employee e3=new Employee("vamsi", 103, 30000.0);
		//create employee array
		Employee[] emparray= {e1,e2,e3};
//		Object[] obj= {e1,e2,e3,10,90,"haaha..haha"};
		for(int i=0;i<=emparray.length-1;i++)
//		for(int i=0;i<=obj.length-1;i++)
		
		{
//			System.out.println(obj[i]);
			System.out.println(emparray[i]);
		}
		System.out.println(e1.equals(e2));

	}
}
