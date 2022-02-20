import java.util.Scanner;

public class PrimeCount {

	static int primec(int x)
	{
		for(int i = 2 ; i <= x/2; i++)
		{
			if(x%i == 0)
			{
				return 0;
			}	
		}
		return 1;

	}


	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number ");

		int count = 0;

		int n = sc.nextInt();
	
		for(int i = 2; i< n ; i++ )
		{
			if (primec(i)  == 1)
			{
				count ++;
			}
			
		}

		System.out.println(count);
	
	}

}