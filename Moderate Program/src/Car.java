
public class Car {
	
	String name; 
	int pickUpDate;
	double pickUpTime;
	
	int dropOffDate;
	double dropOffTime;

	
	Car()
	{
		
	}
	
	
	Car(String name, int pickUpDate, double pickUpTime, int dropOffDate, double dropOffTime)
	{	
	    this.name       = name;
		this.pickUpDate = pickUpDate;	
		this.pickUpTime = pickUpTime;
		this.dropOffDate = dropOffDate;
		this.dropOffTime = dropOffTime;
		
	}
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		System.out.println(c1.name+" "+c1.pickUpDate +"July "+ " "+ c1.pickUpTime+ "AM "+ " "+ c1.dropOffDate+ " Aug "+
				+c1.dropOffTime +"AM");
		
		Car c2 = new Car("Oddi",11,6.00,15,8.00);
		
		System.out.println(c2.name+" "+c2.pickUpDate +"July "+ " "+ c2.pickUpTime + "AM "+ " "+ c2.dropOffDate+  "Aug "
		+c2.dropOffTime + "PM");
			
	}
}
