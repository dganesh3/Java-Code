
public class student 
{
	String name;
	int physics;
	int chemistry;
	int maths;
	int optional;
	student(String n,int p,int c,int m,int o)
	{
		this.name=n;
		this.physics=p;
		this.chemistry=c;
		this.maths=m;
		this.optional=o;
	}
	void details()
	{
		System.out.println("name="+this.name);
		System.out.println("physics="+this.physics);
		System.out.println("chemistry="+this.chemistry);
		System.out.println("maths="+this.maths);
		System.out.println("optional="+this.optional);
		}
    void total()
    {
    	int sum=this.physics+this.chemistry+this.maths+this.optional;
    System.out.println("total="+sum);	
    }
    void percentage()
    {
    	int sum=this.physics+this.chemistry+this.maths+this.optional;
    	float perc=(sum/400.0f)*100;
    	System.out.println("percentage="+perc);
    }
    void getcompletedetails()
    {
    	this.details();
    	this.total();
    	this.percentage();
    }
    public static void main(String[] args) {
		student s1=new student("rahul",77,87,65,73);
		student s2=new student("rohit",78,82,91,84);
		s1.getcompletedetails();
		
	}
}

