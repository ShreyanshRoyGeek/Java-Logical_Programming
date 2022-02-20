
public class DebitCard extends Card{
	
	int creditlimit;
	
	void check()
	{
		System.out.println("Check the balance ");
	}
	
	void loadmoney()
	{
		System.out.println("Load money to Debit card");
		
	}
	
	@Override
	void swipe() {
		
		System.out.println("Swipe the DebitCard ");
	}
}

