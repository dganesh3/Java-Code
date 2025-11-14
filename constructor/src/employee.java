
public class employee
{
	String name;
	String company;
	float salary;
	employee(String n,String c,float s)
	{
		this.name=n;
		this.company=c;
		this.salary=s;
		}
	void details()
	{
		System.out.println("Name="+this.name);
		System.out.println("Company="+this.company);
		System.out.println("Salary="+this.salary);
	}
	void addbonus(float b)
	{
		float bonus=this.salary*(b/100.0f);
		this.salary=this.salary+bonus;
		System.out.println("salary updated");
	}
	public static void main(String[] args) {
		employee e1=new employee("ganesh","tcs",30000);
		e1.details();
		e1.addbonus(10.3f);
		System.out.println(e1.salary);
	}

}
