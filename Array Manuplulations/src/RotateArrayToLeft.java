import java.util.Scanner;

public class RotateArrayToLeft {
	
	static int[] Rotate(int arr1[], int d)
	{
		int arr[] = new int[arr1.length];
		
		int j = 0;
		
		for(int i=d; i<arr.length; i++)
		{
			arr[j]=arr1[i];
			j++;
		}
		
		for(int i=0; i<d; i++)
		{
		     arr[j] = arr1[i];
		     j++;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
			int n = sc.nextInt();
			
			int arr1[] = new int[n];
			
			for(int i = 0; i<n; i++)
			{
				arr1[i] = sc.nextInt();
			}
			
			int d = sc.nextInt();
			
			int res[] = Rotate(arr1,d);	
			
			for(int i=0; i<n; i++)
			{
				System.out.print(res[i] + " ");
			}

			

	}

}
