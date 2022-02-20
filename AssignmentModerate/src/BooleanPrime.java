import java.util.Scanner;

public class BooleanPrime {


	static boolean isPrime(int x)
	{


		for(int i = 2; i<=x/2; i++)
		{
			if(x % i == 0)
				return false;
		}

		return true;

	}


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		boolean res = isPrime(n);

		if(res == true)
		{
			System.out.println(n + " is prime");

		}

		else

			System.out.println(n + " is not a prime");


		/* -- Printing the prime number -- */ 

		for(int x =2 ;x<=n; x++)
		{
			boolean res1 = isPrime(x);

			if(res1 == true)
			{
				System.out.print(x + " ");
			}

		}
	}	
}