import java.util.Scanner;

public class SmallestAmongFourNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 number ");
		
		float x = sc.nextFloat();
		
		float y = sc.nextFloat();
		
		float z = sc.nextFloat();
		
		float m = sc.nextFloat();

		
		
		float s = (x<y && x<z && x < m )  ? x : (y < x && y < z && y< m) ? y :
			( z < x && z < y && z < m  ? z :m) ;
		
		System.out.println("Smallest among four is " + s);

	}

}
