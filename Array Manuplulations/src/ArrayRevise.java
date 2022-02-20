import java.util.Scanner;

public class ArrayRevise {
	
	static boolean isPrime(int x)
	{
		for(int i=2; i<=x/2; i++)
		{
			if(x%i == 0)
				return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the dimension of array");
		int n = sc.nextInt();
		
		int arr[]  = new int[n];
		
		// For taking i/p of array
		System.out.println("Enter the " + n + "elements of array");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		// For diplaying the array
		System.out.println("Array elements are ");
		for(int i=0; i<arr.length;i++)
		{
			boolean res = isPrime(arr[i]);
			
			if(res == true)
			{
				System.out.print(arr[i] + " ");
			}
		}
		
		
		
		

	}

}
