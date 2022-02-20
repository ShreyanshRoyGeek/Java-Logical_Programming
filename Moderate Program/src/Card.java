// --- Inheritance Implementation --> Super-Class ---- //

public class Card {

	long cardnumber;
	String name;
	int cvv;
	String expdate;
	String bankname;

	String rootcurrency = "4500000 INR";


	Card(String x)
	{
		this();
		System.out.println("Super-class param Constructor "+ x);

	}

	Card()
	{
		System.out.println("Super class non param constructor ");
	}

	void swipe()
	{
		System.out.println("Swipe the card ");
	}

	void withdraw()
	{
		System.out.println("Withdraw the money ");
	}

//	public static void main(String[] args) {
//		
//		Card c = new Card();
//	}
	
}
