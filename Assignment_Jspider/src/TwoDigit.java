import java.util.Scanner;

public class TwoDigit {
	
	static void check2digit()
	{
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter a number");
		
		 int a = sc.nextInt();
		 
		 int b = a;
		
		 int re = 0;
		 
		 while(a>0)
		 {
			 re = a%10;
			 
			 a = a/10;
			 
			 count++;
		 }
		 
		 if(count == 2 )
		 {
			 System.out.println("The number " + b +  " are 2 digits numbers");
		 }
		 
		 else
		 {
			 System.out.println("Invalid check ");
		 }
	
	}
	
	public static void main(String[] args) {
		
		check2digit();
	}
	

}
