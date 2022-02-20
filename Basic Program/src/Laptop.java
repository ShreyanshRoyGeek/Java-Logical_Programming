
public class Laptop {
	
	String Brand;
	double Display_Size;
	int Price;
	
	Laptop(String Brand, double Display_Size, int Price)
	{
		this.Brand = Brand;
		this.Display_Size = Display_Size;
		this.Price = Price;
		
	}
	
	public static void main(String[] args) {
		
		Laptop l1 = new Laptop("Dell",4.3,35000);
		Laptop l2 = new Laptop("Apple",4.3,95000);
		Laptop l3 = new Laptop("HP",4.3,45000);
		
		System.out.println(l1.Brand + " " + l1.Display_Size +  " "+ l1.Price);
		System.out.println(l2.Brand + " " + l2.Display_Size +  " "+ l2.Price);
		System.out.println(l3.Brand + " " + l3.Display_Size +  " "+ l3.Price);
		
	}

}
