import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		//int n = sc.nextInt();

		//		if((n%3 == 0) && (n%5 == 0)) 
		//		{
		//			System.out.println("fizzbuzz");
		//		}
		//
		//		else if(n % 3 == 0) 
		//		{
		//			System.out.println("fizz");
		//		}
		//
		//
		//		else if(n % 5 == 0) 
		//		{
		//			System.out.println("buzz");
		//		}
		//
		//
		//		else
		//		{
		//			System.out.println("no");
		//		}
		//		

		/* --  Using Conditional --*/
//
//		String s = ((n%3 == 0 && n%5 == 0)?  "fizzbuzz" : (n%3 ==0)? "fizz" : (n%5 == 0)? "buzz": 
//				"no");
//
//		System.out.println(s);
//		
		
		/* -- Middle number -- */
		
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int m = sc.nextInt();
		
		int s = sc.nextInt();
		
		int t = sc.nextInt();
		
		
		
		//int res = ((x<y && x>z || x<z && x>y)? x : (y<x && y>z || y<z && y>x ) ? y :z); 

		//System.out.println(res);
		
		
		/* -- 6 number smallest -- using conditional operator */
		int result = (x<y && x<z && x<m && x< s && x< t) ? x :(y<x && y<z && y<m && y< s && y<t)?y: 
		(z<x && z< y && z < m && z< s && z < t)? z :(s< x && s < y && s< z && s< m && s< t) ? 
				s: t;
		
		System.out.println(result);
	}





}

