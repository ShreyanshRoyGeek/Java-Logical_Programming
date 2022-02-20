import java.util.Scanner;

public class EvenOddArray {




	static int[] countEvenOdd(int arr[], int n)
	{


		int  evenCount = 0, oddCount = 0;

		int result[] = {0,0};

		for(int i=0; i<n;i++)
		{
			/* print the evenCount and oddCount without using if-else */

			result[arr[i]%2]++;


			//			if(arr[i]%2 == 0)
			//				evenCount++; // res[0] = evenCount; 
			//			else
			//				oddCount++; // res[1] = oddCount;
		}

		//int result[] = new int[] {evenCount,oddCount};

		//String result = ""+ evenCount + " and "+  oddCount;

		return result; //return res;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " numbers ");
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}

		int[] res = countEvenOdd(arr,n);

		System.out.println("No of even and odd count are "+ res[0] + " and " + res[1]);

	}

}
