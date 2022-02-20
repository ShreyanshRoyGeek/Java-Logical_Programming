/* -- Sum of multiples of 3's with in n  -- */

import java.util.Scanner;

public class SumMultiple {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 3; i<=n; i+=3)
		{
			sum = sum + i;
		}
		
		System.out.println("Sum of multiples of 3's with in n is " + sum);

		
		int  s = 6578;
		
		String str = "" + s;
		System.out.println(str.length());
		
		int i=10;  
		String r=String.valueOf(i);//Now it will return "10" 
		
		System.out.println(r.length());
	}

}
