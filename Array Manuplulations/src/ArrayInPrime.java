import java.util.Scanner;
public class ArrayInPrime {

	static boolean isPrime(int x)
	{
		if(x == 1)
		{
			return false;
		}

		for(int j = 2; j<=x/2; j++)
		{
			if(x%j == 0)
			{

				return false;
			}

		}

		return true;

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int n = sc.nextInt();

		int arr[] = new int[n];



		System.out.println("Enter the " + n + " elements");

		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}


		int count = 0;
		for(int i = 0; i<n; i++)
		{
			boolean rs = isPrime(arr[i]);

			if(rs == true)
			{
				count++;
			}
		}

		System.out.println(count);

	}	

}
