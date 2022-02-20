/* Longest Arithmetic SubArray Length
 *  [5,2,3,4,5,8,4] ==> [2,3,4,5] -- subarray length = 3  */


public class LongestArithmeticSubArray {
	
	static int toCalculateLongestSubArray(int[] arr)
	{
		
		int diff[] = new int[arr.length];
		
		for(int i =0; i<arr.length-1;i++)
		{
			diff[i] = arr[i+1] - arr[i];
	
		}
		
		int count = 0;
		
		for(int i =0; i<diff.length-1;i++)
		{
			if(diff[i] == diff[i+1])
			{
				count++;
			}
		}
		
		return count;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5,2,3,4,5,6,7}; // [-3,1,1,1,1,1]
		
		 int res = toCalculateLongestSubArray(arr);
		 
		 System.out.println(res);
		

	}

}
