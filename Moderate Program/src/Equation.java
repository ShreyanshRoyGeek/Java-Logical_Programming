/* ---- Simple Scanner Class ---- */

import java.util.Scanner;

public class Equation {

	static int m = (5*4+8/2*2+2);
	
	void test()
	{
		System.out.println("Test Method");
	}

	public static void main(String[] args) {

		 int m = (5*4+8/2*2+2);

		Scanner sc = new Scanner(System.in);  

		System.out.println("Enter two terms ");

		String n = sc.nextLine();

		int z = sc.nextInt();  sc.close();


		Equation e = new Equation();

		System.out.println(n);

		System.out.println(z);

		System.out.println(m);
	}
}
