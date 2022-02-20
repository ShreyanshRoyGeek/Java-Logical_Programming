import java.util.Scanner;


public class ArrayPrimeCount {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.println("Enter the " + n + " elements");

		for(int i = 0; i< n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int countPrime = 0;
		for(int i = 0; i< n; i++)
		{
			int count = 0;
			
			if(arr[i] == 1)
			{
				count++;
			}
			
			for(int j = 2; j<arr[i]; j++)
			{
				if(arr[i]%j == 0)
				{
					count++;
					break;
				}
			}

			if(count == 0)
			{
				countPrime++;
			}
		
		}

		System.out.println("No of prime is "+ countPrime);

	}
}
