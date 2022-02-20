import java.util.Scanner;

public class CommonElement {
	
	static int[] commonElement(int arr1[],int arr2[])
	{
		int count[] = new int[arr1.length];
		
		
		for(int i=0,m=0; i<arr1.length;i++,m++)
		{
			for(int j =0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					count[m] = arr2[j];
				}
			}
					
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr1[] = new int[n];

		int arr2[] = new int[n+2];



		System.out.println("Enter " + n + " elements of 1st array ");

		for(int i=0; i<n; i++)
		{
			arr1[i] = sc.nextInt();
		}


		System.out.println("Enter " + n + " elements of 2nd array ");

		for(int i=0; i<n; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int res[] = commonElement(arr1,arr2);
		
		for(int i = 0; i<res.length;i++)
		{
			if(res[i] == 0) {}
			
			else
			   System.out.print(res[i] + " ");
			
		}


	}

}
