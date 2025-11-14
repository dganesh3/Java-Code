
public class bike 
{
	String brand;
	String model;
	String colour;
	float price;
	bike(String b,String m,String c,float p)
	{
		this.brand=b;
		this.model=m;
		this.colour=c;
		this.price=p;
	}
void details()
{
	System.out.println("Brand="+this.brand);
	System.out.println("Model="+this.model);
	System.out.println("Colour="+this.colour);
	System.out.println("Price="+this.price);
    float tax=this.price*(0.15f);
    float onroadprice=this.price+tax;
    System.out.println("onroadprice="+this.price+tax);
    }
public static void main(String[] args) {
	bike b1=new bike("ktm","duke","orange",205000);
	b1.details();
}

}
