/* ---- AP, GP and HP Implementation ----*/

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0, count = 1;

		System.out.println("Enter the first term ");
		int a = sc.nextInt();

		System.out.println("Enter the common difference");

		int d = sc.nextInt();

		System.out.println("Enter the number of terms ");

		int n = sc.nextInt();


		int sum=0;


		System.out.print(a+ " ");
		sum = a;

		//     ---    For Loop Implementation of AP  --- //

		//		for(count=1;count<n;count++)
		//		{
		//			sum = sum + d;
		//			
		//			System.out.print(sum + " ");
		//
		//			//count++;
		//		} 



		// ---- Code for GP --> using do-while  ---- //

		do

		{
			sum = sum*d;
			System.out.print(sum + " ");

			count++;


		} while (count < n);


		System.out.println();
		
		
	}



}
