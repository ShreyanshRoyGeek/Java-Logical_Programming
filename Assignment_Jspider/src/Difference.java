/*  -- Difference b/w highest and lowest among three numbers -- */ 

import java.util.Scanner;

import java.util.Random;

public class Difference {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter the three number");
//
//		int a = sc.nextInt();
//
//		int b = sc.nextInt();
//
//		int c = sc.nextInt();




		//		/* -- If- else ladder -- Sir */
		//		
		//		
		//		if(a>b && b<c)
		//		{
		//			System.out.println(a -c);
		//		}
		//		
		//		if(c >a && b>a)
		//		{
		//			System.out.println(c - a);
		//		}
		//		
		//		
		//		if(b>c && c>a)
		//		{
		//			System.out.println(b -a);
		//		}
		//		
		//		
		//		if(a>c && b>c)
		//		{
		//			System.out.println(a -c);
		//		}
		//		
		//		if(c>b && a>b)
		//		{
		//			System.out.println(c -b);
		//		}
		//		







		/* -- If else Ladder -- Sir  --> Middle Element of 3 number  */

		//		if(x>y && x<z || x>z && x<y)
		//		{
		//			System.out.println(x);
		//		}
		//		
		//		else if (y >x && y< z || y>z && y<x)
		//		{
		//			System.out.println(y);
		//		}
		//		
		//		else 
		//		{
		//			System.out.println(z);
		//		}







		/* -- Using comparison variable  -- Sir Approach -- */ 

		//		int big = a, small = a;
		//		
		//		if(big<b)
		//		{
		//			big = b;
		//		}
		//		
		//		if(big<c)
		//		{
		//			big = c;
		//		}
		//		
		//		if(small>b)
		//		{
		//			small = b;
		//		}
		//		
		//		if(small>c)
		//		{
		//			small = c;
		//		}
		//		
		//		
		//		int res = big-  small;
		//		
		//		System.out.println("the diffreence between biggest and smallest is " + res);







		/* -- Using ternary operator -- Me */ 

//		int biggest = (a > b)? a:(b > c ? b : c);
		
//      int biggest = (a>b && a>c) ? a : (b>c) ? b:c;
		
//		int big = (a>b) ? a: b;
//		int biggest = big>z : big:z;
//
//		int smallest = (a < b)? a:( b < c ? b : c);
//
//		int result = biggest - smallest;


		//System.out.println("the difference between biggest and smallest is " + result);



		Random rd = new Random();

		int rn = rd.nextInt(10);
	

		System.out.println(rn);





	}

}
