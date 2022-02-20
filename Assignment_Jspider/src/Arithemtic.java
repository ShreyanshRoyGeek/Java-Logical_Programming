import java.util.Scanner;

public class Arithemtic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two number ");

		int a = sc.nextInt();

		int b = sc.nextInt();


		System.out.println("Addition of two number is " + (a+b));

		System.out.println("Subtraction of two number is " + (a-b));

		System.out.println("Multiplication of two number is " + (a*b));

		System.out.println("Division of two number is " + (a/b));
		
		System.out.println("Modulus of two number is " + (a+b));


	}
}