import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter priniciple amount");

		int p = sc.nextInt();
		
		System.out.println("Enter rate of interest ");

		int r = sc.nextInt();
		
		System.out.println("Enter the time of interest");
		
		int t = sc.nextInt();
		
		int s = (p*r*t)/100;
		
		System.out.println("The amount of SI is "+ s);
		
		

	}



}

