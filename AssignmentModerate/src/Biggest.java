import java.util.Scanner;

public class Biggest {

	static int biggest3()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three number ");
		
		int a = sc.nextInt();

		int b = sc.nextInt();

		int c = sc.nextInt();

		int max = (a > b && a > c?  a : b> a &&  b>c ? b :c);

		return max;

	}

	public static void main(String[] args) {

		int result = biggest3();

		System.out.println("The biggest among the three number is " + result);
	}
}
