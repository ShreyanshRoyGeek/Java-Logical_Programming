
public class ClosetPairFromTwoSortedArray {
	
	
	static String toCalculateClostedPair(int[] arr1, int[] arr2, int sum)
	{
		
		int i = 0;
		int j = arr2.length-1;
		
		while(i<arr1.length-1 && j>=0)
		{
			
			if(arr1[i]+arr2[j] == sum)
			{
				return arr1[i]+ " " + arr2[j];
			}
			
			else if(arr1[i]+ arr2[j]> sum)
			{
				j--;
			}
			
			
			else
			{
				i++;
			}
			
		}
		
		return arr1[i] + " "+ arr2[j];
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[] {1,2,3,4,5};
		
		int[] arr2 = new int[] {6,7,8,9,10};
		
		int sum = 14;
		
		String s = toCalculateClostedPair(arr1, arr2,sum);
		
		System.out.println(s);
		
		
		
		
		

	}

}
