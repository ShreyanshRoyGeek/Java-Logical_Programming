import java.util.*;
public class DeleteIndex {

	static int[] toDelete(int arr1[], int x)
	{
		int arr[] = new int[arr1.length-1];
		
		for(int i = 0, k=0; i<arr1.length;i++)
		{
			if(i == x) 
			{
				continue;
			}
				
			
			else
				arr[k++] = arr1[i];
			
		}

		/* ---- 2nd Method (Without creating new array)---- */
		
//		for(int i =x; i<arr.length-1;i++)
//		{
//			arr[i] = arr[i+1]; 
//		}
//		arr[arr.length-1] = 0;
//		
//		return arr;
		
		
		return arr;
	}
	
	static int[] toAdd(int arr1[], int k, int x)
	{
		int arr[] = new int[arr1.length+1];
		
		
		
		int j = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			if(i == k)
			{
				arr[i] = x;
				
			}
			
			else
				arr[i] = arr1[j++];
			    
			
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter " + n + " elements ");
		for(int i =0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the index to add ");
		int x = sc.nextInt();
		
		System.out.println("Enter the data to add ");
		int y = sc.nextInt();
		
		int res[] = toAdd(arr, x,y);
		
		
		for(int i = 0; i<res.length;i++)
		{
			System.out.print(res[i] + " ");
		}

	}

}
