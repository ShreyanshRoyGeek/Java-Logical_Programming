import java.util.Scanner;

public class ArrayCountMethod {
	
	
	static int howManyPrime(int arr[],int n)
	{
		int count=0;
		
		for(int i=0; i<n;i++)
		{
			boolean res = isprime(arr[i]);
			
			if(res == true)
			{
				count++;
			}
			
		}
		return count;
			
	}	
		
		static boolean isprime(int x)
		{
			if(x == 1)
			{
				return false;
			}
			
			else
			{
				for(int j=2; j<=x/2; j++)
				{
					if(x%j == 0) 
					{
						return false;
					}
				}
			}
			return true;
		}		
		
		
		
//		for(int i = 0; i<n; i++) 
//		{
//			if(arr[i] == 1)
//			{
//				
//			}
//			
//			else if(arr[i] == 2)
//			{
//				count++;
//			}
//			
//			else 
//			{
//				
//				for(int j=2; j<arr[i]; j++)
//				{
//					if(arr[i]%j == 0) 
//					{
//						break;
//					}
//						
//					else
//					{
//						count++;
//					}
//						
//				}
//			}
//			
//		}
//		
//		return count;
		
	

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter " + n + " elements");
		for(int i=0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int res = howManyPrime(arr, n);
		
		System.out.println("No of prime is "+ res);

	}

}
