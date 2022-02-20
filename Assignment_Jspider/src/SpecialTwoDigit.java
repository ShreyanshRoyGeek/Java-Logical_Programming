import java.util.Scanner;

public class SpecialTwoDigit {

	static void specialDigit() 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two digit number");

		int a = sc.nextInt();
		
		int b = a;

		int sum = 0;
		
		int product = 1;
		
		while(a>0)
		{
			int re = a%10;
			
			a= a/10;
			
			sum = sum + re;
			
			product = product * re ;
			
			
//			int re2 = a%10;
//			
//			a= a/10;
//			
//			sum = re1+ re2 + re1*re2;

		}
		
		sum = sum + product;

		if(sum == b)
		   System.out.println("Two digit number "+ b + " is special two digit number "+ sum);

		else
		   System.out.println("Two digit number "+ b + " is not a special two digit number " + sum);

	}
	
	
	static void special2digit()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two digit number");

		int n = sc.nextInt();
		
		int a = n%10;
		
	    int b = n/10;
	    
	    int res = a + b + a * b;
	     
		
		String str = (res == n) ? "Special 2 digit number " : "Not a special two digit number ";
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		special2digit();
		
		//specialDigit();
	}

}
