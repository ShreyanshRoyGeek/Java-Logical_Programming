
public class Mobile {
	
	String Name;
	String Colour;
	String Company;
	int Number;
	int Price;
	
	Mobile()
	{
		Name = "i-phone11Pro" ;
		Colour = "Black";
		Company = "Apple";
		Number = 44234;
		Price = 65000;
		
	}
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		System.out.println(m1.Name + " " + m1.Colour + " "+ m1.Company + " " + m1.Number + " "+ m1.Price);
		
	}

}
