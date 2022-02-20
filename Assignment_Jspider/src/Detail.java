import java.util.Scanner;

public class Detail {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String y = sc.nextLine();
		
		System.out.println("Enter your mobile number ");
		
		long m = sc.nextLong();
		
		
		System.out.println("Name is " + y + " and Mobile number is "+ m);
		
		
	}
}
