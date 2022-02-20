import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length ");

		int length = sc.nextInt();

		System.out.println("Enter the Breadth ");

		int breadth = sc.nextInt();
		
		int area = length*breadth;
		
		System.out.println("Area of rectangle is "+ area);
		
		int perimeter = 2*(length + breadth);
		
		System.out.println("Perimeter of rectangle is "+ perimeter);
		
		System.out.println("The number is " + 3+4);
		
		
		

	}

}
