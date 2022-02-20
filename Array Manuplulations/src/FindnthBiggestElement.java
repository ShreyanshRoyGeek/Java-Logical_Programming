import java.util.Scanner;

public class FindnthBiggestElement {
	
	static int[] toSort(int arr[])
	{
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
					
			}
		}
		
		
		return arr;
	}
	
	static int nthBiggest(int arr[], int x)
	{
		for(int i =0; i<arr.length; i++)
		{
			int count = 1;
			for(int j=0; j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					count++;
				}	
			}
			
			if(count == x)
			   return arr[i];
		
		}
		return -1;
		
		
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
		
		
		System.out.println("Enter the bigest index number ");
		int big = sc.nextInt();
		
		
		int result = nthBiggest(arr1,big);
		
		System.out.println("The " + big + "th biggest number is "+ result);
		
		
		/* --- 2nd Method using sorting approach --- */
		
		
//		int res[] = toSort(arr1);
//		
//		for(int i =0; i<res.length;i++)
//		{
//			System.out.print(res [i]+ " ");
//		}		
//		System.out.println("The " + big + "th biggest number is ");
//		System.out.println(res[n-big]);
		

	}

}
