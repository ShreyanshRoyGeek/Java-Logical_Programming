import java.util.*;

public class InsertingArrayIntoAnother {

	static int[] toInsertArrayIntoAnother(int arr1[],int arr2[], int k)
	{
		int arr[] = new int[arr1.length];
		
		int j=0;
		for(int i=k; i<arr1.length;i++)
		{	
			
			arr[j++] = arr1[i];	
		}
		
		int m = 0; j=0;
		for(int i = k; i<arr1.length;i++)
		{
			while(j<arr2.length)
			{
				arr1[i++] = arr2[j++];
			}
			
			
			arr1[i] = arr[m++];
		
			
		}
	
		
		return arr1;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr1[] = new int[2*n];



		System.out.println("Enter " + n + " elements of 1st array ");

		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}

		int arr2[] = new int[n];

		System.out.println("Enter " + n + " elements of 2nd array ");

		for(int i=0; i<n; i++)
		{
			arr2[i] = sc.nextInt();
		}


		System.out.println("Enter the index where you want to add ");
		
		int x = sc.nextInt();
		

		int res[] = toInsertArrayIntoAnother(arr1,arr2,x);
		
		for(int i=0; i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}

	}
}
