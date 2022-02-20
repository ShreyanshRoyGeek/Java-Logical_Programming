import java.util.Scanner;

public class CompareEqualOrNot {
	
	
	static boolean  toCompare(int arr1[], int arr2[]) 
	{
		if(arr1.length== arr2.length)
		{
			for(int i =0; i<arr1.length; i++)  // (|| j<arr2.length)
			{
				if(arr1[i] == arr2[i])
					return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of 1st array ");
		int n = sc.nextInt();

		int arr1[] = new int[n];

		System.out.println("Enter " + n + " elements of 1st array ");

		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the size of 2nd array");
		int m = sc.nextInt();

		int arr2[] = new int[m];

		System.out.println("Enter " + m + " elements of 2nd array ");

		for(int i=0; i<n; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		
		boolean res = toCompare(arr1,arr2);
		
		if(res == true)
			System.out.println("Two array are equals");
		else
			System.out.println("Two array are not equals");
		
		
	}

}
