
public class Number {
	
	public static int max(int arr[],int n) {
	
		                                                                       
		int max = arr[0];
		
		for(int j=1; j<n; j++) 
		{
			if(arr[j]> max)
			
			   max = arr[j];
			   
		}
		
		System.out.println("Maximum element is " +max);
		
		return max;
	
	}
	
	public static int min(int arr[],int n)
	{
		int min = arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(arr[i]<min)
			
				min = arr[i];
			
		}
		
		System.out.println("Minimum element is "+min);
		
		return min;
	}
	
	public static void main(String[] args)
	
	{
		int arr[] = {1,2,3,4,5};
		
		
		int r =max(arr,5);

		int s = min(arr,5);
	
			
	}
	

}
