import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check leap and non leap year");
		
		int y = sc.nextInt();
		
//		if(y%4 == 0 && (y%100 !=0 || y%400 ==0))
//		{
//			System.out.println("Leap Year");
//		}
//		
//		else {
//			System.out.println("Not a leap year");
//		}
		
		if((y%4 == 0  && y% 100 != 0) || (y% 4 == 0 && y% 100 == 0 && y % 400 == 0)) 
		{
			System.out.println("Leap Year");
		}
		
		else
		{
			System.out.println("Not a leap year");
		}
			
		
		
		
		/*  Using terniary operator  */
		
		//String res = (y%4 == 0 && (y%100 != 0 || y%400 == 0)) ? "leap" : "not a lear year";
				
	}

}
