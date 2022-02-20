import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Enter a number to check even or odd ");
//		
//		int n = sc.nextInt();
//		
//		switch(n % 2)
//		{ 
//		
//		case 0 :
//			System.out.println("Even"); 
//			break;
//			
//		case 1 :
//			System.out.println("Odd");
//			break;
//		}
		
		System.out.println("Enter a months number (1 -12) ");
		
		int m = sc.nextInt();
		
		switch(m)
		{
		case 1:
			
		case 3: 
		case 5:
		case 7:
		case 8:
		case 10: 
		case 12: 
			System.out.println("31 days ");
			break;
				
		case 4:
		case 6:
		case 9:	
		case 11:
			System.out.println("30 days");
			
		case 2:
			System.out.println("28 or 29 days");
			break;
		
		default :
			System.out.println("Invalid");			
		
		}
		
		
		
	}

}
