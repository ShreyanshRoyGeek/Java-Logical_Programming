import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the value of n");
		
		int n = sc.nextInt();
		
		
		int arr[] = new int[n];
		
		int arr1[] = new int[n];
		
		for(int i =0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			
			
			
		}
		
		
		for(int i =1; i<arr.length; i++)
		{
			
			arr1[i] = arr[i-1]*10 + arr[i];
			System.out.println(arr1[i]);

		}
		
		Integer x =31;
		Integer y =35;
		
		System.out.println(x.compareTo(y));
	
		
		int sum =0;
		
		for(int i =1; i<arr1.length; i++)
		{
			
			//int sum2 = Integer.parseInt("arr[i-1] + arr[i]");
			sum = sum + arr1[i];	
			
		}
		
		System.out.println("Actual result is "+sum);
	
	}

}
