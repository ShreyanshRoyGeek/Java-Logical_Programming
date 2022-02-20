/* ---- Inheritance Implementation --> Sub-class ---- */
//import java.util.Scanner;

public class ForexCard extends Card{

	String rootcurrency = "2500000 INR", targetcurrency = "20000 Euro";

     

	ForexCard()
	{
		this("Shreyansh");

		System.out.println("Sub-class non param constructor");
	}

	ForexCard(String x)
	{
		super("Jspider");

		System.out.println("Sub-class parameterized constructor");

	}

	void loadmoney()
	{
		System.out.println("Load money to forex card");
	}

	void convertcurrency()
	{
		System.out.println("Convert the currency");

		System.out.println(super.rootcurrency+ "  "+ this.rootcurrency );

	}


	@Override
	void swipe() {
		// TODO Auto-generated method stub
		//super.swipe();

		System.out.println("Swipe the forexcard ");	
	}

	





	/* ----- MultipleObject return  ---- */



	//	Card SelectObject()
	//	{
	//
	//		System.out.println("Enter one value either 0  or 1");
	//
	//		Scanner sc = new Scanner(System.in);
	//
	//		int y = sc.nextInt(); sc.close();
	//
	//		if(y == 0) 
	//		{
	//			Card d = new DebitCard();
	//
	//			return d;
	//		}
	//
	//		else if(y == 1)
	//		{
	//			Card f = new ForexCard();
	//
	//			return f;
	//
	//		}




}	

