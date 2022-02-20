import java.util.Scanner;
public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 number ");

		int x = sc.nextInt();

		int y = sc.nextInt();

		int z = sc.nextInt();

		int result1 = (x>y && x<z || x>z && x< y) ? x : (y>z && y<x || y>x &&  y<z )? y :z;

		System.out.println(result1);

	
	}

}
