import java.util.Scanner;
public class Merge {
	
	static int[] isMerge(int arr1[], int arr2[],int n)
	{
		int arr[] = new int[2*n];
		
		
		
		for(int i=0; i<arr1.length; i++)
		{
			arr[i] = arr1[i];
			
		}
		
		
		for(int i = 0; i< arr2.length; i++ )
		{
			arr[i+ n] = arr2[i];
			
		}
	
		
		return arr;
		
//		for(int i =0; i<arr.length;i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
		
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
		
		//isMerge(arr1, arr2,n);
		
		//int[] res = new int[2*n];
		
		int res[] = isMerge(arr1, arr2,n);
		
		
		for(int i = 0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
		
		
		//res = isMerge(arr1, arr2,n);
		
		
		
		

	}

}
