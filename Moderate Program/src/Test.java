/* ---- Inheritance Implementation --> Main Method ---- */

import java.util.Scanner;

public class Test {

	/* ----- MultipleObject return  ----- */

	Card selectObject()
	{
		Card crd = null;

		System.out.println("Enter one value either 0 or 1");

		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt(); sc.close();

		if(y == 0) 
		{
			crd = new DebitCard();

		}

		else if(y == 1)
		{
			crd = new ForexCard();


		}

		else
		{
			System.out.println("Invalid output ");
			
			crd = new Card();

		}


		return crd;
	}



	public static void main(String[] args) {


		//Card  f = (Card) new ForexCard();

		//Object f = new ForexCard();

		Card c = new ForexCard();
		
		
		
		ForexCard  f = (ForexCard)c;


		f.swipe();

		f.withdraw();

		f.loadmoney();

		f.convertcurrency();

	

	}

}
