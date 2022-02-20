import java.util.Scanner;

public class Factorial {
	
	 static void factorial()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number for factorial ");
		
		int n = sc.nextInt();
		
		int i = n;
		
		while(i>=1)
		{
			
			System.out.print(i + " ");
			i--;
		
		}
	
	}
	 
	   void divisor()
	 {
		 int i = 1, count = 1; 
		
		 prime();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 for(i =1 ; i<=n/2 ; i++)
		 {
			 if(n%i == 0) 
				 
			 {
				 
				 count ++;
			 }
			 
		 }
		 
		 System.out.println("Divisor of number " + n + " is " + count);
	 }
	  
	 static void prime()
	  {
		  int i = 1, count = 2; 
			
			 
			 Scanner sc = new Scanner(System.in);
			 
			 int n = sc.nextInt();
			 
			 if (n == 1)
			 {
				 System.out.println("Nor a prime nor composite"); 
				 return; 
			 }
			 
			 for(i = 2 ; i<=n/2 ; i++)
			 {
				 if(n%i == 0) 
					 
				 {
					 count ++;
					 break;
				 }
				 
			 }
			 
			 if(count == 2)
			 {
				 System.out.println("Prime number");  
			 }
			 
			 else 
			 {
				 System.out.println(" Not a prime ");
			 }
				 
	  }

	public static void main(String[] args) {
		
		
		prime();
		
		
		
		//factorial();
		
		//divisor();
		
		//Factorial.factorial();
		
		
		
	}

}
