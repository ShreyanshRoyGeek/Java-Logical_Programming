
public class Test {
	
	public static void main(String[] args) {
		
		ISwitch i = new FanImpl(); // Up-Casting
		
		BulbImpl b = (BulbImpl) i; // Down-Casting   --> CCE
		
		
		
		
	}

}
