
public class LowBalanceException extends Exception {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		//return super.toString();
		
		return "Balance should not be less than 5000";
	}

}
