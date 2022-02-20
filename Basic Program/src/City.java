
public class City {
	
	String Cityname;
	int Pincode;
	
	City()
	{
		Cityname = "Bangalore";
		Pincode = 629931;
	}
	
	public static void main(String[] args) {
		
		City c1 = new City();
		City c2 = new City();
		City c3 = new City();
		
		System.out.println(c1.Cityname + " "+ c1.Pincode  + "    " + c2.Cityname + " "+ c2.Pincode);
		//System.out.println(c2.Cityname + " "+ c2.Pincode);
		System.out.println(c3.Cityname + " "+ c3.Pincode);
		
		
		
	}

}
