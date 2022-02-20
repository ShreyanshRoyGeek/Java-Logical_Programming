import java.util.Scanner;

public class EvenOddCount {
	
	void demo()
	{
		System.out.println(" for demo");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of values you want to read ");
		int n = sc.nextInt();
		
		/* --
		int []arr,arr1;
		arr[0] = 1; arr1[0] = 2;
		System.out.println(arr);
		 -- */
		int[] arr = new int[n];
		
		System.out.println("Enter the "+ n + " values ");
		for(int i =0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int countEven = 0 , countOdd = 0;
		
		for(int i= 0; i<n;i++)
		{
			if(arr[i]%2 == 0)
				
				countEven++;
			
			else
				countOdd++;
		}
		
		System.out.println("The number od EvenCount are " + countEven);
		System.out.println("The number od OddCount are " + countOdd);
		
		
	}

}
