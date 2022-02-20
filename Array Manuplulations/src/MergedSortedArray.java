import java.util.*;
public class MergedSortedArray {
	
	static int[] isShortAndMergeSorted(int arr1[], int arr2[],int n)
	{
		int arr[] = new int[n+n];
		
		//System.arraycopy(arr1, 0, arr, 0, n);
		//System.arraycopy(arr2, 0, arr, n, n+n);
		
		for(int i =0; i<n; i++)
		{
			arr[i] = arr1[i];
		}
		
		for(int i=0; i<n; i++)
		{
			arr[i+n] = arr2[i];
		}
		
		int res[] =  isSortArray(arr);
		
		return res;
	}
	
	
	static int[] isShortAndMergeSortedII(int a[], int b[],int n)
	{
		int c[] = new int[a.length+b.length];
		
		int i =0, j=0, k=0;
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++] = a[i++];
			}
			else
			{
				c[k++] = b[j++];
			}
		}
		
		while(i<a.length)
		{
			c[k++] = a[i++];
			
		}
		
		while(j<b.length)
		{
			c[k++] = b[j++];
			
		}
		
		return c;
		
				
	}
	
	
	static int[] isSortArray(int sort[])
	{
		
		for(int i= 0 ; i<sort.length; i++)
		{
			for(int j=i+1; j<sort.length; j++)
			{
				if(sort[i]>sort[j])
				{
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;			
				}
			}
		
		}
		
		return sort;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		
		System.out.println("Enter 1st array " + n + " elements ");
		for(int i =0; i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		
		int arr2[] = new int[n]; 
		
		System.out.println("Enter 2nd array " + n + " elements ");
		for(int i =0; i<n; i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		//Arrays.sort(arr1);
		//Arrays.sort(arr2);
		
		
		
		int res1[] = isSortArray(arr1);
		
		int res2[] = isSortArray(arr2);
		
		int result[] = isShortAndMergeSortedII(res1, res2, n);
		
		System.out.println("Sorted order of sorted-merged array becomes ");
		
		for(int i = 0; i<result.length;i++)
		{
			System.out.print(result[i] + " ");
		}
		
	}

}
