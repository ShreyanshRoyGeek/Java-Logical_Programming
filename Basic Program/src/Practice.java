public class Practice {

	String Name = "Shreyansh";
	String Ambition;
	Integer PracticeTime_Months;

	

	public static void main(String[] args) {
		

		Practice p1 = new Practice();

		p1.Name = "Shreyansh Roy";

		p1.Ambition = "Proficient Programmer";

		p1.PracticeTime_Months = 5;

		System.out.println(" Name - " + p1.Name);
		System.out.println(" Ambition - " + p1.Ambition);
		System.out.println(" Time of practice in months - " + p1.PracticeTime_Months);

		PowerCube(5);
	}
	
	static void PowerCube(int x) {
		
	
		System.out.println(" Cube of " + x + " is " + x*x*x);
		
//		System.out.println(" This is the defined getter to get or fetch the data"
//				+ "for Practice class program");

//		System.out.println(" Name -" + P1.Name);
//		System.out.println(" Ambition -" + p1.Ambition);
//		System.out.println(" Time of practice in months -" + p1.PracticeTime_Months);
	
	}

}
