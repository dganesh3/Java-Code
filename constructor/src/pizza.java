
public class pizza
{
	String type="Regular";
	int price=150;
	String toping1;
	String toping2;
	boolean cheese;
	pizza(String t1,String t2,boolean ch)
	{
		this.toping1=t1;
		this.toping2=t2;
		this.cheese=ch;
		this.price=this.price+70;
		if(ch==true)
		{
			this.price=this.price+80;
		}
	}
	pizza(String t1,boolean ch)
	{
		this.toping1=t1;
		this.cheese=ch;
		this.price=this.price+40;
		if(ch==true)
		{
			this.price=this.price+80;
		}
	}
	pizza(boolean ch)
	{
	if(ch==true)
	{
		this.price=this.price+80;
	}
	}
	void bill()
	{
		System.out.println("Type="+this.type);
		System.out.println("Extra-toping1="+this.toping1);
		System.out.println("Extra-toping2="+this.toping2);
		System.out.println("Extra cheese="+this.cheese);
		System.out.println("Price="+this.price);
		float gst=this.price*0.18f;
		System.out.println("Gst="+gst);
		float total=this.price+gst;
		System.out.println("Total="+total);
	}
	public static void main(String[] args) {
		pizza p1=new pizza(false);
		p1.bill();
	}

}
