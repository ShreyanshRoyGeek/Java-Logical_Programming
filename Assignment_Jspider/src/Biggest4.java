import java.util.Scanner;

public class Biggest4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 number ");
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
		int z = sc.nextInt();

		//int m = sc.nextInt();
		
        /* For 4 integers */
		
//		int s = (x>y && x>z && x > m )  ? x : (y > x && y > z && y> m) ? y : ( z > x && z > y && z > m  ? z :m) ;
//		
//		int se = (x>y && x>z && x > m )  ? x : (y > z && y> m) ? y : (z > m  ? z :m) ;
//
//		System.out.println(s);
//		
//		System.out.println(se);
		
		 
		
		/* For 3 integers biggest  */
		
		
//		int res = (x > y && x>z) ? x : (y>z) ? y : z ; 
//		
//		System.out.println(res);
		
//		int se = (x> y && y>z) ? x : y>z ?  y : z;
//		System.out.println(se);
		
		
		/* Trying to print the middle value */
		
		int result = (x>y && x<z || x>z && x< y) ? x : (y>z && y<x || y>x &&  y<z )? y :z;
		
		System.out.println(result);
		
	}

}
