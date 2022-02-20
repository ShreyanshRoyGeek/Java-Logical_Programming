import java.util.*;
public class MergedUsingLibrary {

	static int[] isMerge(int arr1[], int arr2[],int n)
	{
		int fis = arr1.length;
		int sal = arr2.length;
		
		int arr[] = new int[n+n];

		System.arraycopy(arr1, 0, arr, 0, arr1.length );
		System.arraycopy(arr2, 0, arr, arr1.length, arr2.length);

		Arrays.sort(arr);
		
		return arr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr1[] = new int[n];

		System.out.println("Enter 1st array " + n + " elements ");
		for(int i=0; i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}

		int arr2[] = new int[n];

		System.out.println("Enter 2nd array " + n + " elements ");
		for(int i=0; i<n;i++)
		{
			arr2[i] = sc.nextInt();
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int[] res = isMerge(arr1, arr2, n);

		System.out.println("Sorted order of sorted-merged array becomes ");

		for(int i = 0; i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}




	}

}
