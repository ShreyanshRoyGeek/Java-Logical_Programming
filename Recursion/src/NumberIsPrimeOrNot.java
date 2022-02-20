import java.util.Scanner;

public class NumberIsPrimeOrNot {
	
	static boolean isPrime(int x)
	{
		return check_prime(x,2);
	}
	
	static boolean check_prime(int n,int i)
	{
		if(n%i == 0)
		{
			return false;
		}
		if(n>2)
		{
			return true;
		}
		
		return check_prime(n,i+1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int x = sc.nextInt(); 
		

		boolean res = isPrime(x);
		
		if(res == true)
		{
			System.out.println("prime");
		}
		
		else
			System.out.println("not a prime");
 
		
		

	}

}
