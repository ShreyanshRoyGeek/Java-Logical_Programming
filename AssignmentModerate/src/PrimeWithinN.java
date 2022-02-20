import java.util.Scanner;

public class PrimeWithinN {


	static boolean isPrime(int x)
	{
		boolean res = true;

		for(int i=2; i<=x/2;i++)
		{
			if(x%i == 0)
			{
				res =  false;	
			}
			
			else
				res =  true;	   
		}

		return res;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

	
		for(int i=2; i<=n; i++)
		{
			boolean result = isPrime(i);

			if(result == true)
			{
				System.out.print(i + " ");
				
			}
		}

		
	}

}
