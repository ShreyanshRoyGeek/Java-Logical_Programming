import java.util.Scanner;

public class Identify {
	
	
	static String positive()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		 int c = sc.nextInt();
		 
		 int d = c;
		 
		 if(d<0)
		 {
			 d = -(1*d);
		 }
		 
		 
		 return d+ " is the postive form of number " + c;
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int a = sc.nextInt();
		
		/* -- Resolve string line problem  -- */
		
//		String r = sc.next();
//		
//		System.out.println(sc.nextLine()); // By assigning one dummy nextLine() method.
//		
//		String s = sc.nextLine();
//		
//		System.out.println(r);
//		
//		System.out.println(s);
		
		
		if(a>0)
		{
			System.out.println(a+ " is positive ");
		}
		
		else if(a<0)
		{
			System.out.println(a + " is negative ");
		}
		
		else
		{
			System.out.println("Number is 0");
		}
		
		 System.out.println("Enter three integer value ");
		 
		 int x = sc.nextInt();
		 
		 int y = sc.nextInt();
		 
		 int z = sc.nextInt();
		 
		 
		 // Using else-if
		 
//		 if(x>y && y>z)
//		 {
//			 System.out.println("Biggest is "+ x);
//		 }
//		 
//		 else if(y>z)
//		 {
//			 System.out.println("Biggest is "+ y);
//		 }
//		 
//		 else {
//			 System.out.println("Biggest is "+ z);
//		 }
		 
		 
		//   3 - Conditional Operator --
		 
		 
		 int r = (x > y)? x: (y > z ? y : z);
		 
		 int res = (x > y  && x>z)? x: (y > x &&  y>z  ? y : z);
		
		 
		 System.out.println("Biggest value is " + r);
		 
		 System.out.println("Biggest value is " + res);
		 
			
	
		//String c = positive();
		
		//System.out.println(c);
		
	}
	
	

}
