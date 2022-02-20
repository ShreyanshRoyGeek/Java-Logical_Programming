import java.util.Scanner;
public class CopiedArray {
	
	static int[] toCopyArray(int arr1[])
	{
		int arr[] = new int[arr1.length];
		
		for(int i=0,m=0; i<arr1.length ;i++)
		{
			arr[m++] = arr1[i];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr1[] = new int[n];

		System.out.println("Enter " + n + " elements array ");

		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		
		int[] res = toCopyArray(arr1);
		
		for(int i = 0; i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}
		
	

	}

}
