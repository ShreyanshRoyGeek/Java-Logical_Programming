package GoogleKickstart;

public class SubArrayAndSubString {
	
	static void toCalculateAllPossibleSubArray(int[] arr)
	{
		int count =0;
		
		// for picking start point
		for(int i =0; i<arr.length;i++)
		{
			// for picking end point
			for(int j=i; j<arr.length;j++)
			{
				// for printing the elements b/w start and end point
				for(int k =i;k<=j;k++)
				{
					System.out.print(arr[k]+ " ");
					
				}
				
				System.out.println();
				count++;
			}
			
			
		}
		
		
		// Total number of sub-array  for given array --> n*(n+1)/2
		System.out.println("\nTotal number of sub-array for given array are "+count+ "\n");  
			
	}
	
	
	static void toCalculateAllPossibleSubString(String str)
	{
		
		System.out.println("Possible substrings are --- ");
		
		for(int i =0; i<str.length();i++)
		{
			for(int j =i; j<str.length();j++)
			{
				
				for(int k =i; k<=j;k++)
				{
					System.out.print(str.charAt(k)+ " ");
				}
				
				System.out.println();
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4};
		
		toCalculateAllPossibleSubArray(arr);
		
		String str = "Ram";
	
		toCalculateAllPossibleSubString(str);
		
		

	}

}
