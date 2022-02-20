
public class Car {
	
	String Brand;
	String Name;
	String Type;
	int Price;
	int ModelNo;
	
  
	Car(String Brand, String Name)
	{
		this.Brand = Brand;
		this.Name = Name;
	}

	Car(String Brand, String Name,String Type, int Price, int ModelNo)
	{
		
		this.Brand = Brand;
		this.Name = Name;
		this.Type = Type;
		this.Price = Price;
		this.ModelNo = ModelNo;
	}
	
	public static void main(String[] args) {
		
		
		Car c1 = new Car("Mercediz Benz","E20");
		
		c1.Print();
		
				
		Car c2 = new Car("BMW","E9","Diesel",20000000,324);
		
		c2.Print();	
		
		
	}
	
	public void Print()
	{
		System.out.println(Brand + " " + Name);
	}
	
}
