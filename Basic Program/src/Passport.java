
public class Passport {
	
	String Name;
	String Citizen;
	int PassNumber;
	
	Passport()
	{
		Name = "Shreyansh";
		Citizen = "Indian";
		PassNumber = 95077;
	}
	
	public static void main(String[] args) {
		
		Passport p1 = new Passport();
		Passport p2 = new Passport();
		
		System.out.println(p1.Name + " " + p1.Citizen + " "+p1.PassNumber);
		System.out.println(p2.Name + " " + p2.Citizen + " "+p2.PassNumber);
		
		
	}

}
