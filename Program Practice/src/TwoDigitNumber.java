
public class TwoDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =59;
		
		int a = n%10;
		
		int b = n/10;
		
		int temp = (a*b)+(a+b);
		
		if( temp == n )
			System.out.println("Number is special two digit number");
		
		
		else
			System.out.println("Nuber is not special two digit number");
		
		
		
		

	}

}
