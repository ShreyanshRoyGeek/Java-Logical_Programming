import java.util.Scanner;

public class Square {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of square ");

		int length = sc.nextInt();

		
		int area = length*length;
		
		System.out.println("Area of square is "+ area);
		
		int perimeter = 4*(length);
		
		System.out.println("Perimeter of square is "+ perimeter);
		
		
	}

}
