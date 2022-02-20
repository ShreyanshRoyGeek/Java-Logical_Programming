
import java.util.Scanner;

public class LeftRotate {
	
	
	
	public static void main(String[] args) {
		
		int i,j,start = 0;
		
		// print the actual array
		
		int arr[] = new int[] {1,2,3,4,5};
		
		int[] arr2 = {2,3,5};
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// rotate the  first n number element
		
		System.out.println("Enter the element to rotate ");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		
		int n;
		
		n = sc.nextInt();
		
		for(i=0;i<n;i++) 
		{
			start = arr[0];
			
			for(j=0;j<arr.length-1;j++)
			{	
				
				
				arr[j] = arr[j+1];
			}
			
			arr[j] = start;
			
		}
		
		System.out.println();
		
		
		// print the rotated array
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
			
		}
		
	}

}
