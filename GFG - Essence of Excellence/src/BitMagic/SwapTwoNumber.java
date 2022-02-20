package BitMagic;

// SwapTwoNumber using bitwise operator  

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 7;
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		
		System.out.println(a + " " + b );
		
		

	}

}
