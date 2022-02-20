
public class Flight {
	
	String Source, Destination, FlightName;
	int FlightNo;
	int FlighId;
	
	Flight()
	{
		
	}
	
	Flight(String FlightName, String Source, String Destination)
	{
		this.FlightName = FlightName;
		this.Source = Source;
		this.Destination = Destination;
	}
	
	Flight(String FlightName, String Source, String Destination, int FlightNo)
	{
		this.FlightName = FlightName;
		this.Source = Source;
		this.Destination = Destination;
		this.FlightNo = FlightNo;
	}
	
	public static void main(String[] args) {
		
		
		Flight f1 = new Flight();
		System.out.println(f1.Destination + " " +f1.Source +" " + f1.FlightName +" "+ f1.FlightNo);
		
		
		Flight f2 = new Flight("Indigo", "Bangalore", "Kolkata");
		System.out.println(f2.Source + " "+f2.Destination);
		
		
		Flight f3 = new Flight("AirIndia", "Bangalore", "D",4354);
		System.out.println(f3.Source + " "+f3.Destination +" "+ f3.FlightNo);
		
		
				
	}

}
