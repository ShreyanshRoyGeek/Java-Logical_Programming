
public class Check {

	long cardnumber;
	String name;
	int cvv;
	String expdate;
	String bankname;



	void swipe()
	{
		System.out.println("Swipe the card ");
	}

	void withdraw()
	{
		System.out.println("Withdraw the money ");
	}

}	
	
	class Debitcard extends Card{

		int creditlimit;

	}
	
	

	class Forexcard extends Card{
		String rootcurrency, targetcurrency;
		
		void loadmoney()
		{
			System.out.println("Load money to forex card");
		}
		
		void convertcurrency()
		{
			System.out.println("Convert the currency");
		}

	}
	
    class  Main{
    	
    	public static void main(String[] args) {
    		
    		Check c = new Check();
    		
    		Debitcard d = new Debitcard();
    	}


		
	}
	
	
	

