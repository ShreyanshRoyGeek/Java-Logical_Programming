import java.util.*;

public class MergeArrayZigZag {
	
	static int[] isMergeUsingRandomZigZag(int arr1[], int arr2[], int n)
	{
		int arr[] = new int[n+n];
		
		Random re = new Random(); 
		
		
		for(int i=0; i<n; i++)
		{
			int x = re.nextInt(n);

			arr[i] = arr1[x];	
		}
		
		for(int i=0; i<n; i++)
		{
			int y = re.nextInt(n);
			
			arr[n+i] =  arr2[y];
		}
		
		
		return arr;
		
	}
	
	
	
	static int[] isMergeZigZag(int arr1[], int arr2[], int n)
	{
		int arr[] = new int[n+n];
		
		int i =0,j =0;
		while(i<arr1.length&& i<arr2.length)
		{
			arr[j] = arr1[i];
			j++;
			
			arr[j] = arr2[i];
			j++;
			i++;
		}
		
		while(i<arr1.length)
		{
			arr[j] = arr1[i];
			j++;
			i++;
			
		}
		
		while(i<arr2.length)
		{
			arr[j] = arr2[i];
			j++;
			i++;
			
		}
		
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
		
		//isMerge(arr1, arr2,n);
		
		//int[] res = new int[2*n];
		
		int res[] = isMergeZigZag(arr1, arr2,n);
		
		
		for(int i = 0; i<res.length; i++)
		{
			System.out.print(res[i] + " ");
		}
		
		
		
		

	}


	

}
